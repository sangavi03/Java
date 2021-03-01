import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCProgram {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306";
		String username = "root";
		String password = "root";

		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null) {
			System.out.println("Connection Established");
		}
		Statement statement = con.createStatement();
		//Drop Database
		String dropdbquery = "DROP DATABASE COLLEGE";
		int dropdb = statement.executeUpdate(dropdbquery);
		System.out.println("Database Dropped.");
		
		//Creating DB
		String createDatabase = "CREATE DATABASE COLLEGE";
		int createdb = statement.executeUpdate(createDatabase);
		//Creating Table
		String create = "CREATE TABLE STUDENT (id int(5) primary key, firstname varchar(50),lastname varchar(50), "
				+ "mobile int(10)),address varchar(255),department varchar(255)";
		statement.executeUpdate(create);
		System.out.println("Table Created");
		System.out.println("Creating table: " + create);
		String insert = "insert into STUDENT values(?,?,?,?,?,?)";
		System.out.println("Inserting Records...");
		PreparedStatement ps = con.prepareStatement(insert);
		int record = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the records:");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter Id:");
			int id = scan.nextInt();
			System.out.println("Enter First Name:");
			String firstName = scan.next();
			System.out.println("Enter Last Name:");
			String lastName = scan.next();
			System.out.println("Enter Mobile:");
			int mobile = scan.nextInt();
			System.out.println("Enter Address:");
			String location = scan.next();
			System.out.println("Enter Department:");
			String department = scan.next();
			ps.setInt(1, id);
			ps.setString(2, firstName);
			ps.setString(3, lastName);
			ps.setInt(4, mobile);
			ps.setString(5, location);
			ps.setString(6, department);
			record = ps.executeUpdate();
		}
		if (record > 0) {
			System.out.println("Records Inserted");
		}
		ResultSet display = statement.executeQuery("\nSELECT * FROM STUDENT\n");
		while (display.next()) {
			System.out.println(display.getInt(1) + "\t" + display.getString(2) + "\t" + display.getString(3) + "\t"
					+ display.getInt("mobileno") + "\t" + display.getString("location") + "\t" + display.getString(6));
		}
		//Delete Record
		int id = scan.nextInt();
		int dRecord = 0;
		String deletequery = "DELETE FROM STUDENT WHERE ID=?";
		PreparedStatement delete = con.prepareStatement(deletequery);
		delete.setInt(1, id);
		dRecord = delete.executeUpdate();
		if (dRecord > 0)
			System.out.println("Record Delete");
		
		//Update Record
		id = scan.nextInt();
		System.out.println("Enter student Address To Update Record:");
		String address = scan.next();
		int update = 0;
		String updatequery = "UPDATE STUDENT SET LOCATION=? WHERE ID=?";
		PreparedStatement preparedstmt = con.prepareStatement(updatequery);
		preparedstmt.setString(1, address);
		preparedstmt.setInt(2, id);
		update = preparedstmt.executeUpdate();
		if (update > 0)
			System.out.println("Record Updated Successfully");
		con.close();

	}
}
