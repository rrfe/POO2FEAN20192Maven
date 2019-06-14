package br.com.fean.service;

import java.util.List;

import br.com.fean.entity.UsuarioEntity;

public interface UsuarioService {

	public List<UsuarioEntity> list();

	public void create(UsuarioEntity t);

	public void update(UsuarioEntity t);

	public void delete(UsuarioEntity t);

}