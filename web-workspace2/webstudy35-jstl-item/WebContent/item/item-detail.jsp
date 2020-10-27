<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table class="table table-hover table-bordered detailTable">
	<tr>
		<th>No</th>
		<td>${requestScope.item.itemNo}</td>
	</tr>
	<tr>
		<th>Name</th>
		<td>${requestScope.item.name}</td>
	</tr>
	<tr> 
		<th>maker</th>
		<td>${requestScope.item.maker}</td>
	</tr>
	<tr>
		<th>Price</th>
		<td>${requestScope.item.pirce}</td>
	</tr>
	<tr>
		<th>Detail</th>
		<td><pre>${requestScope.item.detail}</pre></td>
	</tr>

</table>