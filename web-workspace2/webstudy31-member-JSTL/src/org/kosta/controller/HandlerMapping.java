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
		}
		return controller;
	}
}
