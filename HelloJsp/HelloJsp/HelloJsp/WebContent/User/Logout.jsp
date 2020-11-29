<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%
	response.sendRedirect("/HelloJsp/Hello.jsp");
	Cookie cookie = new Cookie("ten","Name");
	cookie.setMaxAge(5);
	response.addCookie(cookie);
%>