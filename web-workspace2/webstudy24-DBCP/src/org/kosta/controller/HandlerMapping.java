package org.kosta.controller;

import sun.security.jca.GetInstance;

/*
 * 컨트롤러 객체 생성을 전담하는 Factory 객체
 * DispatcherServlet 과 Controller들과의 결합도를 낮추는 역할
 */
public class HandlerMapping {
	private static HandlerMapping  instance = new HandlerMapping ();
	
	private HandlerMapping () {}
	
	public static HandlerMapping  getInstance() {
		return instance;
	}
	
	public Controller create(String command) {
		Controller controller = null;
		if(command.contentEquals("findCarByNo")) {
			controller = new FindCarByNoController();
		}else if(command.contentEquals("getAllCarList")) {
			controller = new GetAllCarListController();
		}
		return controller;
	}

}
