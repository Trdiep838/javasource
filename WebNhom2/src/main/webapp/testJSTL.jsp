<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


     <c:forEach items="${dsloai}" var="L"> 
 Mã loại:          ${L.getMaloai() } 
 Tên loại          ${L.getTenloai() } 
           <hr>
     </c:forEach>
     
     <c:forEach items="${dssach}" var="S"> 
 Mã sách:          ${S.getAnh() } 
 Tên sách:          ${S.getTensach() } 
  <img src="${S.getAnh() }" />
           <hr>
     </c:forEach>
</body>
</html>