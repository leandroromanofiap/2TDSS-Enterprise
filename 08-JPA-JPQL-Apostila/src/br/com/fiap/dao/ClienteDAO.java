package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.entity.Cliente;

public interface ClienteDAO extends GenericDAO<Cliente, Integer> {

	public List<Cliente> buscar(String nome, String cidade);
	
	public List<Cliente> buscarPorEstados(List<String> estados);

}