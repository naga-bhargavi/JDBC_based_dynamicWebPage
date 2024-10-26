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
				background-image: url("./images/delete.jpg");
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
			font-weight: bold;
			
		}
		#container{
			margin-top: 200px;
			text-align: center;
		}
		
	</style>
<body>
		<div id="nav">
			<a href="home.jsp" >Home</a>
			<a href="about.jsp" >Aboutus</a>
			<a href="search.jsp">Search</a>
			<a href="update.jsp" >Update</a>
			<a href="delete.jsp" style="border:2px solid #9276f2;padding:10px;border-radius:10%;color:#9276f2">Delete</a>
			<a href="logout.html">Logout</a>
		</div>

		<div id="container">
			<form action="deleteForm" method="post">
			<input type="email" name="demail" placeholder="Enter email" required style="width:300px;height:30px;border:2px solid #9276f2;background-color: #9276f2;border-radius: 5px;"> 
			<input type="submit" value="Delete" style="height:38px;border:2px solid #9276f2;background-color: #9276f2;border-radius: 5px;">
			
		</form>
		</div>
</body>
</html>