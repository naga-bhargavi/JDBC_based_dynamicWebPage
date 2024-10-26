package com.excelr.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/registerForm")
public class Registration extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String  firstName = request.getParameter("fname1");
		String  LastName = request.getParameter("lname1");
		String  myemail = request.getParameter("email1");
		String  mypassword = request.getParameter("pass1");
		String  myconfirmpassword = request.getParameter("pass2");
		String  myage = request.getParameter("age1");
		String  mygender = request.getParameter("gender1");
		String mydob = request.getParameter("dob1");
		String mycountry = request.getParameter("country1");
		String mystate = request.getParameter("state1");
		String mycity = request.getParameter("city1");
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RegisterProject","root","Bhargavi@111");
			
			PreparedStatement st = con.prepareStatement("select * from register1 where email=?");
			st.setString(1, myemail);
			ResultSet res =  st.executeQuery();
			if(res.next())
			{
				PrintWriter writer = response.getWriter();
				RequestDispatcher rd ;
				response.setContentType("text/html");
				
				 
				writer.println("<h3 style='color:red'>This email already existed....</h3>");
				rd=request.getRequestDispatcher("/Register.jsp");
				rd.include(request, response);
			}
			else {
				PreparedStatement stmt =con.prepareStatement("insert into register1 values (?,?,?,?,?,?,?,?,?,?,?)");
				
				stmt.setString(1, firstName);
				stmt.setString(2, LastName);
				stmt.setString(3, myemail);
				stmt.setString(4, mypassword);
				stmt.setString(5, myconfirmpassword);
				stmt.setString(6, myage);
				stmt.setString(7, mygender);
				stmt.setString(8, mydob);
				stmt.setString(9, mycountry);
				stmt.setString(10, mystate);
				stmt.setString(11, mycity);
				int c = stmt.executeUpdate();
				PrintWriter writer = response.getWriter();
				RequestDispatcher rd ;
				
				if(c>0) {
					
					response.setContentType("text/html");
					

					writer.println("<h3 style='color:green'>Registered Successfully</h3>");
					rd=request.getRequestDispatcher("/index.html");
					rd.include(request, response);
				}
				else {
					response.setContentType("text/html");
					
					writer.println("<h3 style='color:red'>Registration Failed</h3>");
					rd=request.getRequestDispatcher("/index.html");
					rd.include(request, response);
				}
			}
			
			
			
		} catch (Exception e) {
			response.setContentType("text/html");
			PrintWriter writer = response.getWriter();
			RequestDispatcher rd ;
			
			writer.print("<h3 style='color:red'>Errorin the code</h3>");
			rd=request.getRequestDispatcher("/index.html");
			rd.include(request, response);			
			e.printStackTrace();
		}
				
		
		
		
	}

}
