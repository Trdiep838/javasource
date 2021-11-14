package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.ChiTietHoaDonBean;
import bean.GioHangBean;
import bean.HoaDonBean;
import bean.KhachHangBean;
import bo.ChiTietHoaDonBo;
import bo.GioHangBo;
import bo.HoaDonBo;

/**
 * Servlet implementation class ThanhToanController
 */
@WebServlet("/ThanhToanController")
public class ThanhToanController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThanhToanController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		HttpSession session = request.getSession();
		String ms = request.getParameter("ms");
		String ts = request.getParameter("ts");
		String tg = request.getParameter("tg");
		String anh = request.getParameter("anh");
		String giatam = request.getParameter("gia");
		String sl = request.getParameter("txtsl");
		KhachHangBean kh = (KhachHangBean) session.getAttribute("auth");
	
		HoaDonBean hd = new HoaDonBean(kh.getMakh(), java.time.LocalDate.now().toString(), 0);
		HoaDonBo  hdbo = new HoaDonBo(); 
		GioHangBo ghbo = (GioHangBo) session.getAttribute("giohang");
		try {int rs = hdbo.Tao(hd);
		for (int i = 0; i < ghbo.ds.size(); i++) {
			GioHangBean g = ghbo.ds.get(i);
		ChiTietHoaDonBean ct;
		if(sl!=null) {
		 ct = new ChiTietHoaDonBean(g.getMasach(), Integer.parseInt(g.getSlmua().toString()	), hdbo.Timma().getMaHoaDon(), 0);
		} else {
			 ct = new ChiTietHoaDonBean(g.getMasach() ,Integer.parseInt(g.getSlmua().toString()	), hdbo.Timma().getMaHoaDon(), 0);
		}
		ChiTietHoaDonBo ctbo = new ChiTietHoaDonBo();
		
			int rs2 = ctbo.Tao(ct);
				
				if (rs > 0 && rs2 > 0) {
					response.sendRedirect("giohangController");
					
				} else {
					response.sendRedirect("giohangController?msg=ERROR");
				}
			
		} 
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
