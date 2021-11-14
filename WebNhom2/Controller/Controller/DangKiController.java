package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.KhachHangBean;
import bean.loaibean;
import bean.sachbean;
import bo.KhachHangBo;
import bo.loaibo;
import bo.sachbo;
import dao.KhachHangDao;

/**
 * Servlet implementation class DangKiController
 */
@WebServlet("/DangKiController")
public class DangKiController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DangKiController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			loaibo lbo = new loaibo();
			sachbo sbo = new sachbo();
			ArrayList<sachbean> dssach = sbo.getsach();
			ArrayList<loaibean> dsloai = lbo.getloai();
			String ml = request.getParameter("ml");
			String key = request.getParameter("txttk");
			if (ml != null)
				dssach = sbo.TimMaLoai(ml);
			else if (key != null)
				dssach = sbo.TimChung(key);
			if (ml != null)
				dssach = sbo.TimMaLoai(ml);
			else if (key != null)
				dssach = sbo.TimChung(key);

			request.setAttribute("dsloai", dsloai);
			request.setAttribute("dssach", dssach);
			long sl = sbo.Demsach(ml);
			request.setAttribute("sl", sl);
			RequestDispatcher rd = request.getRequestDispatcher("Sach\\Dangki.jsp");
			rd.forward(request, response);
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

		doGet(request, response);
//		 request.setCharacterEncoding("utf-8");
//			response.setCharacterEncoding("utf-8");
//			String hoten = request.getParameter("txthoten");
//			String tdn = request.getParameter("txttendn");
//			String matkhau = request.getParameter("txtmatkhau");
//			String nlmatkhau = request.getParameter("txtnlmatkhau");
//			String email = request.getParameter("txtemail");
//			String sdt = request.getParameter("txtsdt");
//			String diachi = request.getParameter("txtdiachi");
//			String dk = request.getParameter("txtRegister");
//	KhachHangDao khdao = new KhachHangDao();
//			KhachHangBean kh = new KhachHangBean();
//			kh.setHoten(hoten);
//			kh.setDiachi(diachi);
//			kh.setEmail(email);
//			kh.setMatkhau(matkhau);
//			kh.setSdt(sdt);
//			kh.setTendn(tdn);
//			try {
//				if(dk != null) {
//				int rs = khdao.DangKyKhachHang(kh);
//				if(rs > 0) {
//					response.sendRedirect(request.getContextPath()+"HtSachController");
//					System.out.print("ok");
//				}else {
//					response.sendRedirect(request.getContextPath()+"HtSachController?msg=ERROR");
//				}
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//	}
	}
}
