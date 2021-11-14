
<%@page import="bean.SinhVienBean"%>
<%@page import="bean.Khoabean"%>
<%@page import="bo.Khoabo"%>
<%@page import="bo.SinhVienbo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Trang chu</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
 <style>
    /* Set height of the grid so .sidenav can be 100% (adjust if needed) */
    .row.content {height: 1500px}
    
    /* Set gray background color and 100% height */
    .sidenav {
      background-color: #f1f1f1;
      height: 100%;
    }
    
    /* Set black background color, white text and some padding */
    footer {
      background-color: #555;
      color: white;
      padding: 15px;
    }
    
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height: auto;} 
    }
  </style>

<body>
	<% Khoabo  kbo =new Khoabo(); %>
<%SinhVienbo svbo = new SinhVienbo(); 
	ArrayList<SinhVienBean> ds = svbo.getsinhvien();
	String mk=request.getParameter("mk");
	String key= request.getParameter("txttk");
	if(mk!=null) ds=svbo.TimKiem(mk);
	else if(key!=null) ds = svbo.TimChung(key);
	
	
%>

<div class="container-fluid">
  <div class="row content">
    <div class="col-sm-3 sidenav">
      <h4>Quản lý sinh viên</h4>
      <ul class="nav nav-pills nav-stacked">
 
         <%for(Khoabean k: kbo.getkhoa()){ %>
     <a href="trangchu.jsp?mk=<%=k.getMakhoa() %>"><%=k.getTenkhoa() %></a> <hr>
          <%}  %> 
        
      </ul><br>
    
    </div>

    <div class="col-sm-9">
      <h4><small>Thông tin tất cả sinh viên</small></h4>
      <hr>
   
	
	<table >
	<tr>
	<td valign="top" width="600" >
	<% for(SinhVienBean sv: ds){ %>
 	Sinh viên: <%=sv.getHoten() %>  &emsp; &emsp; &emsp;
	Điểm trung bình: <%=sv.getDtb() %> 
		Địa chỉ:<%=sv.getDiachi() %> 
	<br>
	<%} %>
	<hr>
	

	</td>
	<td valign="top" width="200">
	Tìm kiếm
	 <form >
       <div class="input-group">
     <%String a=request.getParameter("txttk"); %>
	    <input name="txttk" type="text" value="<%=(a==null?"0":a) %>" class="form-control" placeholder="Tìm kiếm">
	<br>
		<input name="TimKiem" type="submit" value="Tìm kiếm"> 


	</div>
     </form>
	
	 </td>
	 <td>
	 
	 </td>
	</tr>
	</table>
	
</div>

</body>
</html>