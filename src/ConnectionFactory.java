package Bank;
import java.sql.*;

public class ConnectionFactory {
	Connection con;
	Statement stmt;
	
	public ConnectionFactory() {
		try {
			//Loading driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Establish the Connection with database
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagement","root","mysql");
			stmt = con.createStatement();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
