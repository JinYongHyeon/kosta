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
		}else if(command.equals("login")) {
			controller = new LoginController();
		}else if(command.equals("logout")) {
			controller = new LogoutController();
		}else if(command.equals("detailItem")) {
			controller = new DetailItemController();
		}else if(command.equals("RegisterItemForm")) {
			controller = new RegisterItemFormController();
		}else if(command.equals("RegisterItem")) {
			controller = new RegisterItemController();
		}
			
		return controller;
	}
}
