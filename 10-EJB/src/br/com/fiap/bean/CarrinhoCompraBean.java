package br.com.fiap.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.fiap.bo.CarrinhoCompraBO;

@ManagedBean
@SessionScoped
public class CarrinhoCompraBean {

	private String item;
	
	private List<String> itens;
	
	@EJB
	CarrinhoCompraBO bo;

	@PostConstruct
	public void init() {
		itens = bo.checkout();
	}

	public void add() {
		bo.adicionarItem(item);
		itens = bo.checkout();
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public List<String> getItens() {
		return itens;
	}

	public void setItens(List<String> itens) {
		this.itens = itens;
	}

}
