package br.com.fean.dao;

import java.util.List;

import br.com.fean.entity.ClienteEntity;

public interface ClienteDAO {

	public List<ClienteEntity> listarTodos();

	public void create(ClienteEntity t);

	public void update(ClienteEntity t);

	public void delete(ClienteEntity t);

}
