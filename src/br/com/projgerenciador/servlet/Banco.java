package br.com.projgerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Produtos> lista = new ArrayList<>();
	
	static {
		Produtos produto = new Produtos();
		produto.setNome("Monitor");
		produto.setDescricao("Monitor LED");
		
		Produtos produto2 = new Produtos();
		produto2.setNome("Gabinete");
		produto2.setDescricao("Gabinete Preto");
		
		Produtos produto3 = new Produtos();
		produto3.setNome("Teclado");
		produto3.setDescricao("Teclado Ergonômico");
		
		lista.add(produto);
		lista.add(produto2);
		lista.add(produto3);
	}
	
	public void adiciona(Produtos produto) {
		Banco.lista.add(produto);
	}
	
	public List<Produtos> getProdutos() {
		return Banco.lista;
	}

}
