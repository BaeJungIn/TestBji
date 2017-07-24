package day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class DBEx2 {
	Scanner sc = new Scanner(System.in);
	
	public DBEx2() {
		String user = "root";
		String pw = "oracle";
		Connection conn = null;
		try {
			//Driver Loading
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver successful");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", user, pw);
			System.out.println("Connection successful");
			//DB Connection
		} catch (SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		//inserts
		String name = "";
		String userid = "";
		String pwd = "";
	
		Statement stmt = null;
		int result = -1; //-1,0,1�� ���� �� ����
		
		try {
			
			System.out.println("�̸��� �Է��ϼ��� : ");
			name = sc.nextLine();
			System.out.println("���̵� �Է��ϼ��� : ");
			userid = sc.nextLine();
			System.out.println("��й�ȣ�� �Է��ϼ��� : ");
			pwd = sc.nextLine();
			
			String sql = "insert into member(name, userid, pwd) values"+"('"+name+"','"+userid+"','"+pwd+"')";
			
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt != null)stmt.close();
				if(conn != null)conn.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		System.out.println(result < 0 ? "����!" : "����!");
	}
	public static void main(String[] args) {
		new DBEx2();

	}

}
