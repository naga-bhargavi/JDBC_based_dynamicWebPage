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

@WebServlet("/deleteForm")
public class Delete extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String myemail = request.getParameter("demail");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RegisterProject","root","Bhargavi@111");
			PreparedStatement stmt = con.prepareStatement("select * from register1 where email=?");
			stmt.setString(1, myemail);
			ResultSet res = stmt.executeQuery();
			PrintWriter writer = response.getWriter();
			RequestDispatcher rd;
			if(res.next()) {
				PreparedStatement st1 = con.prepareStatement("delete from register1 where email=?");
				st1.setString(1, myemail);
				int c =st1.executeUpdate();
				if(c>0) {
					response.setContentType("text/html");
					writer.println("<h3 style='color:green'>Successfully Deleted....</h3>");
					rd = request.getRequestDispatcher("/delete.jsp");
					rd.include(request, response);
				}
				else {
					response.setContentType("text/html");
					writer.println("<h3 style='color:red'>Not Deleted....<br> Try Again</h3>");
					rd = request.getRequestDispatcher("/delete.jsp");
					rd.include(request, response);
				}
				
			}
			else {
				response.setContentType("text/html");
				writer.println("<h3 style='color:red'>Invalid Email.........<br> ");
				rd = request.getRequestDispatcher("/delete.jsp");
				rd.include(request, response);
				
			}
			
			
		} catch (Exception e) {
			PrintWriter writer = response.getWriter();
			
			response.setContentType("text/html");
			writer.println("<h3 style='color:red'>Not Deleted.<br> Please Try Again</h3>");
			RequestDispatcher rd = request.getRequestDispatcher("/delete.jsp");
			rd.include(request, response);
			
		}
		
		
		
	}
	

}
