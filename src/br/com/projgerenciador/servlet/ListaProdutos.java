package br.com.projgerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/listaProdutos")

public class ListaProdutos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Criando o Banco em memória para buscar os Produtos cadastrados
		Banco banco = new Banco();
		List<Produtos> lista = banco.getProdutos();
			
		//Criar o objeto para buscar a lista de produtos do Banco
		PrintWriter out = resp.getWriter();
				
		out.println("<html><body>");
			
		out.println("<ul>");
				
		for (Produtos produto : lista) {
			out.println("<li>" + produto.getNome() + "<li/>");
			out.println("<li>" + produto.getDescricao() + "<li/>");
		}
				
		out.println("</ul>");
			
		out.println("</html></body>");
		
	}

}
