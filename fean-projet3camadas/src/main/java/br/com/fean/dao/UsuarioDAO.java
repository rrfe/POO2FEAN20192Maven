package br.com.fean.dao;

import java.util.List;

import br.com.fean.entity.UsuarioEntity;

public interface UsuarioDAO {

	public List<UsuarioEntity> list();

	public void create(UsuarioEntity t);

	public void update(UsuarioEntity t);

	public void delete(UsuarioEntity t);

}
