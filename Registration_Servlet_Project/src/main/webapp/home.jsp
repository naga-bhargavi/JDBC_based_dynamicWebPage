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
				background-image: url("./images/home.jpg");
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
			color:white;
			text-align: center;
		}
	
		
</style>
<body>
		
		<div id="nav">
			<a href="home.jsp" style="border:2px solid #0db2f1;padding:10px;border-radius:10%;color:#0db2f1">Home</a>
			<a href="about.jsp">Aboutus</a>
			<a href="search.jsp">Search</a>
			<a href="update.jsp">Update</a>
			<a href="delete.jsp">Delete</a>
			<a href="logout.html">Logout</a>
		</div>
		<div id="container">
			<h1 style="font-size: 100px"> Hello <%= (String)session.getAttribute("myname") %></h1>
			
			<marquee direction="right"  scrollamount="25">
				<h3 style="font-size: 50px">WelCome to the Home Page....</h3>
			</marquee>
			
		</div>
</body>
</html>