package br.com.fean.service;

import java.util.List;

import br.com.fean.dao.ClienteDAO;
import br.com.fean.dao.ClienteDAOImpl;
import br.com.fean.entity.ClienteEntity;

public class ClienteServiceImpl implements ClienteService {
	
	private ClienteDAO clienteDao = new ClienteDAOImpl();
	
	public List<ClienteEntity> list() {

		return this.clienteDao.list();
	}

	public void create(ClienteEntity cliente) {
		this.clienteDao.create(cliente);

	}

	public void update(ClienteEntity cliente) {
		this.clienteDao.update(cliente);

	}

	public void delete(ClienteEntity cliente) {
		this.clienteDao.delete(cliente);

	}
}
