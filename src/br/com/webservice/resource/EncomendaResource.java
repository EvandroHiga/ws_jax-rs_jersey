package br.com.webservice.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.webservice.dao.EncomendaDAO;
import br.com.webservice.modelo.Encomenda;
import br.com.webservice.modelo.Produto;

@Path("encomenda")
public class EncomendaResource {

	//
	// Testar o funcionamento do webservice
	//
	@Path("/testWs")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Encomenda testWs() {
		Produto produto = new Produto(0, "Nome do Produto", 10.0, 1);
		Encomenda encomenda = new Encomenda();
		
		encomenda.setId(0);
		encomenda.setProduto(produto);
		encomenda.setCidade("Sao Paulo");
		encomenda.setRua("Av. Brasil");
		
		return encomenda;
	}
	
	//
	// Retrieve
	//
	@Path("/busca/{id}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Encomenda getEncomenda(@PathParam("id") int id) {
		return new EncomendaDAO().getEncomenda(id);
	}
	
	//
	// Cria uma nova encomenda
	//
	public void criaEncomenda() {
		
	}
	
	//
	// Adiciona um produto em uma encomenda existente
	//
}
