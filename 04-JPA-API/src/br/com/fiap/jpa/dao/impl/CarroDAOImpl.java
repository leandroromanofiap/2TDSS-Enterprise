package br.com.fiap.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Carro;
import br.com.fiap.jpa.dao.CarroDAO;

public class CarroDAOImpl implements CarroDAO {

	private EntityManager em;
	
	public CarroDAOImpl(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public void create(Carro carro) {

		em.getTransaction().begin();
		
		em.persist(carro);
		
		em.getTransaction().commit();
		
	}

	@Override
	public Carro find(int id) {
		
		Carro carro = em.find(Carro.class, id);
		
		return carro;
		
	}

	@Override
	public void update(Carro carro) {

		em.getTransaction().begin();
		
		em.merge(carro);
		
		em.getTransaction().commit();
		
	}

	@Override
	public void delete(int id) {

		Carro carro = em.find(Carro.class, id);
		
		em.getTransaction().begin();
		
		em.remove(carro);
		
		em.getTransaction().commit();
		
	}

}
