package br.com.fiap.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.dao.VeiculoDAO;
import br.com.fiap.jpa.entity.Veiculo;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.VeiculoNotFoundException;

public class VeiculoDAOImpl implements VeiculoDAO {

	private EntityManager em;

	public VeiculoDAOImpl(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public void create(Veiculo veiculo) {
		em.persist(veiculo);
	}

	@Override
	public Veiculo find(int id) {
		return em.find(Veiculo.class, id);
	}

	@Override
	public void update(Veiculo veiculo) {
		em.merge(veiculo);
	}

	@Override
	public void delete(int id) throws VeiculoNotFoundException {
		Veiculo veiculo = em.find(Veiculo.class, id);

		if (veiculo == null)
			throw new VeiculoNotFoundException("Veículo não encontrado.");

		em.remove(veiculo);
	}

	@Override
	public void commit() throws CommitException {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();

			e.printStackTrace();

			throw new CommitException("Erro ao realizar commit.");
		}
	}

}
