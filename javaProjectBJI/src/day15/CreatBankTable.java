package day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatBankTable {
	public CreatBankTable() {
		String user = "root";
        String pw = "oracle";
        Connection conn = null;   
        
        try {
            Class.forName("com.mysql.jdbc.Driver"); 
            System.out.println("Driver successful");
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test",user,pw);
            System.out.println("Connection successful");
         }catch(SQLException e) {
            e.printStackTrace();
         }catch(ClassNotFoundException ex) {
            ex.printStackTrace();
         }
        
        String sql = "create table bankmember (name varchar(10), id varchar(10) primary key, pw varchar(10), email varchar(20), idnumber varchar(20), money varchar(10));";
        Statement stmt = null;
        
        try {
           stmt = conn.createStatement();
           stmt.executeUpdate(sql);
           System.out.println("테이블 생성 성공!");
           
        }catch (Exception e) {
           e.printStackTrace();
        }
        
    }
	public static void main(String[] args) {
		new CreatBankTable();

	}

}
