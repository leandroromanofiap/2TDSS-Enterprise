package br.com.fiap.jpa.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.entity.Consulta;
import br.com.fiap.entity.Medico;
import br.com.fiap.entity.Paciente;
import br.com.fiap.jpa.dao.ConsultaDAO;
import br.com.fiap.jpa.dao.impl.ConsultaDAOImpl;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class ChaveCompostaTeste {

	public static void main(String[] args) {
		EntityManagerFactory factory = EntityManagerFactorySingleton.getInstance();
		EntityManager em = factory.createEntityManager();
		
		Medico medico = new Medico(1234, "Leandro Romano", "Psiquiatria");
		Paciente paciente = new Paciente("Patrick", new GregorianCalendar(2018, Calendar.MARCH, 10));
		
		Consulta consulta = new Consulta(medico, paciente, Calendar.getInstance(), "2A", true);
		
		ConsultaDAO consultaDAO = new ConsultaDAOImpl(em);
		
		try {
			consultaDAO.inserir(consulta);
			consultaDAO.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		em.close();
		factory.close();
	}
	
}
