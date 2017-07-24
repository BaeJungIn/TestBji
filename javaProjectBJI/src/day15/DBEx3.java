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
            Class.forName("com.mysql.jdbc.Driver"); //�ڹٿ��� ��� �����ϱ� ���� �������̽�
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
        System.out.print("����� ���̵� �Է� : ");
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
               /*rs.getString(�÷���) or (�÷��ε���) ��� ����Ͻÿ�.
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
              System.out.println("�˻��� ������ : ");
              System.out.print(rs.getString(1) + "\t");
              System.out.print(rs.getString(2) + "\t");
              System.out.print(rs.getString(3) + "\t");
              System.out.println();
           }else {
              System.out.println("�˻��� ���� ����");
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