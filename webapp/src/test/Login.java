package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */


@WebServlet("/Login")
public class Login extends HttpServlet {
   private static final long serialVersionUID = 1L;
   public Connection conn;
   public Statement stmt;
   public ResultSet rs;
   public ServletContext sc;
   public PreparedStatement pstmt = null;
 
   
   public void init(ServletConfig config) throws ServletException{
      DBAction dba = DBAction.getInstance();
      conn = dba.getConnection();
      sc = config.getServletContext();
   }
   
   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      response.getWriter().append("Served at: ").append(request.getContextPath());
   }

   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
//      doGet(request, response);
      RequestDispatcher rd1 = sc.getRequestDispatcher("/LoginSuccessful");
      RequestDispatcher rd2 = sc.getRequestDispatcher("/NameFail");
      RequestDispatcher rd3 = sc.getRequestDispatcher("/JobFail");
      
      request.setCharacterEncoding("UTF-8");
      String name = request.getParameter("name");
      String job = request.getParameter("job");
      
      String sql = "select * from servletdb where name = ?";
      
      try {
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, name);      
         rs = pstmt.executeQuery();
      } catch (Exception e) {
         // TODO: handle exception
         e.printStackTrace();
      }
      
      response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();
      request.setCharacterEncoding("UTF-8");
      out.println("<html>");
      out.println("<body>");
      out.println("<center><br><br><br><br><br");
      try {
    	  
		if(rs.next()){
			if(rs.getString(2).equals(job)){
				//out.println("<h3>"+rs.getString(1)+"님 환영합니다.</h3>");
				request.setAttribute("name",name);
				rd1.forward(request, response);
			}else{
				//out.println("<h3>"+"직업이 일치하지 않습니다."+"다시 시도해주세요..."+"</h3>");
				rd3.forward(request, response);
			}
		}else{
			//out.println("<h3>"+"이름은 존재 안함..."+"</h3>");
			rd2.forward(request, response);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
      out.println("</body>");
      out.println("</html>");
      out.close();
      
   }

   
   public void destroy() {
	      try {
	         if (rs != null)
	            rs.close();
	         if (stmt != null)
	            stmt.close();
	         if (conn != null)
	            conn.close();
	      } catch (Exception e) {
	         // TODO: handle exception
	         e.printStackTrace();
	      }
	   }
}