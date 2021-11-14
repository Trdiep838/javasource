<%@page import="java.util.ArrayList"%>
<%@page import="bean.SinhVienBean"%>
<%@page import="bean.Khoabean"%>
<%@page import="bo.Khoabo"%>
<%@page import="bo.SinhVienbo"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Hiển thị</title>
</head>
<body>
<% Khoabo  kbo =new Khoabo(); %>
<%SinhVienbo svbo = new SinhVienbo(); 
	ArrayList<SinhVienBean> ds = svbo.getsinhvien();
%>
<table align="center" cellspacing="0" width="1000">
  
  <tr> <td colspan="3"> Menu </td></tr>
  <tr>
     <td valign="top" width="200"> 
   <%for(Khoabean k: kbo.getkhoa()){ %>
         <a href="hienthikhoa.jsp?mk=<%=k.getMakhoa() %>"> <%=k.getTenkhoa() %></a> <hr>
          <%}  %>  
          
     </td>
     <td valign="top" width="500"> Nhập thông tin Tìm kiếm 
     <form >
     <%String a=request.getParameter("txta"); %>
     <input name="txta" value="<%=(a==null?"0":a) %>"  type=" "> <br>
		
	<input name="TimKiem" type="submit" value="Tìm kiếm"> 
	<br>
	<% svbo.TimChung(a); %>
	<% for(SinhVienBean svb: svbo.TimChung(a)){ %>
	Sinh viên: 	<%=svb.getHoten() %>
	Địa chỉ:  <%=svb.getDiachi() %> 
	 <br>
	<%}%>
     </form>
     
     </td>
     </tr>
     <tr >
        <%for(SinhVienBean sv: svbo.getsinhvien()){ %>
  <td valign="top" width="200"> <%=sv.getMakhoa() %> </td>
	<td valign="top" width="200">  <%=sv.getMasv() %> </td>
 	 <td> <%=sv.getHoten() %> </td>
      <td> <%=sv.getDiachi() %></td>
  
      </tr>
          <%} %>
       
     
     
     
    
  </table>
</body>
</html>