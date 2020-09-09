package br.com.webservice.resource;

import java.io.StringReader;
import java.net.URI;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import br.com.webservice.dao.EncomendaDAO;
import br.com.webservice.modelo.Encomenda;
import br.com.webservice.modelo.Produto;

@Path("encomenda")
public class EncomendaResource {
	
	@Inject
	private EncomendaDAO dao;
	
	//
	// Testar o funcionamento do webservice
	//
	@Path("/test")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Encomenda testWs() {
		Encomenda encomenda = new Encomenda();
		
		encomenda.setProduto(new Produto("Nome do Produto", 10.0, 1));
		encomenda.setCidade("Sao Paulo");
		encomenda.setRua("Av. Brasil");
		
		return encomenda;
	}
	
	//
	// Retrieve XML
	//
	@Path("/buscar/{id}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Encomenda getEncomenda(@PathParam("id") int id) {
		return dao.getEncomendaDao(id);
	}
	
	
	//
	// Retrieve JSON c/ GSon
	//
	
	
	//
	// Cria uma nova encomenda
	//
	@Path("/criarNovaEncomenda")
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public Response criaEncomenda(String encomendaXml) {
		int idEncomenda = 0;
		
		try {
			JAXBContext jaxbContext;
			jaxbContext = JAXBContext.newInstance(Encomenda.class);
			
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			Encomenda encomendaObj = (Encomenda)unmarshaller.unmarshal(new StringReader(encomendaXml));
			
			idEncomenda = dao.criaEncomendaDao(encomendaObj);
			
			return Response.created(URI.create("encomenda/buscar/" + String.valueOf(idEncomenda))).build();
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	//
	// Adiciona um produto em uma encomenda existente
	//
//	@Path("/adicionarProduto/{idEncomenda}")
//	public Response adicionaProduto(@PathParam("idEncomenda") int idEncomenda, String produtoXml) {
//		if(new EncomendaDAO().isEncomendaExistente(idEncomenda)) {
//			return Response.noContent().build();
//		} else {
//			
//		}
//	}
	
	
}
