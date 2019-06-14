package br.com.fean.service;

import java.util.List;

import br.com.fean.entity.ClienteEntity;

public interface ClienteService {
	
	public List<ClienteEntity> list();

	public void create(ClienteEntity t);

	public void update(ClienteEntity t);

	public void delete(ClienteEntity t);

}
