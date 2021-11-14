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

import bean.ChiTietHoaDonBean;
import bean.KhachHangBean;
import bean.LichSuBean;
import bean.loaibean;
import bean.sachbean;
import bo.ChiTietHoaDonBo;
import bo.LichSuBo;
import bo.loaibo;
import bo.sachbo;

/**
 * Servlet implementation class LichSuController
 */
@WebServlet("/LichSuController")
public class LichSuController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LichSuController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			 request.setCharacterEncoding("utf-8");
				response.setCharacterEncoding("utf-8");
				HttpSession session = request.getSession();
				loaibo lbo = new loaibo(); 
				sachbo sbo = new sachbo();
				LichSuBo  lsbo = new LichSuBo();
		
				KhachHangBean kh = (KhachHangBean) session.getAttribute("auth");

				ArrayList<sachbean> dssach= sbo.getsach();
				  ArrayList<loaibean> dsloai=lbo.getloai();
				 ArrayList <LichSuBean>  dsls = lsbo.ThongtinLS(kh.getMakh());
				String ml=request.getParameter("ml");
				String key= request.getParameter("txttk");
				if(ml!=null) dssach=sbo.TimMaLoai(ml);
				else if(key!=null) dssach = sbo.TimChung(key);
				if (ml!=null) dssach=sbo.TimMaLoai(ml);
				   else
				 	  if(key!=null) dssach=sbo.TimChung(key);
				    request.setAttribute("dsloai", dsloai);
				    request.setAttribute("dssach", dssach);
				  long sl = sbo.Demsach(ml);
				   request.setAttribute("sl", sl);
				   request.setAttribute("dsls", dsls);
				    RequestDispatcher rd= request.getRequestDispatcher("Sach\\LichSu.jsp");
				    rd.forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
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
