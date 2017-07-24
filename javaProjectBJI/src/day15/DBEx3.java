package day15;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class DBEx3 {
   public DBEx3() {
       String user = "root";
        String pw = "oracle";
        Connection conn = null;   
        Scanner input;
        
        try {
            // Dirver Loading
            Class.forName("com.mysql.jdbc.Driver"); //자바에서 디비에 연결하기 위한 인터페이스
            System.out.println("Driver successful");
            
            // DB Connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test",user,pw);
            System.out.println("Connection successful");
         }catch(SQLException e) {
            e.printStackTrace();
         }catch(ClassNotFoundException ex) {
            ex.printStackTrace();
         }
        
        //select and where
        System.out.print("사용자 아이디 입력 : ");
        String userid = new Scanner(System.in).next();
        //String sql = "select * form member";
        String sql = "select * from member where userid = '" + userid + "'";
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
           
           stmt = conn.createStatement();
           rs = stmt.executeQuery(sql);
           
        }catch (Exception e) {
         // TODO: handle exception
           e.printStackTrace();
        }
        try {
           ResultSetMetaData rsmd = rs.getMetaData();
     	   int cols = rsmd.getColumnCount();
     	   
           while(rs.next()) {
               /*rs.getString(컬럼명) or (컬럼인덱스) 모두 출력하시오.
        	   System.out.print(rs.getString(1) + "\t");
               System.out.print(rs.getString(2) + "\t");
               System.out.print(rs.getString(3));
               System.out.println();*/
        	   
        	   for(int i=1; i<=cols; i++) {
        		   System.out.print(rs.getString(i)+"\t");
        	   }
        	   System.out.println();
           }
           
          /* if(rs.next()) {
              System.out.println("검색된 정보는 : ");
              System.out.print(rs.getString(1) + "\t");
              System.out.print(rs.getString(2) + "\t");
              System.out.print(rs.getString(3) + "\t");
              System.out.println();
           }else {
              System.out.println("검색된 정보 없음");
           }*/
              
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
      new DBEx3();
   }

}