package org.kosta.controller;

public class HandlerMapping {
	private static  HandlerMapping instance = new HandlerMapping();
	private HandlerMapping() {}
	public static HandlerMapping getInstance() {
		return instance;
	}
	public Controller create(String command) {
		Controller controller = null;
		if(command.equals("home")) {
			controller = new HomeController();
		}else if(command.equals("itemRegisterForm")) {
			controller = new ItemRegisterFromController();
		}else if(command.equals("FindItemFrom")) {
			controller = new FindItemFromController();
		}else if(command.equals("FindItem")) {
			controller = new FindItemController();
		}else if(command.equals("ItemRegister")) {
			controller = new ItemRegisterController();
		}else if(command.equals("ItemRegisterResult")) {
			controller = new ItemRegisterResultController();
		}
		return controller;
	}
}
