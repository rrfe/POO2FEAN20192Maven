package br.com.fean.service;

import java.util.List;

import br.com.fean.dao.UsuarioDAO;
import br.com.fean.dao.UsuarioDAOImpl;
import br.com.fean.entity.UsuarioEntity;

public class UsuarioServiceImpl implements UsuarioService {

	private UsuarioDAO usuarioDAO = new UsuarioDAOImpl();

	public List<UsuarioEntity> list() {

		return this.usuarioDAO.list();
	}

	public void create(UsuarioEntity usuario) {
		this.usuarioDAO.create(usuario);

	}

	public void update(UsuarioEntity usuario) {
		this.usuarioDAO.update(usuario);

	}

	public void delete(UsuarioEntity usuario) {
		this.usuarioDAO.delete(usuario);

	}

}
