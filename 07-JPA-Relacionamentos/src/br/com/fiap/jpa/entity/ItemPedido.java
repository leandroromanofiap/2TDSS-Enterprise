package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "T_ITEM_PEDIDO")
@SequenceGenerator(name = "item_pedido", sequenceName = "SQ_T_ITEM_PEDIDO", allocationSize = 1)
public class ItemPedido {

	@Id
	@Column(name = "cd_item_pedido")
	@GeneratedValue(generator = "item_pedido", strategy = GenerationType.SEQUENCE)
	private int codigo;

	@Column(name = "ds_item_pedido")
	private String descricao;

	@Column(name = "vl_item_pedido")
	private double valor;

	public ItemPedido() {
		super();
	}

	public ItemPedido(int codigo, String descricao, double valor) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
