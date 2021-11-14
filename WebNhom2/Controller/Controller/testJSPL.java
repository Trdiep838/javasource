package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.loaibean;
import bean.sachbean;
import bo.loaibo;
import bo.sachbo;

/**
 * Servlet implementation class testJSPL
 */
@WebServlet("/testJSPL")
public class testJSPL extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public testJSPL() {
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
				loaibo lbo = new loaibo(); 
					sachbo sbo = new sachbo();
					ArrayList<sachbean> dssach= sbo.getsach();
					  ArrayList<loaibean> dsloai=lbo.getloai();
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
					    RequestDispatcher rd= request.getRequestDispatcher("testJSTL.jsp");
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
