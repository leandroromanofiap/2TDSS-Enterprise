package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_CONSULTA")
@IdClass(ConsultaPK.class)
public class Consulta {

	@Id
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "nr_crm")
	private Medico medico;

	@Id
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "cd_paciente")
	private Paciente paciente;

	@Id
	@Column(name = "dt_consulta")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar data;

	@Column(name = "ds_consultorio")
	private String consultorio;

	@Column(name = "st_convenio")
	private boolean convenio;

	public Consulta() {
		
	}
	
	public Consulta(Medico medico, Paciente paciente, Calendar dataConsulta, String consultorio,
			boolean statusConvenio) {
		super();
		this.medico = medico;
		this.paciente = paciente;
		this.data = dataConsulta;
		this.consultorio = consultorio;
		this.convenio = statusConvenio;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Calendar getDataConsulta() {
		return data;
	}

	public void setDataConsulta(Calendar dataConsulta) {
		this.data = dataConsulta;
	}

	public String getConsultorio() {
		return consultorio;
	}

	public void setConsultorio(String consultorio) {
		this.consultorio = consultorio;
	}

	public boolean isStatusConvenio() {
		return convenio;
	}

	public void setStatusConvenio(boolean statusConvenio) {
		this.convenio = statusConvenio;
	}

}
