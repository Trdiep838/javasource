<%@page import="bo.GioHangBo"%>
<%@page import="bean.KhachHangBean"%>
<%@page import="bean.sachbean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bo.sachbo"%>
<%@page import="bean.loaibean"%>
<%@page import="bo.loaibo"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
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
<title>Insert title here</title>
</head>
<body>

<%
    request.setCharacterEncoding("utf-8");
    response.setCharacterEncoding("utf-8");
    ArrayList<sachbean> ds=( ArrayList<sachbean>)request.getAttribute("dssach");
	 ArrayList<loaibean> dsloai=( ArrayList<loaibean>)request.getAttribute("dsloai");
		int size = 0;
		if (session.getAttribute("giohang") != null) {
			GioHangBo ghbo = new GioHangBo();

			ghbo = (GioHangBo) session.getAttribute("giohang");

			size = ghbo.ds.size();
		}

%> 
        <div class="container-fuild">
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<a class="navbar-brand" href="HtSachController">Trang chủ</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active"><a class="nav-link" href="giohangController">Giỏ hàng <span class="badge badge-light rounded-circle"></span> <span
							class="sr-only">unread messages</span>
					</a></li>
					<li class="nav-item"><a class="nav-link" href="ThanhToanController">ThanhToán</a></li>

					<li class="nav-item"><a class="nav-link"
						href="LichSuController">Lịch sử mua hàng</a></li>
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
  <li class="nav-item"><a class="nav-link" href="DangKiController">Đăng ký</a></li>

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
          <form class="form-horizontal" action="dangnhapcontroller" method="POST">
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
 
          <br> </div>
 
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
				<td valign="top" width="150">
						<table class="table">
						 <c:forEach items="${dsloai}" var="Loai"> 
						<tr>
							<td><a href="HtSachController?ml=${Loai.getMaloai()}">${Loai.getTenloai()}</a><br>
							</td>
						</tr>
					</c:forEach>
					
					</table>
				</td>
				<td width="700">
					<table class="table">
						<tr>
							<h4>
								<%
								int n = ds.size();
								%>
								Có
								<%=n%>
								cuốn sách
							</h4>
							<td>
							<td>
								<div class="container">
									<div class="row">
										<%
										for (int i = 0; i < n; i++) {
										    sachbean s = ds.get(i);
										%>
										<div class="col-4 my-3">
											<a
											 href="giohangController?order=<%=true%>&ms=<%=s.getMasach()%>&ts=<%=s.getTensach()%>&tg=<%=s.getTacgia()%>&gia=<%=s.getGia()%>&anh=<%=s.getAnh()%>">			
											</a>
											<div class="">
											<img src=<%=s.getAnh() %>>
												<p><%=s.getTensach()%></p>
												<p>
													<%=s.getTacgia()%>
												</p>
												<p><%=s.getGia()%>
													đ
												</p>
												<a
													 href="giohangController?order=<%=true%>&ms=<%=s.getMasach()%>&ts=<%=s.getTensach()%>&tg=<%=s.getTacgia()%>&gia=<%=s.getGia()%>&anh=<%=s.getAnh()%>">
													  <img src="giohang.jpg">
													
												</a>
											</div>
										</div>
										<%
										}
										%>
									</div>
								</div>
							</td>
						</tr>
					</table>

				</td>
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