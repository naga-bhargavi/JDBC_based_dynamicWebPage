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


@WebServlet("/updateForm")

public class Update extends HttpServlet{
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String myemail = request.getParameter("uemail");
		String lvalue = request.getParameter("listvalue");
		String cvalue = request.getParameter("changevalue");
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RegisterProject","root","Bhargavi@111");
			PreparedStatement stmt = con.prepareStatement("select * from register1 where email = ?");
			stmt.setString(1, myemail);
			ResultSet res = stmt.executeQuery();
			
			PrintWriter write  = response.getWriter();
			RequestDispatcher rd;
			if(res.next()) {
				PreparedStatement s1 ;
				int c;
				if(lvalue.equals("First Name")) {
					s1 = con.prepareStatement("update  register1 set firstname = ? where email = ?");
					s1.setString(1, cvalue);
					s1.setString(2, myemail);
					c = s1.executeUpdate();
					if(c>0)
					{
						response.setContentType("text/html");
						write.println("<h3 >Updated Successfully</h3>");				
						rd =request.getRequestDispatcher("/update.jsp");
						rd.include(request, response);
					}
					else {
						response.setContentType("text/html");
						write.println("<h3 style='color:red'>Not Updated... </h3>");
						rd =request.getRequestDispatcher("/update.jsp");
						rd.include(request, response);
					}
					
				}
				else if(lvalue.equals("Last Name")) {
					s1 = con.prepareStatement("update  register1 set lastname = ? where email = ?");
					s1.setString(1, cvalue);
					s1.setString(2, myemail);
					c = s1.executeUpdate();
					if(c>0)
					{
						response.setContentType("text/html");
						write.println("<h3 >Updated Successfully</h3>");				
						rd =request.getRequestDispatcher("/update.jsp");
						rd.include(request, response);
					}
					else {
						response.setContentType("text/html");
						write.println("<h3 style='color:red'>Not Updated... </h3>");
						rd =request.getRequestDispatcher("/update.jsp");
						rd.include(request, response);
					}
					
				}
				else if(lvalue.equals("Email")) {
					s1 = con.prepareStatement("update  register1 set email = ? where email = ?");
					s1.setString(1, cvalue);
					s1.setString(2, myemail);
					c = s1.executeUpdate();
					if(c>0)
					{
						response.setContentType("text/html");
						write.println("<h3 >Updated Successfully</h3>");				
						rd =request.getRequestDispatcher("/update.jsp");
						rd.include(request, response);
					}
					else {
						response.setContentType("text/html");
						write.println("<h3 style='color:red'>Not Updated... </h3>");
						rd =request.getRequestDispatcher("/update.jsp");
						rd.include(request, response);
					}
				}
				else if(lvalue.equals("Password")) {
					s1 = con.prepareStatement("update  register1 set password = ? , confirmpassword = ? where email = ?");
					s1.setString(1, cvalue);
					s1.setString(2, cvalue);
					s1.setString(3, myemail);
					c = s1.executeUpdate();
					if(c>0)
					{
						response.setContentType("text/html");
						write.println("<h3 >Updated Successfully</h3>");				
						rd =request.getRequestDispatcher("/update.jsp");
						rd.include(request, response);
					}
					else {
						response.setContentType("text/html");
						write.println("<h3 style='color:red'>Not Updated... </h3>");
						rd =request.getRequestDispatcher("/update.jsp");
						rd.include(request, response);
					}
				}
				else if(lvalue.equals("Age")) {
					s1 = con.prepareStatement("update  register1 set age = ? where email = ?");
					s1.setString(1, cvalue);
					s1.setString(2, myemail);
					c = s1.executeUpdate();
					if(c>0)
					{
						response.setContentType("text/html");
						write.println("<h3 >Updated Successfully</h3>");				
						rd =request.getRequestDispatcher("/update.jsp");
						rd.include(request, response);
					}
					else {
						response.setContentType("text/html");
						write.println("<h3 style='color:red'>Not Updated... </h3>");
						rd =request.getRequestDispatcher("/update.jsp");
						rd.include(request, response);
					}
				}
				else if(lvalue.equals("Date Of Birth")) {
					s1 = con.prepareStatement("update  register1 set dob = ? where email = ?");
					s1.setString(1, cvalue);
					s1.setString(2, myemail);
					c = s1.executeUpdate();
					if(c>0)
					{
						response.setContentType("text/html");
						write.println("<h3 >Updated Successfully</h3>");				
						rd =request.getRequestDispatcher("/update.jsp");
						rd.include(request, response);
					}
					else {
						response.setContentType("text/html");
						write.println("<h3 style='color:red'>Not Updated... </h3>");
						rd =request.getRequestDispatcher("/update.jsp");
						rd.include(request, response);
					}
				}
				else if(lvalue.equals("Gender")) {
					s1 = con.prepareStatement("update  register1 set gender = ? where email = ?");
					s1.setString(1, cvalue);
					s1.setString(2, myemail);
					c = s1.executeUpdate();
					if(c>0)
					{
						response.setContentType("text/html");
						write.println("<h3 >Updated Successfully</h3>");				
						rd =request.getRequestDispatcher("/update.jsp");
						rd.include(request, response);
					}
					else {
						response.setContentType("text/html");
						write.println("<h3 style='color:red'>Not Updated... </h3>");
						rd =request.getRequestDispatcher("/update.jsp");
						rd.include(request, response);
					}
				}
				else if(lvalue.equals("Country")) {
					s1 = con.prepareStatement("update  register1 set country = ? where email = ?");
					s1.setString(1, cvalue);
					s1.setString(2, myemail);
					c = s1.executeUpdate();
					if(c>0)
					{
						response.setContentType("text/html");
						write.println("<h3 >Updated Successfully</h3>");				
						rd =request.getRequestDispatcher("/update.jsp");
						rd.include(request, response);
					}
					else {
						response.setContentType("text/html");
						write.println("<h3 style='color:red'>Not Updated... </h3>");
						rd =request.getRequestDispatcher("/update.jsp");
						rd.include(request, response);
					}
				}
				else if(lvalue.equals("State")) {
					s1 = con.prepareStatement("update  register1 set state = ? where email = ?");
					s1.setString(1, cvalue);
					s1.setString(2, myemail);
					c = s1.executeUpdate();
					if(c>0)
					{
						response.setContentType("text/html");
						write.println("<h3 >Updated Successfully</h3>");				
						rd =request.getRequestDispatcher("/update.jsp");
						rd.include(request, response);
					}
					else {
						response.setContentType("text/html");
						write.println("<h3 style='color:red'>Not Updated... </h3>");
						rd =request.getRequestDispatcher("/update.jsp");
						rd.include(request, response);
					}
				}
				else if(lvalue.equals("City")) {
					s1 = con.prepareStatement("update  register1 set city = ? where email = ?");
					s1.setString(1, cvalue);
					s1.setString(2, myemail);
					c = s1.executeUpdate();
					if(c>0)
					{
						response.setContentType("text/html");
						write.println("<h3 >Updated Successfully</h3>");				
						rd =request.getRequestDispatcher("/update.jsp");
						rd.include(request, response);
					}
					else {
						response.setContentType("text/html");
						write.println("<h3 style='color:red'>Not Updated... </h3>");
						rd =request.getRequestDispatcher("/update.jsp");
						rd.include(request, response);
					}
				}		
				
				
				
			}
			else {
				response.setContentType("text/html");
				write.println("<h3 style='color:red'>Invalid Email.... </h3><h3 style='color:red'>please enter correct email</h3>");
				rd =request.getRequestDispatcher("/update.jsp");
				rd.include(request, response);
			}
		} catch (Exception e) {
			PrintWriter write  = response.getWriter();
			RequestDispatcher rd;
			response.setContentType("text/html");
			write.println("<h3 style='color:red'>Error occured in the code.... </h3>");
			rd =request.getRequestDispatcher("/update.jsp");
			rd.include(request, response);
		}
	}

}
