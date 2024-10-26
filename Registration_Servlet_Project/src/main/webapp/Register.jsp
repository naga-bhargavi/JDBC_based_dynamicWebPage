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
				background-image: url('./images/register.jpg');
				background-repeat: no-repeat;
				background-size: cover; 
								
		}
		input,select{
			background-color: #d087f4;
			border:1px solid #d087f4;
			
		}
		
		#container{
			
			display : grid;
			gap:5px;
			grid-template-columns: 10% 40% 40%;
			grid-template-rows: ;
			grid-template-areas: "id11 id22 id33";
			justify-content: center;
		}
		#id22{
			
			padding:30px;
			background-color: rgba(208,135,244,0.3535539215686274);
			border-radius: 8px;
			
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
			<a href="Register.jsp" style="border:2px solid #0db2f1;padding:10px;border-radius:10%">Register</a>
			<a href="Login.jsp" >Login</a>
	</div>
	
	<div id="container">
			
		<div id="id1" style="grid-area: id11;"></div>
		<div id="id2" style="grid-area: id22;">
		
			<center> <h2>Registration</h2></center>
			<form action="registerForm"method="post" id="id22">
				
				First Name : <input type="text" name="fname1" placeholder="Ex : John" required><br><br>
				Last Name : <input type="text" name="lname1" placeholder="Ex : Deo" required><br><br>
				Email : <input type="email" name="email1" placeholder="Ex : john@gmail.com" required><br><br>
				Password : <input type="password" name="pass1" placeholder="Enter password" required><br><br>
				Confirm Password : <input type="password" name="pass2" placeholder="ReEnter password" required><br><br>
				Age : <input type="number" name="age1" placeholder="20" required><br><br>
				Gender : <input type="radio" name="gender1" value="female" style="background-color: red">  Female <input type="radio" name="gender1" value="male"> Male <input type="radio" name="gender1" value="others"> Others <br><br>
				Date of Birth : <input type="date" name="dob1" required><br><br>
				Country : <select name="country1" required >
							<option> -- Select --</option>
							<option>India</option>
							<option>USA</option>
							<option>China</option>
							<option>Australia</option>
							<option>Japan</option>
							<option>Africa</option>
						</select><br><br>
				State : <input type="text" name="state1" placeholder="Enter state" required><br><br>
				city : <input type="text" name="city1" placeholder="Enter city" required><br><br><br>
				<center><input type="submit" value="Register" style="width:300px;height:30px"></center>
				
			</form>
		</div>
		<div id="id3" style="grid-area: id33;"></div>
	</div>

</body>
</html>
