package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;

public interface Controller {
	public String execute(HttpServletRequest request, HttpServletResponse response)throws Exception;
}
