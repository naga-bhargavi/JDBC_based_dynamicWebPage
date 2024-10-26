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
				background-image: url("./images/lock.jpg");
				background-size: cover;
				background-repeat: no-repeat;
			}
			input{
			background-color: #d087f4;
			border:1px solid #d087f4;
			
		}
		
		#container{
			
			display : grid;
			gap:5px;
			grid-template-columns: 28% 30% 28%;
			grid-template-rows: 100px auto;
			grid-template-areas: "id11 id22 id33";
			justify-content: center;
		}
		#id2{
			margin-top:150px;
		}
		#id22{
			
			padding:50px;
			background-color:  rgba(161,4,238,0.6084558823529411);
			border-radius: 8px;
			font-weight: bold;
			
		}
		#nav{
			
			padding-top:3%;	
			text-align: right;
		}
		a{
		
			text-decoration: none;
			font-size:25px;
			color:black;
			margin-right:40px;
			
		}
		
</style>
<body>
	<div id="nav">
			<a href="Register.jsp">Register</a>
			<a href="Login.jsp" style="border:2px solid #0db2f1;padding:10px;border-radius:10%">Login</a>
	</div>
	<div id="container">
	
		<div id="id1" style="grid-area: id11;"></div>
		<div id="id2" style="grid-area: id22;">
			<center> <h1>Login</h1></center>
			<form action="loginForm"method="post" id="id22">
			Email : <input type="email" name="email1" placeholder="Ex : john@gmail.com" required><br><br>
			Password : <input type="password" name="pass1" placeholder="Enter password" required><br><br>
			
			<center><input type="submit" value="Login" style="width:250px;height:35px;font-weight: bold"></center>
			
		</form>			
		</div>
		<div id="id3" style="grid-area: id33;"></div>
	</div>
	
</body>
</html>




