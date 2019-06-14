package br.com.fean.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fean.entity.ProdutoEntity;

//T é um generico, quando implementa T. Quer receber qualquer classe. Classe qualquer que define.Composição 

public class ProdutoDAOImpl implements ProdutoDAO {

	private static List<ProdutoEntity> bancoProduto = new ArrayList<ProdutoEntity>();

	public List<ProdutoEntity> list() {
		return bancoProduto;
	}

	public void create(ProdutoEntity t) {
		ProdutoDAOImpl.bancoProduto.add(t);

	}

	public void update(ProdutoEntity t) {
		for (ProdutoEntity item : bancoProduto) {
			if (item.getId().equals(t.getId())) {
				item.setPedido(t.getPedido());
				item.setNome(t.getNome());
			}
		}

	}

	public void delete(ProdutoEntity t) {
		for (ProdutoEntity item : bancoProduto) {
			if (item.getId().equals(t.getId())) {
				bancoProduto.remove(item);
			}
		}
	}

}