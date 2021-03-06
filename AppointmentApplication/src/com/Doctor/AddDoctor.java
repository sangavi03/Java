package com.Doctor;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddDoctor extends HttpServlet {
	Connection dbcon = null;
	PreparedStatement ps = null;
	public void init(ServletConfig config) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/healthcareportal";
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
		String email= request.getParameter("email");
		String password= request.getParameter("password");
		int phone = Integer.parseInt(request.getParameter("mobile"));
		String specialist= request.getParameter("specialist");
		

		try {
			ps=dbcon.prepareStatement("insert into doctor(name,email,password,phone,specialist) values(?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, password);
			ps.setInt(4, phone);
			ps.setString(5, specialist);
			


		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		int x;
		try {
			x = ps.executeUpdate();
			if(x!=0) {
				response.sendRedirect("doctor_login.html?msg=success");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		


		
	}

}
