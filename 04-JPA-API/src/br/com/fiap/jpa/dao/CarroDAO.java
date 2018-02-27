package br.com.fiap.jpa.dao;

import br.com.fiap.entity.Carro;

public interface CarroDAO {

	void create(Carro carro);
	
	Carro find(int id);
	
	void update(Carro carro);
	
	void delete(int id);
	
}
