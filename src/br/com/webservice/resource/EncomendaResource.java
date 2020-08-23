package br.com.webservice.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.webservice.dao.EncomendaDAO;
import br.com.webservice.modelo.Encomenda;

@Path("encomenda")
public class EncomendaResource {
	
	@Path("/testWs")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Encomenda testWs() {
		return new EncomendaDAO().getEncomenda(1);
	}
}
