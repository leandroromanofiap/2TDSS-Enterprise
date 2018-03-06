package br.com.fiap.jpa.dao;

import br.com.fiap.jpa.entity.Veiculo;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.VeiculoNotFoundException;

public interface VeiculoDAO {

	void create(Veiculo veiculo);

	Veiculo find(int id);

	void update(Veiculo veiculo);

	void delete(int id) throws VeiculoNotFoundException;
	
	void commit() throws CommitException;

}
