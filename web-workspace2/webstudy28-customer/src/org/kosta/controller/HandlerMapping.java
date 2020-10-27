package org.kosta.controller;

public class HandlerMapping {
	private static HandlerMapping instance = new HandlerMapping();

	private HandlerMapping() {
	}

	public static HandlerMapping getInHandlerMapping() {
		return instance;
	}

	public Controller create(String command) {
		Controller controller = null;
		if (command.contentEquals("login")) {
			controller = new LoginController();
		} else if (command.contentEquals("join")) {
			controller = new JoinController();
		} else if (command.contentEquals("count")) {
			controller = new CountController();
		} else if(command.contentEquals("idCheck")) {
			controller = new IdCheckController();
		}else if(command.contentEquals("logout")) {
			controller = new LoutOutController();
		}

		return controller;
	}
}
