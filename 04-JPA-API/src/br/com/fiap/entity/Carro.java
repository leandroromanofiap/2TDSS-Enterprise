package br.com.fiap.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TB_CARRO")
@SequenceGenerator(name = "carro", sequenceName = "SQ_TB_CARRO", allocationSize = 1)
public class Carro implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cd_carro")
	@GeneratedValue(generator = "carro", strategy = GenerationType.SEQUENCE)
	private int id;

	@Column(name = "ds_modelo", length = 50, nullable = false)
	private String modelo;

	@Column(name = "nr_ano", nullable = false)
	private int ano;

	@Column(name = "ds_placa", length = 7)
	private String placa;

	@Column(name = "ds_tipo")
	private int tipo;

	@Temporal(TemporalType.DATE)
	@Column(name = "dt_fabricacao")
	private Calendar fabricacao;

	@Lob
	@Column(name = "fl_foto")
	private byte[] foto;

	public Carro() {
		super();
	}

	public Carro(String modelo, int ano, String placa, int tipo, Calendar fabricacao, byte[] foto) {
		super();
		this.modelo = modelo;
		this.ano = ano;
		this.placa = placa;
		this.tipo = tipo;
		this.fabricacao = fabricacao;
		this.foto = foto;
	}

	public int getId() {
		return id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Calendar getFabricacao() {
		return fabricacao;
	}

	public void setFabricacao(Calendar fabricacao) {
		this.fabricacao = fabricacao;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

}
