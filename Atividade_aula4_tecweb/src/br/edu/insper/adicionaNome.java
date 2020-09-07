package br.edu.insper;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class adicionaNome
 */
@WebServlet("/adicionaNome")
public class adicionaNome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adicionaNome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	     String em = request.getParameter("email");
	     String nome = request.getParameter("nome");
	     String course = request.getParameter("curso");

		 response.setContentType("text/html");
		 
	      PrintWriter pw=response.getWriter();
	      pw.write("<h2> Parabéns! Você está inscrito :) <h2> <br>");
	      pw.write("<h3> Email: "+ em +" </h3>");
	      pw.write("<h3> Nome: "+ nome +" </h3>");
	      pw.write("<h3> Curso: "+ course +" </h3>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
}


