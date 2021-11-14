<%@page import="bean.loaibean"%>
<%@page import="bean.sachbean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.KhachHangBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">NHÀ SÁCH MINH KHAI</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Trang chủ</a></li>
      <li class="dropdown"><a href="htgio.jsp">Giỏ Hàng</a></li>
      <li class="dropdown"><a href="#">Thanh toán</a></li>
      <li class="dropdown"><a href="#">Lịch sử mua hàng</a></li>
    </ul>
    
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Đăng ký</a></li>
      <%
        KhachHangBean kh=(KhachHangBean)session.getAttribute("kh");
        if(kh!=null){
      %>
        <li><a href="#"">Xin chào: <%=kh.getHoten()%></a></li>
      <%}else{ %>
       <li><a href="#" data-toggle="modal" data-target="#myModal"><span class="glyphicon glyphicon-log-in"></span> Đăng nhập</a></li>
   <%  if(request.getAttribute("kt")!=null){%>
               <script>alert('Đăng nhập sai');</script>
      
      <%}
      } %>
    </ul>
   </div>
</nav> 
<div class="modal fade" id="myModal">
	<div class="modal-dialog modal-sm">
		<div class="modal-content">
		
		<!-- Modal Header -->
		<div class="modal-header">
		 <h4 class="modal-title"> Thông tin đăng nhập</h4> 
		 <button type="button" class="close" data-dismiss="modal">&times;</button>
		</div>
		
		<!-- Modal body -->
		<div class="modal-body">
			<form method="get" action="dangnhapcontroller">
			 Tên đăng nhập: <input type="text" name="txtuser" class="form-control"> <br>
			 Mật khẩu: <input type="password" name="txtpass" class="form-control"> <br>
			 <input type="submit" name="butok" value="Đăng Nhập" class="btn-primary">
			 </form>
		 </div> 
		</div>
	</div>
</div>
    
     
<% request.setCharacterEncoding("utf-8");
   response.setCharacterEncoding("utf-8");
   ArrayList<sachbean> ds=(ArrayList<sachbean>)request.getAttribute("dssach");
	ArrayList<loaibean> dsloai=(ArrayList<loaibean>)request.getAttribute("dsloai");
   
   long dem=(long) 0;
   if(request.getAttribute("dem")!=null)
		 dem= (long)request.getAttribute("dem");
   %>

<table align="center" cellspacing="0" width="1500">
  
  <tr>
     <td valign="top" width="200">
        <table class="table table-hover">
        <%for(loaibean loai: dsloai) {%>
        <tr>
           <td>
              <a href="HtSachController?ml=<%=loai.getMaloai()%>">
                 <%=loai.getTenloai() %>
              </a>
           </td>
       </tr>
        <%} %>
        </table>
</td>
      <td width="600">
         <table class="table table-hover">
         <%
            int n=ds.size();
         for(int i=0;i<n;i++){
            sachbean s=ds.get(i);
         %>
        	 <tr>
        	 <td>
        	     <img src=<%=s.getAnh() %>><br>
        	     <a href="htgio.jsp?ms=<%=s.getMasach()%>&ts=<%=s.getTensach()%>&tg=<%=s.getTacgia()%>&gia=<%=s.getGia()%>"> <img src="mua.jpg"></a> <br>
        	     Tên sách: <%=s.getTensach() %> <br>
        	     Tác giả: <%=s.getTacgia() %> <br>
        	     Giá sách: <%=s.getGia() %> <br>
        	 </td>
        	 <%i++;
        	 if(i<n){
        	 s=ds.get(i);
        	 %>
        	 <td>
        	     <img src=<%=s.getAnh() %>><br>
        	     <a href="htgio.jsp?ms=<%=s.getMasach()%>&ts=<%=s.getTensach()%>&tg=<%=s.getTacgia()%>&gia=<%=s.getGia()%>"> <img src="mua.jpg"></a> <br>
        	     Tên sách: <%=s.getTensach() %> <br>
        	     Tác giả: <%=s.getTacgia() %> <br>
        	     Giá sách: <%=s.getGia() %> <br>
        	 </td>
        	  <%} %>
        	  <%i++;
        	 if(i<n){
        	 s=ds.get(i);
        	 %>
        	 <td>
        	     <img src=<%=s.getAnh() %>><br>
        	     <a href="htgio.jsp?ms=<%=s.getMasach()%>&ts=<%=s.getTensach()%>&tg=<%=s.getTacgia()%>&gia=<%=s.getGia()%>"> <img src="mua.jpg"></a> <br>
        	     Tên sách: <%=s.getTensach() %> <br>
        	     Tác giả: <%=s.getTacgia() %> <br>
        	     Giá sách: <%=s.getGia() %> <br>
        	 </td>
        	  <%} %>
 			 </tr>
      <%   }
         %>
         </table>
         <hr>
         Số sách : <%=dem %>
         
     <td valign="top"> 
     <form action="HtSachController" method="post">
		  			<input type="text" name="txttk" placeholder="Nhập sách cần tìm">
		  			<input type="submit" name="tim" value="Tìm Kiếm"  class="btn btn-primary">
		  		</form>
	</td>
  </table>  
</body>
</html>