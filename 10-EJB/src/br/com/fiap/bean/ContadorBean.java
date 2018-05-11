package br.com.fiap.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.com.fiap.bo.ContadorBO;

@ManagedBean
public class ContadorBean {

	@EJB
	private ContadorBO contadorBO;
	
	public void contar() {
		contadorBO.incrementar();
	}
	
	public int getTotal() {
		return contadorBO.verTotal();
	}
	
}
