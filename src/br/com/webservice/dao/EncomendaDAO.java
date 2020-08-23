package br.com.webservice.dao;

import java.util.HashMap;
import java.util.Map;

import br.com.webservice.modelo.Encomenda;
import br.com.webservice.modelo.Produto;

public class EncomendaDAO {
	//
	// bdMock: Map para simular um banco de dados
	//
	private static Map<Integer, Encomenda> bdMock = new HashMap<Integer, Encomenda>();
	
	// static clause: popula o banco mockado
	static {
		Produto produto01 = new Produto(1, "Playstation 4", 2300, 1);
		Produto produto02 = new Produto(2, "Jogo de PS4 (Esporte)", 120, 1);
		Produto produto03 = new Produto(3, "SmartTV 42pol", 1450, 1);
		Produto produto04 = new Produto(4, "Gift Card", 50, 3);
		
		Encomenda encomenda01 = new Encomenda();
		encomenda01.setId(1);
		encomenda01.setProduto(produto01);
		encomenda01.setProduto(produto02);
		encomenda01.setCidade("Sao Paulo");
		encomenda01.setRua("Av. Paulista");
		
		Encomenda encomenda02 = new Encomenda();
		encomenda02.setId(2);
		encomenda02.setProduto(produto03);
		encomenda02.setProduto(produto04);
		encomenda02.setCidade("Florianopolis");
		encomenda02.setRua("Av. Mauro Ramos");
		
		bdMock.put(1, encomenda01);
		bdMock.put(2, encomenda02);
	}
	
	public Encomenda getEncomenda(int id) {
		return bdMock.get(id);
	}
	
}
