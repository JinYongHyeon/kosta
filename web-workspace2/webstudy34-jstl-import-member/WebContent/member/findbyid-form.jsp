<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- 
	findbyid-form-jsp
		   |
	  FindMemberByIdController	   
		   |
	  findbyid-fail.jsp 에서는 alert 후 home으로 이동(해당 파일로 forward)
	       or
	  findbyid-ok.jsp에서는 layout이 적용되어야 함
 --%>
<form action="front">
	<input type="hidden" name="command" value="findMemberById">
	<span>아이디 </span><input type="text" name="id" required="required" placeholder="아이디를 입력하세요">
	<input type="submit" value="검색">
</form>