package org.kosta.controller;

public class HandlerMapping {
	private static  HandlerMapping instance = new HandlerMapping();
	private HandlerMapping() {}
	public static HandlerMapping getInstance() {
		return instance;
	}
	public Controller create(String command) {
		Controller controller = null;
		if(command.equals("findMemberById")) {
			controller = new FindMemeberByIdController();
		}else if(command.equals("getAddressKind")) {
			controller = new GetAddressKindController();
		}else if(command.equals("addressList")) {
			controller = new AddressListController();
		}else if(command.equals("home")) {
			controller = new HomeController();
		}else if(command.equals("findbyid")) {
			controller = new FindMemeberByIdController();
		}else if(command.equals("login")) {
			controller = new LoginController();
		}else if(command.equals("logout")) {
			controller = new Logoutcontroller();
		}
		return controller;
	}
}
