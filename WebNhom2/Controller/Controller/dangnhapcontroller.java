package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.KhachHangBean;
import bo.KhachHangBo;

/**
 * Servlet implementation class dangnhapcontroller
 */
@WebServlet("/dangnhapcontroller")
public class dangnhapcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dangnhapcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		String tk = request.getParameter("txtusername");
		String mk = request.getParameter("txtpwd");
		String logout = request.getParameter("logout");
		

		HttpSession session = request.getSession();
		if (logout == null) {
		    KhachHangBo khbo = new KhachHangBo();
		    KhachHangBean kh = khbo.KiemTra(tk, mk);
		    if (kh != null) {//dung thong tin
			if (session.getAttribute("auth") == null) {
			    session.setAttribute("auth", (KhachHangBean) kh);
			}
		    } else {
			//Sai mk or tk
			session.setAttribute("flag_auth", 1);
			session.setAttribute("auth", null);	
		    }
		} else {
		    session.setAttribute("flag_auth", null);
		    session.setAttribute("auth", null);
		    session.setAttribute("giohang", null);
		}

		RequestDispatcher rd = request.getRequestDispatcher("HtSachController");
		rd.forward(request, response);		
	}catch (Exception e) {
			e.printStackTrace();
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
