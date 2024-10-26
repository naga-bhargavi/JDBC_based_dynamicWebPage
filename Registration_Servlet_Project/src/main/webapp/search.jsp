<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	<style>
		body{
				background-image: url("./images/about.jpg");
				background-size: cover;
				background-repeat: no-repeat;
			}
			#nav{
			padding-top:3%;	
			text-align: right;
		}
		a{
		
			text-decoration: none;
			font-size:20px;
			color:white;
			margin-right:40px;
			}
		#container{
			margin-top: 100px;
			text-align: center;
			
		}
		h3{
			color:white;
			margin-top: 50px;
		}
		input{
			background-color: #b088f1;
			border: 1px solid #b088f1;
			border-radius: 5px;
		}
		
</style>
<body>
		<div id="nav">
			<a href="home.jsp" >Home</a>
			<a href="about.jsp">Aboutus</a>
			<a href="search.jsp" style="border:2px solid #0db2f1;padding:10px;border-radius:10%;color:#0db2f1">Search</a>
			<a href="update.jsp">Update</a>
			<a href="delete.jsp">Delete</a>
			<a href="logout.html">Logout</a>
		</div>

		<% String name=(String)session.getAttribute("statement"); %>
		
		<div id="container">
				
					<form action="searchForm" method="post">
						<input type="email" name="semail" placeholder="Enter email to search " length = "70%" required style="width:400px;height:30px"> <input type="submit" value="search" style="height:33px">
					</form>
				
					<h3><%=name  %></h3>
			
		</div>
		
		
</body>
</html>