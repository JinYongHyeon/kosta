package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Controller Interface
 *  ->계층구조 형성을 통한 다형성 적용
 *  ->결합도를 낮추어 유지보수성 향상 (DispatcherServlet과 개별 컨트롤러 객체 간 응집도 결합도)
 * @author yonghyeon
 *
 */
public interface Controller {
	public String execute(HttpServletRequest request,HttpServletResponse response)throws Exception;
}
