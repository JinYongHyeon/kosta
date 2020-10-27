package controller;

public class HandlerMapping {
	// 싱글톤
	private static HandlerMapping instance = new HandlerMapping();

	private HandlerMapping() {
	}

	public static HandlerMapping getInstance() {
		return instance;
	}

	public Controller create(String command) {
		Controller c = null;
		if (command.trim().equals("LoginCheck")) {
			c = new LoginCheckController();
		} else if (command.trim().equals("ListNotice")) {
			c = new ListNoticeController();
		} else if (command.trim().equals("FindNotice")) {
			c = new FindNoticeController();
		} else if (command.trim().equals("NoticeInsert")) {
			c = new NoticeInsertController();
		}
		return c;
	}
}
