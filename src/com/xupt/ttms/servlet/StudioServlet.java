package com.xupt.ttms.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/StudioServlet")
public class StudioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
    public StudioServlet() {
        super();
     }

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		 RequestDispatcher rd = request.getRequestDispatcher("admin/StudioList.jsp");  
	        rd.forward(request, response);   
 	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
 	}

}
