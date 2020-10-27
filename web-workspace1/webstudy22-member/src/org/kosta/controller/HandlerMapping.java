package org.kosta.controller;

public class HandlerMapping {
	private static HandlerMapping instance = new HandlerMapping();

	private HandlerMapping() {
	}

	public static HandlerMapping getInstance() {
		return instance;
	}

	public Controller create(String command) {
		Controller controller = null;
		if(command.equals("findMemberById")) {
			controller = new FindMemberByIdController();
		}else if(command.equals("login")) {
			controller = new LoginController();
		}else if(command.equals("logout")) {
			controller = new LogoutController();
		}else if(command.equals("updateMember")) {
			controller = new UpdateMemberController();
		}else if(command.equals("register")) {
			controller = new RegisterController();
		}else if(command.equals("findMemberByIdCheck")) {
			controller = new FindMemberByIdCheckController();
		}

		return controller;
	}
}
