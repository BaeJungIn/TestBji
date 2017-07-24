package day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBEx {
	public DBEx() {
		String user = "root";
		String pw = "oracle";
		
		try {
			//Driver Loading
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver successful");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", user, pw);
			System.out.println("Connection successful");
			//DB Connection
		} catch (SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		
		/*try {
			//Driver Loading
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver successful");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:1521:orcl", "userName", "oracle");
			System.out.println("Connection successful");
			//DB Connection
		} catch (SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}*/
	}
	public static void main(String[] args) {
		new DBEx();

	}

}
