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

@WebServlet("/logout")
public class Logout extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd;

		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");

		HttpSession session = request.getSession(false);
		if (session != null) {
			session.invalidate();
			writer.print("<h3 style='color:green;'>Successfully Logged out....</h3>");
		} else {
			writer.print("<p style='color:red;'>No active session found.Please login first.</p>");
		}

		rd = request.getRequestDispatcher("logout.html");
		rd.include(request, response);

		
	}

}
