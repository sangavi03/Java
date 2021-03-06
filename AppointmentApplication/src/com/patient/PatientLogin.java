package com.patient;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PatientLogin extends HttpServlet {
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
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
			String email= request.getParameter("email");
			String password= request.getParameter("password");
			
			try {
				ps=dbcon.prepareStatement("select * from patient where email=? and password=?");
				ps.setString(1, email);
				ps.setString(2, password);
				ResultSet rs = ps.executeQuery();
				if(rs.next()) {
					response.sendRedirect("patient_home.html");
				}else {
					response.sendRedirect("patient_login.html");
				}
				

			} catch (SQLException e) {
				e.printStackTrace();
			}
		
}

	}

