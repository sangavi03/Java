import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class mysqlprogram1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null) {
			System.out.println("Connection Established");
		}

		Statement statement = con.createStatement();
		// String sql = "insert into employee values(1024,'shiva',54000)";
		String sql = "update employee set salary = salary+5000";
		//String sql = "delete * from employee where eid=1024";
		statement.executeUpdate(sql);
		int x = statement.executeUpdate(sql);
		if (x == 2) {
			System.out.println("Record Deleted");
			//System.out.println("Record Updated");
			// System.out.println("Record Inserted");
		}
	}

}
