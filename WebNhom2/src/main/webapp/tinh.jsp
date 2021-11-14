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
   String tama= request.getParameter("txta");//Lay ve gia tri cua txta
   String tamb= request.getParameter("txtb");//Lay ve gia tri cua txtb
   Long kq=(long)0;
   if(tama!=null&&tamb!=null){
	   Long a= Long.parseLong(tama);//Doi chuoi a sang so
	   Long b= Long.parseLong(tamb);
	   if(request.getParameter("butcong")!=null)
	   {   kq=a+b;
	   out.print("Ket qua: "+ kq.toString());}
	   else if(request.getParameter("buttru")!=null){
		   kq=a-b;
	   out.print("Ket qua: "+ kq.toString());}
	   else  if(request.getParameter("butnhan")!=null)
	   { kq=a*b;
	   out.print("Ket qua: "+ kq.toString());}
	   else  if(request.getParameter("butchia")!=null)
	   {   float kqc=a/b;
	   out.print("Ket qua: "+ kqc);}
   }
   
%>
</body>
</html>