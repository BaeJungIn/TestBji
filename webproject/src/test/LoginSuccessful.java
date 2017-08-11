package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginSuccessful
 */
@WebServlet("/LoginSuccessful")
public class LoginSuccessful extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	  ServletContext sc;
	  public void init(ServletConfig config) throws ServletException{
	      sc = config.getServletContext();
	   }
    		
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginSuccessful() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd1 = sc.getRequestDispatcher("/Header");
	    RequestDispatcher rd2 = sc.getRequestDispatcher("/Footer");
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		String name = (String) request.getAttribute("name");
		
		rd1.include(request, response);
		out.println("<h3>"+name+"님 환영합니다~~!!^^</h3>");
		rd2.include(request, response);
		out.close();
	}

}
