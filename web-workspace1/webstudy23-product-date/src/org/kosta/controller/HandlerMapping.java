package org.kosta.controller;

/**
 * Factory 객체 : 컨트롤러 객체 생성을 전담
 * @author yonghyeon
 *
 */
public class HandlerMapping {
	
	private static HandlerMapping instance = new HandlerMapping();
	
	private HandlerMapping() {}
	
	public static HandlerMapping getInstance() {
		return instance;
		
	}
	
	public Controller create(String command) {
		Controller controller = null;
		if(command.equals("register")) {
			controller = new RegisterProductController();
		}else if(command.equals("list")) {
			controller = new ProductListController();
		}else if(command.equals("detailproduct")) {
			controller = new ProductDetailController();
		}
		return controller;
	}
}
