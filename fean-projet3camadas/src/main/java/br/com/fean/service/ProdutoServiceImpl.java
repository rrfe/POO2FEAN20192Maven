package br.com.fean.service;

import java.util.List;

import br.com.fean.dao.ProdutoDAO;
import br.com.fean.dao.ProdutoDAOImpl;
import br.com.fean.entity.ProdutoEntity;

public class ProdutoServiceImpl implements ProdutoService {

	private ProdutoDAO produtoDao = new ProdutoDAOImpl();

	public List<ProdutoEntity> list() {

		return this.produtoDao.list();
	}

	public void create(ProdutoEntity produto) {
		this.produtoDao.create(produto);

	}

	public void update(ProdutoEntity produto) {
		this.produtoDao.update(produto);

	}

	public void delete(ProdutoEntity produto) {
		this.produtoDao.delete(produto);

	}
}
