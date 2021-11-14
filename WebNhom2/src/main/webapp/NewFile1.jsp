<%@page import="java.util.Calendar"%>
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head> 
<meta charset="utf-8">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Xổ số kiến thiết</title>
<style>
table{
	width: 70%;
	border-collapse: collapse;
	 border: 1px solid black;
}
td {
  text-align: center;
}
</style>
</head>
<body>

<%
	Calendar c= Calendar.getInstance();// lay ngayg gio he thong
int ngay=c.get(Calendar.DAY_OF_MONTH);//Lay ngay
int thang=c.get(Calendar.MONTH)+1;//Lay thang: 0..11
int nam=c.get(Calendar.YEAR);//Lay nam
%>
<div align="right">
 Hôm nay, ngày <%=ngay %> tháng <%=thang %> năm <%=nam %>
</div>
Chọn ngày:
    <select name="sngay">
    <%for(int i=1;i<=31;i++){ %>
    <option value="<%=i%>" <%=((i==ngay)?" selected":"")%>> <%=i %> </option>
  <% }%>
    </select>
     Tháng
    <select name="sthang">
    <%for(int i=1;i<=12;i++){ %>
       <option value="<%=i%>" <%=((i==thang)?" selected":"")%>> <%=i %> </option>
  <% }%>
    </select>
   Năm 
   <select name="snam">
   <%for(int i=nam;i>=nam-10;i--){ %>
        <option value="<%=i%>" <%=((i==nam)?" selected":"")%>> <%=i %> </option>
  <% }%>
   </select>
    <button type="button" onclick="tai_lai_trang()">Chon</button>
<script>
        function tai_lai_trang(){
            location.reload();
        }
    </script>
<b><div align="center">
XỔ SỐ KIẾN THIẾT
<br>
</div>
</b>
<%
Random rd = new Random();
int g88 = rd.nextInt();
int rd1s = rd.nextInt(10);
int g8 = rd.nextInt(100 - 10)+ 10;
int g7 = rd.nextInt(1000 -100) + 100;
int g61 = rd.nextInt(10000 - 1000 )+ 1000;
int g62 = rd.nextInt(10000 - 1000)+1000;
int g63 = rd.nextInt(10000 - 1000)+1000;
int g5 = rd.nextInt(10000 - 1000)+1000;

int db = rd.nextInt(1000000 - 100000) + 100000;
%>

<table class="table table-bordered">
<tr>
	<td>  </td>
	<td>  </td>
	<th> Đầu   </th>
	<th> Đuôi </th>
</tr>
<tr>
	<td> G8 </td>
	<td> <%=g8 %> </td>
	<td> dg8  </td>
	<td> duoig8 </td>
</tr>
<tr>
	<td> G7 </td>
	<td> <%=g7 %> </td>
	<td> dg7  </td>
	<td> duoig7 </td>
</tr>
<tr>
	<td> G6 </td>
	<td> <%=g61 %> &emsp;  <%=g62 %> &emsp; <%=g63 %> </td>
	<td> đầu  </td>
	<td> đuôi </td>
</tr>
<tr>
	<td> G5 </td>
	<td> <%=g5%> </td>
	<td> đầu  </td>
	<td> đuôi </td>
</tr>
<tr>
	<td> G4 </td>
	<td > <%
	for(int i = 1;i<=7;i++){
		int rd1 = rd.nextInt(100000-10000) + 10000;%>
		<%=rd1 %> 
		  &emsp;&emsp;
	<% }%>  
	</td>
	<td> đầu  </td>
	<td> đuôi </td>
</tr>
<tr>
	<td> G3 </td>
	<td>   <%
	for(int i = 1;i<=2;i++){
		int rd1 = rd.nextInt(100000-10000) + 10000;%>
		<%=rd1 %> 
	  &emsp;
	<% }%> </td>
	<td> đầu  </td>
	<td> đuôi </td>
</tr>
<tr>
	<td> G2 </td>
	<td> <% int rd0 = rd.nextInt(100000-10000) + 10000;%>
	<%=rd0 %>  </td>
	<td> đầu  </td>
	<td> đuôi </td>
</tr>
<tr>
	<td> G1 </td>
	<td> <% int rd1 = rd.nextInt(100000-10000) + 10000;%>
	<%=rd1 %> </td>
	<th> đầu  </th>
	<th> đuôi </th>
</tr>
<tr>
	<td> ĐB </td>
	<td> <%=db %> </td>
	<th> đầu  </th>
	<th> đuôi </th>
</tr>



</table>

</body>
</html>