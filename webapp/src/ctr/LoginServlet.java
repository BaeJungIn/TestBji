package ctr;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.UserInfo;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "/login/login.jsp";
		HttpSession session = request.getSession();
		if(session.getAttribute("loginUser") != null){ //�̹� �α��ε� ������̸�
			url = "/login/main.jsp"; //���� �������� �̵��Ѵ�.
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		
		String reqPage = "/login/login.jsp";
		
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		
		MemberDAO mDao = MemberDAO.getInstance();
		
		int result = mDao.userCheck(id, pass);
		
		if(result == 1){
			UserInfo mVo = mDao.getMember(id);
			
			HttpSession session = request.getSession();
			
			session.setAttribute("loginUser", mVo);
			request.setAttribute("message", "ȸ�����Կ� �����߽��ϴ�.");
			reqPage = "/login/main.jsp";
			
		}else if(result == 0){
			request.setAttribute("message", "��й�ȣ�� ���� �ʽ��ϴ�.");
		}else if(result == -1){
			request.setAttribute("message", "�������� �ʴ� ���̵��Դϴ�..");
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(reqPage);
		dispatcher.forward(request, response);
	}

}
