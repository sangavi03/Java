import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class oracle {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@//localhost:1521";
		String username ="system";
		String password ="manager";
		Connection con1 = DriverManager.getConnection(url,username,password);
		if(con1!=null) {
			System.out.println("Connection Established");
		}
	}

}
