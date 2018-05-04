package br.com.fiap.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.com.fiap.bo.ClienteBO;

@ManagedBean
public class ClienteBean {

	private double rendimento;
	
	private double resultado;
	
	@EJB
	private ClienteBO bo;
	
	public ClienteBean() {
		super();
	}

	public ClienteBean(double rendimento, double resultado) {
		super();
		this.rendimento = rendimento;
		this.resultado = resultado;
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	public void calcular() {
		resultado = bo.calcularImpostoRenda(rendimento);
	}
	
}
