package ctr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.UserInfo;
import test.DBAction;

public class MemberDAO {
   private MemberDAO() {

   }

   private static MemberDAO instance = new MemberDAO();

   public static MemberDAO getInstance() {
      return instance;
   }

   public Connection getConnection() {
      DBAction db = DBAction.getInstance();
      return db.getConnection();
   }

   public int insertMember(UserInfo mVo) {
      int result = -1;
      String sql = "insert into userinfo(id, pass, name, regist) values(?, ?, ?, ?)";
      Connection conn = getConnection();
      PreparedStatement pstmt = null;
      try {
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, mVo.getId());
         pstmt.setString(2, mVo.getPass());
         pstmt.setString(3, mVo.getName().trim());
         pstmt.setString(4, mVo.getRegist());

         result = pstmt.executeUpdate();
      } catch (SQLException e) {
         // TODO: handle exception
         e.printStackTrace();
      }
      String msg = result > 0 ? "success" : "fail";
      return result;
   }

   public int confirmID(String id) {
      int result = -1;
      String sql = "select id from userinfo where id = ?";
      Connection conn = getConnection();
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      try {
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, id);
         rs = pstmt.executeQuery();
         if (rs.next()) {
            result = 1; // 존재
         } else {
            result = -1; // 존재x
         }
      } catch (SQLException e) {
         // TODO: handle exception
         e.printStackTrace();
      }
      return result;
   }

   // 사용자 인증시 사용하는 메소드
   public int userCheck(String id, String pass) {
      int result = -1;

      /*
       * if(id != null && pass != null && id.trim().length() > 0 &&
       * pass.trim().length() > 0) {
       */
      String sql = "select id, name, pass from userinfo where id=?";
      Connection conn = getConnection();
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      try {
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, id.trim());
         rs = pstmt.executeQuery();
         if (rs.next()) {
            if (rs.getString("pass").equals(pass.trim())) {
               result = 1;
            } else { // pass fail
               result = 0;
            }
         } else { // id fail
            result = -1;
         }
      } catch (SQLException e) {
         // TODO: handle exception
         e.printStackTrace();
      }
      /* } */
      return result;

   }

   public UserInfo getMember(String id) {
      UserInfo user = null;
      String sql = "select * from userinfo where id=?";
      Connection conn = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      try {
         conn = getConnection();
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, id);
         rs = pstmt.executeQuery();
         if (rs.next()) {
            user = new UserInfo();
            user.setId(rs.getString("id"));
            user.setPass(rs.getString("pass"));
            user.setName(rs.getString("name"));
            user.setRegist(rs.getString("regist"));
         }
      } catch (SQLException e) {
         // TODO: handle exception
         e.printStackTrace();
      }

      return user;
   }
   public int updateMember(UserInfo mVo) {
      int result = -1;
      Connection conn = getConnection();
      String sql = "update userinfo set pass=?, name=?, regist=? where id=?";
      PreparedStatement pstmt = null;
      try {
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, mVo.getPass());
         pstmt.setString(2, mVo.getName());
         pstmt.setString(3, mVo.getRegist());
         pstmt.setString(4, mVo.getId());
         
         result = pstmt.executeUpdate();
      }catch(SQLException e) {
         e.printStackTrace();
      }
      return result;
   }
}