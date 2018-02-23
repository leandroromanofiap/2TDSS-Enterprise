package br.com.fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Carro;

public class AtualizarTeste {

	public static void main(String[] args) {
		
		EntityManagerFactory f = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = f.createEntityManager();
		
		Carro carro = em.find(Carro.class, 1);
		
		carro.setModelo("Fusca");
		carro.setAno(1970);
		
		em.getTransaction().begin();
		
		// Somente necessário quando objeto não vem do banco de dados.
		em.merge(carro);
		
		em.getTransaction().commit();
		
	}
	
}
