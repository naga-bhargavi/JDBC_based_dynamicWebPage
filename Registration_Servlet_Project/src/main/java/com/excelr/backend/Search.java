package com.excelr.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/searchForm")
public class Search extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String myemail = request.getParameter("semail");
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RegisterProject","root","Bhargavi@111");
				PreparedStatement stmt = con.prepareStatement("select firstname, lastname,email, age, gender, country, state, city from register1 where email = ?");
				stmt.setString(1, myemail);
				ResultSet res = stmt.executeQuery();
				PrintWriter write  = response.getWriter();
				RequestDispatcher rd;
				
				
				if(res.next()) {
					String s = "";
					ResultSetMetaData rsmd = res.getMetaData();
				    int n = rsmd.getColumnCount();
				    do {
				        for (int i = 1; i <= n; i++) {
				            String val = res.getString(i);
				            s += val + " | ";
				        }
				        s += "<br>";  
				    } while (res.next()); 
					response.setContentType("text/html");
					HttpSession session = request.getSession();
					session.setAttribute("statement",s); 
					rd = request.getRequestDispatcher("/search.jsp");
					rd.include(request, response);
				}
				else {
						response.setContentType("text/html");
						write.println("<h3 style='color:red'>Invalid Email.... </h3><h3 style='color:red'>please enter correct email</h3>");
						rd =request.getRequestDispatcher("/search.jsp");
						rd.include(request, response);
				}	
				
				
				
			} catch (Exception e) {
				PrintWriter write  = response.getWriter();
				RequestDispatcher rd;
				response.setContentType("text/html");
				write.println("<h3 style='color:red'>Error occured in the code.... </h3><br><h3 style='color:red'>please enter correct email</h3>");
				rd =request.getRequestDispatcher("/search.jsp");
				rd.include(request, response);
				
			}
		
	}

}
