package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class formServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String name=request.getParameter("name");
		//int id=Integer.parseInt(request.getParameter("id"));
		String btn=request.getParameter("btn");
		out.println("<h1>Hi, "+name+" your form is accepted</h1>");
		out.println("done with addition");
		
	}


}
