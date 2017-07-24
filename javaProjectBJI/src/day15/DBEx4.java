package day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class DBEx4 {
   public DBEx4() {
        String user = "root";
        String pw = "oracle";
        Connection conn = null;   
        
        try {
            // Dirver Loading
            Class.forName("com.mysql.jdbc.Driver"); 
            System.out.println("Driver successful");
            
            // DB Connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test",user,pw);
            System.out.println("Connection successful");
         }catch(SQLException e) {
            e.printStackTrace();
         }catch(ClassNotFoundException ex) {
            ex.printStackTrace();
         }
        

        String sql = "select * from member";
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
           stmt = conn.createStatement();
           rs = stmt.executeQuery(sql);
        }catch (Exception e) {
           e.printStackTrace();
        }
        try {
           System.out.print("|이름"+"\t");
           System.out.print("아이디"+"\t");
           System.out.print("비밀번호"+"\t"+"|");
           System.out.println();
        
           while(rs.next()) {
        	   System.out.print("|"+rs.getString(1) + "\t");
               System.out.print(rs.getString(2) + "\t");
               System.out.print(rs.getString(3)+"\t"+"|");
               System.out.println();
           }
        }catch (Exception e) {
         // TODO: handle exception
           e.printStackTrace();
      }finally {
         try {
            if(rs != null) rs.close();
            if(stmt != null) stmt.close();
            if(conn != null) conn.close();
         }catch(SQLException e){
            e.printStackTrace();
         }
         
      }
        
    }
        
   public static void main(String[] args) {
      new DBEx4();
   }

}