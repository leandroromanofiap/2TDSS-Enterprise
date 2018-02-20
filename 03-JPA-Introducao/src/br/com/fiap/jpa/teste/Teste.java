package br.com.fiap.jpa.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Aluno;
import br.com.fiap.entity.Curso;
import br.com.fiap.entity.Periodo;
import br.com.fiap.entity.StatusCurso;

public class Teste {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = factory.createEntityManager();
		
		Aluno aluno = new Aluno("Leandro Romano", "TDS", new GregorianCalendar(2000, Calendar.OCTOBER, 2), true, Periodo.NORTUNO, 3, null);
		Curso curso = new Curso("Sistemas de Informação", StatusCurso.ATIVO, 3, new GregorianCalendar(2000, Calendar.FEBRUARY, 2), null);
		
		em.getTransaction().begin();
		
		em.persist(curso);
		em.persist(aluno);
		
		em.getTransaction().commit();
		
		em.close();
		factory.close();
		
	}
	
}
