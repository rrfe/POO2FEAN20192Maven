package br.com.fean.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fean.entity.ClienteEntity;

// T é um generico, quando implementa T. Quer receber qualquer classe. Classe qualquer que define. Composição 
public class ClienteDAOImpl implements ClienteDAO {

	private static List<ClienteEntity> bancoCliente = new ArrayList<ClienteEntity>();

	public List<ClienteEntity> list() {
		return bancoCliente;
	}

	public void create(ClienteEntity t) {
		ClienteDAOImpl.bancoCliente.add(t);

	}

	public void update(ClienteEntity t) {
		for (ClienteEntity item : bancoCliente) {
			if (item.getCpf().equals(t.getCpf())) {
				item.setIdade(t.getIdade());
				item.setNome(t.getNome());
			}
		}
			
	}

	public void delete(ClienteEntity t) {
		for (ClienteEntity item : bancoCliente) {
			if (item.getCpf().equals(t.getCpf())) {
				bancoCliente.remove(item);
			}
		}
	}

}
