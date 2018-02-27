package br.com.fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Carro;

public class RefreshTeste {

	public static void main(String[] args) {
		
		EntityManagerFactory f = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = f.createEntityManager();
		
		Carro carro = em.find(Carro.class, 1);
		
		carro.setModelo("Gol");
		carro.setAno(2018);
		
		em.refresh(carro);
		
		System.out.println(carro.toString());
		
		em.close();
		f.close();
		
	}
	
} 
