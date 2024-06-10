package com.techno.servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/name")
public class DemoServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       response.setContentType("text/html");
	       PrintWriter writer=response.getWriter();
	      String name= request.getParameter("uname");
	     String password=  request.getParameter("password");
	     writer.println("<h1> Hell0 "+name+" your password is "+password+" </h1>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
	       PrintWriter writer=response.getWriter();
	      String name= request.getParameter("uname");
	     String password=  request.getParameter("password");
	     writer.println("<h1> Hell0 "+name+" your password is "+password+" </h1>");
	}

}
