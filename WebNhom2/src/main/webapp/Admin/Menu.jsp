<%@page import="bo.ChiTietHoaDonBo"%>
<%@page import="bean.ChiTietHoaDonBean"%>
<%@page import="bean.KhachHangBean"%>
<%@page import="bean.sachbean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bo.GioHangBo"%>
<%@page import="bean.loaibean"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">  <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

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
<title>Admin</title>
</head>
<body>

        <div class="container-fuild">
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<a class="navbar-brand" href="SachController">Quản lý sách</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active"><a class="nav-link" href="LoaiController">Quản lý loại <span class="badge badge-light rounded-circle"></span> <span
							class="sr-only">unread messages</span>
					</a></li>
					<li class="nav-item"><a class="nav-link" href="HoaDonController">Quản lý hóa đơn</a></li>

					<li class="nav-item"><a class="nav-link"
						href="KhachHangController">Quản lý khách hàng</a></li>
				</ul>
      <ul class="nav navbar-nav navbar-right">
  <%
  KhachHangBean kh = (KhachHangBean) session.getAttribute("auth");
	int flagAuth;
	if (kh != null) {
	%>
	<li class="nav-item"><a class="nav-link" href="profile">Chào mừng <%=kh.getHoten() %></a></li>
	<form action="dangnhapcontroller?logout=<%=true%>" method="POST">
		<li class="nav-item">
		<button class="nav-link btn btn-sm btn-outline-secondary" href="dangnhapcontroller">Đăng xuất</button></li>
	</form>
	<%
	} else {
	if (session.getAttribute("flag_auth") == null) {
		flagAuth = 0;
	} else {
		flagAuth = (int) session.getAttribute("flag_auth");
	}

	if (flagAuth == 1) {
	%>
	<script>
		alert('Thông tin tài khoản không chính xác');
	</script>
	<%
	}
 %>   
  	<li class="nav-item "><a class="btn btn-sm btn-outline-secondary nav-link"
						data-target="#myModal" data-toggle="modal">Đăng nhập</a></li>
  <li class="nav-item"><a class="nav-link" href="signup">Đăng ký</a></li>
  <%} %>
  </ul>
</div>
  </nav>
  <!-- The Modal -->
		<div class="modal" id="myModal">
			<div class="modal-dialog">
				<div class="modal-content rounded-8 shadow">

					<!-- Modal Header -->
					<div class="modal-header p-3 ">
					<h2 class="fw-bold mb-0">Đăng nhập</h2><button type="button" class="close" data-dismiss="modal">&times;</button>
					</div>
  
      <!-- Modal content-->
      <div class="modal-content"><br>
          <form class="form-horizontal" action="dangNhapAdminController" method="POST">
         <div class="form-group">
      <label class="control-label col-sm-2" for="username">Username:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="username" placeholder="User name" name="txtusername">
      </div>
    </div>

    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Password:</label>
      <div class="col-sm-10">          
        <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="txtpwd">
      </div>
    </div>
		<input name="Dangnhap" type="submit" value="Đăng nhập">
   </form> <br> </div>
    </div>
   </div>
   </div>

<form>    
<div class="input-group mb-3">
        <input type="text" class="form-control" placeholder="Từ khóa" name="txttk">
        <span class="input-group-btn">
          <div class="input-group-append">
    <button class="btn btn-success" type="submit">Tìm kiếm</button>
  </div>
        </span>
      </div> 
      </form>
<table class="table">
			<tr>
				<td valign="top" width="80">
					<table class="table">
					<form action="themSachController	">
					 <button class="btn btn-success" type="submit">Thêm sách</button>
					</form>
			
					</table>
				</td>
				<td width="900">
					<table class="table">
						  <h2 style="text-align:center">DANH SÁCH SÁCH TRONG CỬA HÀNG</h2> 
						  <table > 
    
					<tr><th>Ảnh</th>	<th>Tên sách</th><th>Mã sách</th><th>Tác giả</th>
                </tr> 
		
	 <c:forEach items="${dssach}" var="L"> 
	  <td> <img src="${L.getAnh()}"/> </td>
         <td>  ${L.getTensach() } </td>
 <td>  ${L.getMaloai() } </td> <td>   ${L.getTacgia() } </td>
 <td> <form action="SachController">
					 <button class="btn btn-success" type="submit" name="btnXoa">Xóa</button></td>
					<td>  <button class="btn btn-success" type="submit" name="btnSua">Sửa</button>
					</form></td>
 </tr>
     </c:forEach>	
   
	</table>
	
	</table>
	</table>

				
	</div>
	<!-- jQuery library -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

	<!-- Popper JS -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

	<!-- Latest compiled JavaScript -->
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
      
</body>
</html>