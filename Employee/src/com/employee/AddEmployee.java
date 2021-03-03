package com.employee;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddEmployee
 */
public class AddEmployee extends HttpServlet {

	Connection dbcon = null;
	PreparedStatement ps = null;
	public void init(ServletConfig config) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/employee";
		String username="root";
		String password="root";
		try {
			 dbcon = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String name= request.getParameter("name");
		String designation= request.getParameter("designation");
		int salary= Integer.parseInt(request.getParameter("salary"));
		String email= request.getParameter("email");
		String password= request.getParameter("password");
		String location= request.getParameter("location");

		try {
			ps=dbcon.prepareStatement("insert into employee(name,designation,salary,email,password,location) values(?,?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, designation);
			ps.setInt(3, salary);
			ps.setString(4, email);
			ps.setString(5, password);
			ps.setString(6, location);


		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		int x;
		try {
			x = ps.executeUpdate();
			if(x!=0) {
				response.sendRedirect("index.html?msg=success");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		


		
	}
}
