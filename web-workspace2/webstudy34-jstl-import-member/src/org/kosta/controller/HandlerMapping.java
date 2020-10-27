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
		}else if(command.equals("findMemberByIdForm")) {
			controller = new FindMemberByIdFormController();
		}else if(command.equals("findMemberById")) {
			controller = new FindMemberByIdController();
		}else if(command.equals("registerForm")) {
			controller = new RegisterFormController();
		}else if(command.equals("register")) {
			controller = new RegisterController();
		}else if(command.equals("registerResult")) {
			controller = new RegisterResultController();
		}else if(command.equals("login")) {
			controller = new LoginController();
		}else if(command.equals("logout")) {
			controller = new LogoutController();
		}else if(command.equals("updateForm")) {
			controller =  new UpdateFormController();
		}else if(command.equals("updateMember")) {
			controller = new UpdateMemberController();
		}else if(command.equals("updateMemberResult")) {
			controller  = new UpdateMemberResultController();
		}
		return controller;
	}
}
