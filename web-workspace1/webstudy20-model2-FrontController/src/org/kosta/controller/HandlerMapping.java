package org.kosta.controller;

/*
 * 컨트롤러 객체의 생성을 전담하는 Factory(공장) 클래스
 *  : 시스템 상에서 하나만 존재하면 되므로 Singleton pattern을 적용해 단 한번 생성되고, 이를 여러 곳에서 공유해서 사용할 수 있도록 한다.
 */
public class HandlerMapping {
	private static HandlerMapping instance = new HandlerMapping();

	private HandlerMapping() {
	}

	public static HandlerMapping getInstance() {
		return instance;
	}

	public Controller create(String command) {
		Controller controller = null;
		if(command.equals("TotalCountContoller")) {
			controller = new TotalCountContoller();
		}else if(command.equals("FindProductByIdController")) {
			controller = new FindProductByIdController();
		}else if(command.equals("getallproductlist")) {
			controller = new ProductListController();
		}else if(command.equals("getmakerproductlist")) {
			controller = new MakerProductListController();
		}else if(command.equals("findproductlistbymaker")) {
			controller = new FindMakerProductListController();
		}else if(command.equals("registerproduct")) {
			controller = new RegisterProductController();
		}
		return controller;
	}
}
