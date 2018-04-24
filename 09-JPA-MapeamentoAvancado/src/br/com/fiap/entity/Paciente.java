package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_PACIENTE")
@SequenceGenerator(name = "paciente", sequenceName = "SQ_T_PACIENTE", allocationSize = 1)
public class Paciente {

	@Id
	@Column(name = "cd_paciente")
	@GeneratedValue(generator = "paciente", strategy = GenerationType.SEQUENCE)
	private int codPaciente;

	@Column(name = "nm_paciente")
	private String nome;

	@Column(name = "dt_nascimento")
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento;
	
	public Paciente() {
		super();
	}
	
	public Paciente(String nome, Calendar dataNascimento) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public int getCodPaciente() {
		return codPaciente;
	}

	public void setCodPaciente(int codPaciente) {
		this.codPaciente = codPaciente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
