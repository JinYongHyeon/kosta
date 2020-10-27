package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 개별 컨트롤럴 로직을 담당하는 객체들이 구션해야 하는 인터페이스 사용하는 측에게 단일한 방법으로 개별 컨트롤러 
 * 객체를 실행되도록 표준화하는 역할을 한다.
 */
public interface Controller {
	
	public String execute(HttpServletRequest request,HttpServletResponse response)throws Exception;
	
}
