package br.com.fiap.jpa.dao.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Carro;
import br.com.fiap.entity.TipoCarro;
import br.com.fiap.jpa.dao.impl.CarroDAOImpl;

public class TesteDAO {

	public static void main(String[] args) {

		EntityManagerFactory f = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = f.createEntityManager();
		
		Carro carro = new Carro("Onix", 2018, "AAA9999", TipoCarro.PASSEIO,
				new GregorianCalendar(2018, Calendar.JANUARY, 1), null);
		
		CarroDAOImpl carroDAOImpl = new CarroDAOImpl(em);
		
		
		//carroDAOImpl.create(carro);
		Carro carro2 = carroDAOImpl.find(23);
		
		//carro2.setModelo("Novo Onix");
		
		//carroDAOImpl.update(carro2);
		
		carroDAOImpl.delete(23);
		
		System.out.println(carro2.toString());
	}

}
