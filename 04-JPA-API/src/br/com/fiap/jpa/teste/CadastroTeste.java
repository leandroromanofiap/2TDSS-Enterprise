package br.com.fiap.jpa.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Carro;
import br.com.fiap.entity.TipoCarro;

public class CadastroTeste {

	public static void main(String[] args) {

		Carro carro = new Carro("Corsa", 2015, "AAA0000", TipoCarro.PASSEIO,
				new GregorianCalendar(2015, Calendar.MARCH, 2), null);
		
		EntityManagerFactory f = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = f.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(carro);
		
		em.getTransaction().commit();
		
		em.close();
		f.close();

	}

}
