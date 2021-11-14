<%@page import="bean.KhachHangBean"%>
<%@page import="bo.KhachHangBo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String un= request.getParameter("txtusername");
String pass = request.getParameter("txtpwd");
 KhachHangBo khbo= new KhachHangBo();
 KhachHangBean kh = khbo.KiemTra(un, pass);
 if(kh!=null){
	 session.setAttribute("kh", kh);
	 //session.setAttribute("kt", (long)1);
	 response.sendRedirect("NhaSach.jsp?kt=1&ht="+kh.getHoten());
 }else{
	 session.setAttribute("kt", (long)0);
	 response.sendRedirect("NhaSach.jsp?kt=0");
 }
 
%>
</body>
</html>