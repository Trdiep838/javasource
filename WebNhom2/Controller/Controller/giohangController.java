package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.GioHangBean;
import bean.loaibean;
import bean.sachbean;
import bo.GioHangBo;
import bo.loaibo;
import bo.sachbo;

/**
 * Servlet implementation class giohangController
 */
@WebServlet("/giohangController")
public class giohangController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public giohangController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// TODO Auto-generated method stubHttp
		try {
			HttpSession session = request.getSession();
			String ms = request.getParameter("ms");
			String ts = request.getParameter("ts");
			String tg = request.getParameter("tg");
			String anh = request.getParameter("anh");
			String giatam = request.getParameter("gia");
			String sl = request.getParameter("txtsl");
			Long giaBan = 0L;
			String xoa = request.getParameter("btnXoa");
			String sua = request.getParameter("btnSua"); 
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
			if (ms != null && giatam != null) {
				giaBan = Long.parseLong(giatam);
				GioHangBo ghbo = new GioHangBo();

				if (session.getAttribute("giohang") == null) {
					session.setAttribute("giohang", ghbo);
				}

				ghbo = (GioHangBo) session.getAttribute("giohang");

				ghbo.Them(ms, ts, tg, giaBan, (long) 1);
				session.setAttribute("giohang", ghbo);
			} else if (xoa != null) {
				GioHangBo ghbo = new GioHangBo();
				ghbo = (GioHangBo) session.getAttribute("giohang");
				ghbo.Xoa(ms);
				if (ghbo.ds.size() == 0) {
					session.setAttribute("giohang", null);
				} else {
					session.setAttribute("giohang", ghbo);
				}
			}

			else if (sl != null && sua != null) {
				int slm = Integer.parseInt(sl);

				GioHangBo ghbo = new GioHangBo();
				ghbo = (GioHangBo) session.getAttribute("giohang");

				ghbo.Them(ms, ts, tg, giaBan, (long) slm);
				int size = ghbo.ds.size();

				session.setAttribute("giohang", ghbo);

			}

			RequestDispatcher rd1 = request.getRequestDispatcher("Sach\\htgio.jsp");
			rd1.forward(request, response);
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
