package br.com.projgerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/novoProdutosServlet")
public class NovoProdutosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Cadastrando Novo Produto");
		
		String nomeProduto = req.getParameter("nome");
		String descricaoProduto = req.getParameter("descricao");
		
		//Acesso aos objetos da Classe Produtos
		Produtos produto = new Produtos();
		produto.setNome(nomeProduto);
		produto.setDescricao(descricaoProduto);
		
		//Acesso a Classe Banco
		Banco banco = new Banco();
		banco.adiciona(produto);
		
		//Chamar o JSP
		RequestDispatcher rd = req.getRequestDispatcher("/formAdicionaProduto.jsp");
		req.setAttribute("nomeProduto", produto.getNome());
		req.setAttribute("descricaoProduto", produto.getDescricao());
		rd.forward(req, resp);
		
		System.out.println("Novo Produto = " + nomeProduto + " cadastrado");
		System.out.println("Nova descrição = " + descricaoProduto + " cadastrada");
		
	}

}
