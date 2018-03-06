package br.com.fiap.jpa.dao;

import br.com.fiap.jpa.entity.Motorista;

public interface MotoristaDAO {

	void create(Motorista motorista);

	Motorista find(int id);

	void update(Motorista motorista);

	void delete(int id);
	
}
