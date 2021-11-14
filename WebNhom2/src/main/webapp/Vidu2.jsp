<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>vidu bootst rap</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<style>
</style>
<body>
<nav class="navbar navbar-inverse">
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Trang chủ</a></li>
      <li><a href="#">Giỏ hàng</a></li>
      <li><a href="#">Thanh toán</a></li>
      <li><a href="#">Lịch sử mua hàng</a></li>
    </ul> 
    
    <ul class="nav navbar-nav navbar-right">
      <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Đăng ký tài khoản</button> <h4>
       <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Đăng ký tài khoản</h4>
        </div>
        <div class="modal-body">
          <p>
                 <form class="form-horizontal" action="/action_page.php">
         <div class="form-group">
      <label class="control-label col-sm-2" for="username">User Name:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="username" placeholder="User name" name="username">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Email:</label>
      <div class="col-sm-10">
        <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Password:</label>
      <div class="col-sm-10">          
        <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Giới tính:</label>
      <div class="col-sm-10">          
       <input name="gioitinh" type="radio" value="Nam" />Nam
       <input name="gioitinh" type="radio" value="Nữ" />Nữ
      </div>
    </div>
     <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Ngày sinh:</label>
       <div class="col-sm-10">          
        <input name="Name" type="date">
       </div>
       </div> 
    <div class="form-group">
     
      <div class="col-sm-10">      
     </div>    

          <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Đăng ký</button>
        </div>
        </div> 
    </ul>
    </nav>
<div class="container">
  <h3><i>
   <marquee direction="right">Xin chào!!!!</marquee></i>
  </h3>
</div>

</body>
</html>