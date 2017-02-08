package br.edu.ifpb.pweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/c.do")
public class ServletC  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<h1>Servlet C executou seu serviço</h1>");
		System.out.println("ServletC executou seu serviço");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("\\a.do");
		dispatcher.forward(request, response);
	}
	
}
