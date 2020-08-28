package br.com.webservice.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Encomenda {
	private List<Produto> produtos = new ArrayList<Produto>();
	private String cidade;
	private String rua;
	
	// Construtor vazio p/ o JAXB
	public Encomenda() {}
	
	public Produto getProduto(int id) {
		return produtos.get(id);
	}
	public List<Produto> getTodosProdutos() {
		return produtos;
	}
	public Encomenda setProduto(Produto produto) {
		produtos.add(produto);
		return this;
	}
	
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	
}
