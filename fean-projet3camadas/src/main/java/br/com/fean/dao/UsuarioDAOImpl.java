package br.com.fean.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fean.entity.UsuarioEntity;

// T é um generico, quando implementa T. Quer receber qualquer classe. Classe
// qualquer que define. Composição

public class UsuarioDAOImpl implements UsuarioDAO {

	private static List<UsuarioEntity> bancoUsuario = new ArrayList<UsuarioEntity>();

	public List<UsuarioEntity> list() {
		return bancoUsuario;
	}

	public void create(UsuarioEntity t) {
		UsuarioDAOImpl.bancoUsuario.add(t);

	}

	public void update(UsuarioEntity t) {
		for (UsuarioEntity item : bancoUsuario) {
			if (item.getId().equals(t.getId())) {
				item.setSenha(t.getSenha());
				item.setNome(t.getNome());
			}
		}

	}

	public void delete(UsuarioEntity t) {
		for (UsuarioEntity item : bancoUsuario) {
			if (item.getId().equals(t.getId())) {
				bancoUsuario.remove(item);
			}
		}
	}

}
