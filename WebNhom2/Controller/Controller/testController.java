package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class testController
 */
@WebServlet("/testController")
public class testController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public testController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.print("<html><body>Chao mung</body><html>");
		HttpSession session=request.getSession();
		session.setAttribute("alo", "Xin chao");
		
		String[] ds= {"Ly","Duc","Truc"};
		request.setAttribute("ds", ds);
		String tama=request.getParameter("txta");
		String tamb=request.getParameter("txtb");	request.setAttribute("tama", tama);
		long kq=(long)0;
if(tama==null) {
			RequestDispatcher rd= request.getRequestDispatcher("MayTinh.jsp");
			rd.forward(request, response);
		}else
		{
if(request.getParameter("butcong")!=null)
				kq=Long.parseLong(tama)+ Long.parseLong(tamb);
			request.setAttribute("kq", kq);
			RequestDispatcher rd= request.getRequestDispatcher("MayTinh.jsp");
			rd.forward(request, response);
		}
	
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
