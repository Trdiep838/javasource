<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Vidu BootStrap</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<form method="post" action="Test.jsp">
             n: <input type="text" name="txtn" class="form-control"> <br>
            <input type="submit" name="but1" value="Tong"">
          </form>
  <%String tamn=request.getParameter("txtn");
          if(session.getAttribute("ss")==null)//Chua tao bien session
              session.setAttribute("ss", (long)0);
            if(tamn!=null){
            	//b1: gan gia tri cua bien session ra bien
            	  long s=(long)session.getAttribute("ss");
       	//b2: xu ly bien
            	s=s+ Long.parseLong(tamn);
            	//b3: Luu lai bien session
            	session.setAttribute("ss", s);
            	
            }
          %>
          Tong: <%=session.getAttribute("ss") %>
</body>
</html>