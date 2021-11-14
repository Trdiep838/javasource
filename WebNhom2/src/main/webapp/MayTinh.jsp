<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 MÁY TÍNH
<%=session.getAttribute("alo") %>
<%
    String[] ds=(String[])request.getAttribute("ds");
    for(String t: ds)
    	out.print(t+"<hr>");
    long kq=(long)0;
    if(request.getAttribute("kq")!=null)
    	kq=(long)request.getAttribute("kq");
%>

<form action="testController" method="post">
   a= <input name="txta" value=" <%=(request.getAttribute("tama")==null?"0":request.getAttribute("tama"))%>" type="number"> <br>
   b= <input name="txtb" value="0" type="number"> <br>
   Ket qua: <%=kq %><br>
  <input name="butcong" type="submit" value="+"> 
   <input name="buttru" type="submit" value="-"> 
    <input name="butnhan" type="submit" value="*"> 
     <input name="butchia" type="submit" value="/"> 
 </form>

</form>
</body>
</html>