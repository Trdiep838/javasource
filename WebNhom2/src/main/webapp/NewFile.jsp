<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
 <%=session.getAttribute("alo") %>
<%
    String[] ds=(String[])request.getAttribute("ds");
    for(String t: ds)
    	out.print(t+"<hr>");
%>
<a href="tc.jsp?lt=tg"> Tin the gioi</a> <br>
 4. Viết mã lệnh bằng java:
 <% for(int i = 1;i<=10;i++){
	 out.print(i);
	 out.print("<hr>");
 }
 %>
 <table cellspacing="0" width="1000px" align="center">
  <tr>
     <td colspan="3" bgcolor="blue"> Menu </td>
  </tr>
   <tr>
     <td width="200" valign="top" bgcolor="gray"> 
     
        <a href="t1.jsp"> Mở trang 1 </a><hr>
         <a href="http://docbao.vn"> doc bao</a><hr>
         <a href="jsp.ppt"> tai bai giang</a><hr>
      </td>
<td width="600"> 
          <Marquee direction ="up">
             <img src="b4.jpg">
         </Marquee>
          Noi dung <hr><hr>Noi dung<hr>Noi dung<hr><hr>Noi dung<hr><hr>Noi dung<hr>
          
           </td>
<td width="200" valign="top" bgcolor="red"> 
          <form action="t1.jsp" method="post">
            Username: <input type="text" name="txtun" value="abc"> <br>
            pass: <input type="password" name="txtpass" value="abc"> <br>
            <input type="submit" name="but1" value="login">
              gui file: <input type="file" name="txtpass" value="abc"> <br>
              Gioi tinh: <input type="radio" name="txtpass" value="abc"> <br>
              ngay sinh: <input type="date" name
="txtpass" value="abc"> <br>
              email: <input type="email" name="txtpass" value="abc"> <br>
              Chon quyen:
              <select name="s1">
                 <option>admin</option>
                 <option>user </option>
                 <option>khách</option>
              </select>
              <textarea rows="20" cols="5">go noi dung</textarea>
          </form>
</td>
  </tr>
   <tr>
     <td colspan="3"> Ban quyen: ..... </td>
  </tr>
  </table>
  <hr>

</body>
</html>