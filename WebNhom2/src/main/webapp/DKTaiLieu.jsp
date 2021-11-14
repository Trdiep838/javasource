<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}
tr:nth-child(even) {
  background-color: Red;
}
</style>
<head>
<meta charset="utf-8">
<title>Đăng kí tài liệu</title>
</head>
<body>

<h2 style="background-color:lightblue;color:White; ">ĐĂNG KÝ</h2>
* Đăng kí nhanh qua Facebook<br>
 <input type="submit" style="background-color:DarkSlateBlue;color:White;font-size:200%;"  value="Login with Facebook"> 
	<p style="color:LightSeaGreen;">Đăng kí mới bằng tài khoản tailieu.vn</p>
Bạn cần kích hoạt tài khoản qua Email sau khi đăng ký để nhận ngay 50 ePoints thưởng từ TaiLieu.VN
<form action="https://tailieu.vn/">
<hr>
<input  type="text" name="username" placeholder="Nhập username"> <input type="text" placeholder="Nhập Họ và tên"> <br><br>
<input  type="text" placeholder="Nhập mật khẩu"> 
              <select name="s1">
                 <option>Giới tính</option>
                 <option>Nam </option>
                <option>Nữ </option>
              </select>
	<br><br>
   <input type="text" placeholder="Nhập lại mật khẩu"> <select name="ngaysinh">
                 <option>Ngày sinh</option>
                 <option>1</option> <option>2</option><option>3</option> <option>4</option>
                 <option>5</option> <option>6</option> <option>7</option> <option>8</option> <option>9</option> <option>10</option>
                 
              </select> <select name="Thang">
              <option>Tháng</option>
                       <option>1</option> <option>2</option><option>3</option> <option>4</option>
                 <option>5</option> <option>6</option> <option>7</option> <option>8</option> <option>9</option> <option>10</option>
              </select>
              <select name="Năm">
              <option>Năm</option>
                    <option>2021</option> <option>2020</option><option>2019</option> <option>2018</option>
                 <option>2017</option> <option>2016</option> <option>2015</option> <option>2014</option> <option>2013</option> <option>2012</option>
              </select>
   <br><br>
  <input  type="email" placeholder="Nhập địa chỉ email"> <select name="s3">
                 <option>Tỉnh/TP</option>
                 <option>Thừa Thiên Huế</option>
                <option>Hà Nội</option>
                 <option>TPHCM</option>
                <option>Đà Nẵng</option>
                 <option>Quảng Trị</option>
              </select>
  <br><br>
   <input type="email" placeholder="Nhập lại địa chỉ email"> <input type="text" placeholder="Nhập mã xác nhận">
  <br><br>
<b>
   <input type="submit" style="	background-color:#33CCFF ;
    text-align: center;
    height: 40px;
  	width: 80px;
  	color: white;  
  	border: 1px solid #33CCFF;
  border-radius: 8px;" value="Đăng ký"></b>
  <input type="checkbox" id="vehicle3" name="vehicle3" value="Boat">
  <label for="vehicle3"> Tôi đồng ý với các chính sách và thỏa thuận sử dụng của TaiLieu.vn</label>
	<hr>
	<p style="color:LightSeaGreen;">Bạn đã có tài khoản TaiLieu.VN?Đăng nhập</p>
</form>
 <table  style="width:50%">
  <tr>
    <th>Thưởng 50 ePoints khi đăng ký mới
	Tặng 5 ePoints cho mỗi lượt chia sẻ Facebook</th>
    <th>Xem và Tải trên 1 Triệu Tài Liệu miễn phí

Kết nối 5 Triệu Thành Viên TaiLieu.VN</th>
    <th>Kết bạn với TaiLieu.VN trên Facebook để nhận link download miễn phí 100 tài liệu HOT mỗi ngày</th>
  </tr>

</table>
</body>
</html>