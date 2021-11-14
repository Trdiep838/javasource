package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.KhachHangBean;
import bo.KhachHangBo;
import dao.KhachHangDao;

/**
 * Servlet implementation class DangKiController2
 */
@WebServlet("/DangKiController2")
public class DangKiController2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DangKiController2() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String hoten = request.getParameter("txthoten");
		String tdn = request.getParameter("txttendn");
		String matkhau = request.getParameter("txtmatkhau");
		String nlmatkhau = request.getParameter("txtnlmatkhau");
		String email = request.getParameter("txtemail");
		String sdt = request.getParameter("txtsdt");
		String diachi = request.getParameter("txtdiachi");
		
		KhachHangBean kh = new KhachHangBean();
		kh.setHoten(hoten);
		kh.setDiachi(diachi);
		kh.setEmail(email);
		kh.setMatkhau(matkhau);
		kh.setSdt(sdt);
		kh.setTendn(tdn);
		KhachHangBo khbo = new KhachHangBo();
		try {
			
				int rs = khbo.DangKi(kh);
				if (rs > 0) {
					response.sendRedirect("HtSachController");
					
				} else {
					response.sendRedirect("HtSachController?msg=ERROR");
				}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
