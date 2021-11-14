<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>bảng cửu chương</title>
</head>
<body>
<div class="container">
  <h2>BẢNG CỬU CHƯƠNG</h2>
  <form method="post">
   Cửu chương số: <input name="txtn" value="0" type="number"> <br>
   <button name="butnhan" type="submit" class="btn btn-danger" value="*">Submit</button>
    </form>         
  <table class="table table-striped">
    <thead>
    </thead>
    <tbody>
    <%String tamn= request.getParameter("txtn");
    if(tamn!=null){
    	Long n= Long.parseLong(tamn);
    	if(request.getParameter("butnhan")!=null){
    		for(int i=1;i<=10;i++){%>
        <tr> <td><%=n%> x <%=i %> = <%=n*i%></td></tr>
       <%}%> <%}%> <%}%>
    </tbody>
  </table>
</div>

<hr>
</body>
</html>