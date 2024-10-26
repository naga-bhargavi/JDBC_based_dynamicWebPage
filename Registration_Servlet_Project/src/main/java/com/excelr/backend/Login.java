package com.excelr.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/loginForm")
public class Login extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String myemail = request.getParameter("email1");
		String mypassword = request.getParameter("pass1");
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RegisterProject","root","Bhargavi@111");
			PreparedStatement stmt = con.prepareStatement("select * from register1 where email = ?");
			stmt.setString(1, myemail);
			ResultSet res = stmt.executeQuery();
			PrintWriter writer = response.getWriter();
			RequestDispatcher rd ;
			if(res.next()) {
				
				PreparedStatement st1 = con.prepareStatement("select password, lastname from register1 where email = ?");
				
				st1.setString(1, myemail);
				
				ResultSet res1 = st1.executeQuery();
				String pass = null;
				String lname = null;
				if(res1.next())
				{
					pass = res1.getString("password");
					lname = res1.getString("lastname");
				}
				
				if(pass.equals(mypassword))
				{
					HttpSession session = request.getSession();
					session.setAttribute("myname",lname); 
					rd = request.getRequestDispatcher("/home.jsp");
					rd.include(request, response);
				}
				else {
					
					response.setContentType("text/html");
					writer.println("<h3 style='color:red'>Invalid Password.....</h3>");
					RequestDispatcher rd1 = request.getRequestDispatcher("/Login.jsp");
					rd1.include(request, response);
					
				}
			}
			else {
				response.setContentType("text/html");
				writer.println("<h3 style='color:red'>User not Found. Please Register.....</h3>");
				RequestDispatcher rd1 = request.getRequestDispatcher("/Login.jsp");
				rd1.include(request, response);
				
			}
			
			
		} catch (Exception e) {	
			response.setContentType("text/html");
			PrintWriter writer = response.getWriter();
			writer.println("<h1>There is an error in the code.....</h1>");
			RequestDispatcher rd = request.getRequestDispatcher("/Login.jsp");
			rd.include(request, response);
		}
			
		
		
	}

}
