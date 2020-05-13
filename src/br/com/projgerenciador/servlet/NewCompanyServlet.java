package br.com.projgerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/newCompany")
public class NewCompanyServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		System.out.println("Cadastrando uma nova empresa.");
		String nomeEmpresa = request.getParameter("nome");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Empresa " + nomeEmpresa + " cadastrada com sucesso!");
		out.println("</body>");
		out.println("</html>");

	}

}
