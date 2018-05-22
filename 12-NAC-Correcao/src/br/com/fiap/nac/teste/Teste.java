package br.com.fiap.nac.teste;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.nac.entity.Cliente;
import br.com.fiap.nac.entity.Sexo;
import br.com.fiap.nac.singleton.EntityManagerFactorySingleton;

public class Teste {

	public static void main(String[] args) {
		EntityManagerFactory f = EntityManagerFactorySingleton.getInstance();
		EntityManager em = f.createEntityManager();

		Cliente cliente = new Cliente("Teste", Calendar.getInstance(), Sexo.FEMININO);
		
		
		em.close();
		f.close();
	}
	
}
