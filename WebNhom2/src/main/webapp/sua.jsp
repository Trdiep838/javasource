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
String ms= request.getParameter("ms");
String sl = request.getParameter("txtsl");
if(ms!=null){
	GioHangBo gh = (GioHangBo)session.getAttribute("gh");
	if(request.getParameter("btnXoa")!=null)
		gh.Xoa(ms);
	if(request.getParameter("btnSua")!=null)
		gh.Them(ms, "", "", (long)0, Long.parseLong(sl));
	session.setAttribute("gh", gh);
	response.sendRedirect("htgio.jsp");
}
%>
</body>
</html>