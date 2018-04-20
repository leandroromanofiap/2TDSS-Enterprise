package br.com.fiap.dao;

import java.util.Calendar;
import java.util.List;

import br.com.fiap.entity.Pacote;

public interface PacoteDAO extends GenericDAO<Pacote, Integer> {

	List<Pacote> buscarPorData(Calendar inicio, Calendar fim);
	
	long contarPorTransporte();
	
	List<Pacote> buscarPorDestino(String destino);
	
}
