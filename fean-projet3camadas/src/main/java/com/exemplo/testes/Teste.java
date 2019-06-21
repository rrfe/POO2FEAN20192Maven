package com.exemplo.testes;

import com.exemplo.entidade.Cliente;
import com.exemplo.entidade.RepositorioCliente;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RepositorioCliente repositorioCliente = new RepositorioCliente();
		Cliente cliente = new Cliente();
		cliente.setName("Teste");
		cliente.setIdade(22);

		repositorioCliente.salvar(cliente);
	}

}
