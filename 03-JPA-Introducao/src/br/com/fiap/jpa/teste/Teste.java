package br.com.fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = factory.createEntityManager();
		
		
		
		em.close();
		factory.close();
		
	}
	
}
