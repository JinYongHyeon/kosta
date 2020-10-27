package org.kosta.controller;

public class HandlerMapping {
	private static HandlerMapping instatnce = new HandlerMapping();

	private HandlerMapping() {
	}

	public static HandlerMapping getInstance() {
		return instatnce;
	}

	public Controller create(String command) {
		Controller controller = null;

		if (command.equals("getAllPostList")) {
			controller = new GetAllPostListController();
		}else if(command.equals("login")) {
			controller = new LoginController();
		}else if(command.equals("logout")) {
			controller = new LogoutController();
		}else if(command.equals("getPostDetail")) {
			controller = new GetPostDetailController();
		}else if(command.equals("deletePost")) {
			controller = new DeletePostController();
		}else if(command.equals("updatePostForm")) {
			controller = new UpdatePostFormController();
		}else if(command.equals("updatePost")) {
			controller = new UpdatePostController();
		}else if(command.equals("writePostFrom")) {
			controller = new WritePostFromController();
		}else if(command.equals("writePost")) {
			controller = new WritePostController();
		}
		 	

		return controller;
	}
}
