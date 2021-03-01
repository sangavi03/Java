import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
		
		String create = "CREATE TABLE STUDENT (id int(5) primary key, firstname varchar(50),lastname varchar(50), "+
				 "mobile int(10)),address varchar(255),department varchar(255)";

		System.out.println("Creating table: "+ create);
		statement.executeUpdate(create);
	}

}
