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
				background-image: url("./images/search.jpg");
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
			color:black;
			margin-right:40px;
			font-weight: bold;
			
		}
		#container{
			
			display : grid;
			gap:10px;
			grid-template-columns: 30% 60% ;
			grid-template-areas: "id11 id22";
			justify-content: center;
			margin-top: 50px;
		}
		img{
			border-radius: 15px;
		}
		h2{
		 	font-size: 30px;
		 	
		}
		h6{
			font-size: 20px;
			
		}
		#id2{
			padding:20px;
			background-color: rgba(161,111,242,0.4964110644257703);
		}
</style>
<body>
	<div id="nav">
			<a href="home.jsp" >Home</a>
			<a href="about.jsp" style="border:2px solid #0db2f1;padding:10px;border-radius:10%;color:#0db2f1">Aboutus</a>
			<a href="search.jsp">Search</a>
			<a href="update.jsp">Update</a>
			<a href="delete.jsp">Delete</a>
			<a href="logout.html">Logout</a>
		</div>
		
		<div id="container">
			<div id="id1" style="grid-area:id11;">
				<center> <img alt="" src="./images/girl.jpg" width="60%" height="60%"></center>
			
				
			</div>
			<div id="id2" style="grid-area:id22;" >
				<h2>About</h2>
				<h6>Java Full Stack Development refers to the development of both front-end (client-side)
				 and back-end (server-side) parts of a web application.A full-stack developer is a person who can develop
				  application's backend and frontend. 
				Java full-stack is basically a term used for a web developer that uses Java to develop the entire 
				technology stack is referred to as Java full stack developer. This Java Full Stack Developer course is designed 
				to introduce you to front-end, middleware, and back-end Java web developement technologies.</h6>
			</div>
		
		</div>
</body>
</html>