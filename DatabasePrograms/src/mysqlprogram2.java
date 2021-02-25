import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class mysqlprogram2 {

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
		String drop = "drop table employee";
		String create = "create table books (eid int(10) primary key, name varchar(50), salary int(10))";
		String sql = "insert into employee values (1001, 'Sangavi', 300090)";
		String sql1 = "insert into employee values (1002, 'Sakshi', 300050)";
	
		statement.executeUpdate(drop);
		statement.executeUpdate(create);
		statement.executeUpdate(sql);
		statement.executeUpdate(sql1);
	
		int x = statement.executeUpdate(drop);
		if (x == 1) {
			System.out.println("Record Inserted");
		}
	}

}
