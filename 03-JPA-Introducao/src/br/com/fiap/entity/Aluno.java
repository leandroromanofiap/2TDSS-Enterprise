package br.com.fiap.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_ALUNO")
@SequenceGenerator(name = "aluno", sequenceName = "SQ_T_ALUNO", allocationSize = 1)
public class Aluno implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "aluno", strategy = GenerationType.SEQUENCE)
	private int rm;

	@Column(name = "nm_aluno", nullable = false, length = 150)
	private String nome;

	@Column(name = "ds_curso", length = 50)
	private String curso;

	@Column(name = "dt_nascimento", nullable = false)
	private Calendar dataNascimento;

	@Column(name = "st_matricula", nullable = false)
	private boolean matriculado;

	@Column(name = "ds_periodo")
	private Periodo periodo;

	@Column(name = "nr_semestre")
	private Integer semestre;

}
