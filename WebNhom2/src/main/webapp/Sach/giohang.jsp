<%@page import="bean.KhachHangBean"%>
<%@page import="bo.loaibo"%>
<%@page import="bo.sachbo"%>
<%@page import="bean.sachbean"%>
<%@page import="bean.loaibean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.GioHangBean"%>
<%@page import="bo.GioHangBo"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

<%
	
	
ArrayList<GioHangBean> ghbean = new ArrayList<GioHangBean>();
String ms = request.getParameter("ms");
String ts = request.getParameter("ts");
String tg=request.getParameter("tg");
String giatam= request.getParameter("gia");


if(ms!=null){//lam them tat ca truong hop null
	GioHangBo gh =null;
	if(session.getAttribute("gh")==null){
		gh = new GioHangBo();
		session.setAttribute("gh", gh);
	}
	//b1: luu session vao bien
	gh=(GioHangBo)session.getAttribute("gh");
	gh.Them(ms, ts, tg, Long.parseLong(giatam), (long)1);//b2 thay doi bien
	session.setAttribute("gh", gh); //b3 luu bien vao session
	response.sendRedirect("htgio.jsp");
}
%>
<%=ms %>;<%=ts %>;<%=tg %>
Giỏ hàng của bạn 
<br>
<% %>

 




</body>
</html>