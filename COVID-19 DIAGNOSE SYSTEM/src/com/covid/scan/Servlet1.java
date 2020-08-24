package com.covid.scan;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/call1")
public class Servlet1 extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String coviddetails = request.getParameter("coviddetails");
		String covidactualdetails="1";
		try {
			ServletDAO servletDAO = new ServletDAO();
			servletDAO.check(name,coviddetails);
			if (coviddetails.equals(covidactualdetails)) {
				request.getRequestDispatcher("positive.jsp").forward(request, response);
			}
			else
			{
				request.getRequestDispatcher("negative.jsp").forward(request, response);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
 

}
