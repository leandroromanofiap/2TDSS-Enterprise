package br.com.fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Carro;

public class BuscarTeste {

	public static void main(String[] args) {

		EntityManagerFactory f = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = f.createEntityManager();

		Carro carro = em.find(Carro.class, 1);

		System.out.println("Carro encontrado:\n" + carro.toString());

		em.close();
		f.close();

	}

}
