package br.com.fiap.dao.impl;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.entity.Pacote;

public class PacoteDAOImpl extends GenericDAOImpl<Pacote, Integer> implements PacoteDAO {

	public PacoteDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Pacote> buscarPorData(Calendar inicio, Calendar fim) {
		return em.createQuery("from Pacote p where p.dataSaida between :i and :f", Pacote.class)
				.setParameter("i", inicio).setParameter("f", fim).getResultList();
	}

	@Override
	public long contarPorTransporte() {
		return em.createNamedQuery("Pacote.contarPorTransporte", Long.class).getSingleResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Pacote> buscarPorDestino(String destino) {
		return em.createNativeQuery("SELECT * FROM JPA_T_PACOTE where ds_pacote like :d", Pacote.class)
				.setParameter("d", "%" + destino + "%").getResultList();
	}

}
