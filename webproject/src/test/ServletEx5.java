package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletEx5
 */
@WebServlet("/ServletEx5")
public class ServletEx5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletEx5() {
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
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String job = request.getParameter("job");
		String interests[] = request.getParameterValues("interest");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.println("����� ������ ���� : <b>");
		out.print(job);
		out.println("</b><hr>����� ������ ���ɺо�:<b>");

		
		if(interests == null){
			out.print("������ �׸��� �����ϴ�.");
		}else{
			for(String interest:interests){
			out.print(interest+" ");
			}
		}
		out.println("</b></pre><a href='javascript:history.go(-1)>�ٽ�</a>");
		out.print("</body></html>");
		out.close();
	}
	
}