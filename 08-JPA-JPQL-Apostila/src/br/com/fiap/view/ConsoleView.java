package br.com.fiap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.CidadeDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.dao.impl.CidadeDAOImpl;
import br.com.fiap.dao.impl.PacoteDAOImpl;
import br.com.fiap.entity.Cidade;
import br.com.fiap.entity.Pacote;

public class ConsoleView {

	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();
		
		CidadeDAO dao = new CidadeDAOImpl(em);
		PacoteDAO pacoteDao = new PacoteDAOImpl(em);
		
		List<Cidade> cidades = dao.listar();
		//List<Cidade> cidades = dao.buscarPorNome("São Paulo");
		
		for (Cidade cidade : cidades) {
			System.out.println(cidade.getNome());
		}
		
		Calendar inicio = new GregorianCalendar(2015, Calendar.MAY, 1);
		Calendar fim = new GregorianCalendar(2018, Calendar.MAY, 2);
		List<Pacote> pacotes = pacoteDao.buscarPorData(inicio, fim);
		for(Pacote pacote : pacotes)
			System.out.println(pacote.getDescricao());
		
		
		long contarPorPacote = pacoteDao.contarPorTransporte();
		System.out.println("Pacotes com transporte: " + contarPorPacote);
		
		em.close();
		fabrica.close();
		
	}

}



