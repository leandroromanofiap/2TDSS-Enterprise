package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.CidadeDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.CidadeDAOImpl;
import br.com.fiap.entity.Cidade;

public class ConsoleView {

	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();
		
		CidadeDAO dao = new CidadeDAOImpl(em);
		
		//List<Cidade> cidades = dao.listar();
		List<Cidade> cidades = dao.buscarPorNome("São Paulo");
		
		for (Cidade cidade : cidades) {
			System.out.println(cidade.getNome());
		}
		
		em.close();
		fabrica.close();
		
	}

}



