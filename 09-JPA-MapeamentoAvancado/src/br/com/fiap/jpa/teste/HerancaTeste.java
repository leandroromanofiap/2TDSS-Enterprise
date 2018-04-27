package br.com.fiap.jpa.teste;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Pessoa;
import br.com.fiap.entity.PessoaFisica;
import br.com.fiap.entity.PessoaJuridica;
import br.com.fiap.jpa.dao.PessoaDAO;
import br.com.fiap.jpa.dao.impl.PessoaDAOImpl;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class HerancaTeste {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa("Daniel Lima", "So Far Away");
		Pessoa pessoaFisica = new PessoaFisica("Leandro Romano", "Guarulhos", "00.000.000-0", "000.000.000-00");
		Pessoa pessoaJuridica = new PessoaJuridica("Juliana Novaes", "Osasco", "00.000.000/0000-00",
				"EMPRESA DA JU EIRELI");

		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		PessoaDAO pessoaDAO = new PessoaDAOImpl(em);

		try {
			pessoaDAO.inserir(pessoa);
			pessoaDAO.inserir(pessoaFisica);
			pessoaDAO.inserir(pessoaJuridica);
			
			pessoaDAO.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		em.close();
		
	}

}
