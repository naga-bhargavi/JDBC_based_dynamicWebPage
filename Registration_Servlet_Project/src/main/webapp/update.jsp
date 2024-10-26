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
				background-image: url("./images/update.jpg");
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
			margin-top: 200px;
			text-align: center;
		}
		input{
			height: 25px;
			width:400px;
			border:2px solid #d48ff6;
			background-color: #d48ff6;
			border-radius: 5px;
		}
</style>
<body>
		
		<div id="nav">
			<a href="home.jsp" >Home</a>
			<a href="about.jsp" >Aboutus</a>
			<a href="search.jsp">Search</a>
			<a href="update.jsp" style="border:2px solid #0db2f1;padding:10px;border-radius:10%;color:#0db2f1">Update</a>
			<a href="delete.jsp">Delete</a>
			<a href="logout.html">Logout</a>
		</div>
		<div id="container">
			<h1 style="color:red"></h1>
			<form action="updateForm" method="post">
						
						<input type="email" name="uemail" placeholder="Enter email" required> 
						<select name="listvalue" required style="height:30px;border:2px solid #d48ff6;background-color: #d48ff6;border-radius: 5px;"> 
							<option> -- Select --</option>
							<option> First Name</option>
							<option> Last name</option>
							<option> Email</option>
							<option> Password</option>
							<option> Age</option>
							<option> Date Of Birth</option>
							<option> Gender</option>
							<option> Country</option>
							<option> State</option>
							<option> City</option>
						</select>
						<input type="text" name="changevalue" placeholder="Enter the updated value" required>
						<br>
						<br>
						<input type="submit" value="Update">
					</form>
		</div>
					
</body>
</html>




