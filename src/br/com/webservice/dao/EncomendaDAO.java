package br.com.webservice.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.ManagedBean;

import br.com.webservice.modelo.Encomenda;
import br.com.webservice.modelo.Produto;

@ManagedBean
public class EncomendaDAO {
	//
	// bdMock: Map para simular um banco de dados
	//
	private static Map<Integer, Encomenda> bdMock = new HashMap<Integer, Encomenda>();
	private static AtomicInteger contador = new AtomicInteger(3);
	
	// static clause: popula o banco mockado
	static {
		Encomenda encomenda01 = new Encomenda();
		encomenda01.setProduto(new Produto("Playstation 4", Double.valueOf(2300), 1))
					.setProduto(new Produto("Jogo de PS4 (Esporte)", Double.valueOf(120), 1));
		encomenda01.setCidade("Sao Paulo");
		encomenda01.setRua("Av. Paulista");
		
		Encomenda encomenda02 = new Encomenda();
		encomenda02.setProduto(new Produto("SmartTV 42pol", Double.valueOf(1450), 1))
					.setProduto(new Produto("Gift Card", Double.valueOf(50), 3));
		encomenda02.setCidade("Florianopolis");
		encomenda02.setRua("Av. Mauro Ramos");
		
		bdMock.put(1, encomenda01);
		bdMock.put(2, encomenda02);
	}
	
	public Encomenda getEncomendaDao(int id) {
		return bdMock.get(id);
	}
	
	public int criaEncomendaDao(Encomenda encomendaObj) {
		int id = contador.getAndIncrement();
		bdMock.put(id, encomendaObj);
		return id;
	}

	public boolean isEncomendaExistente(int idEncomenda) {
		return bdMock.containsKey(idEncomenda);
	}
	
}
