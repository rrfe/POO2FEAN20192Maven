package br.com.fean.dao;

import java.util.List;

import br.com.fean.entity.ProdutoEntity;

public interface ProdutoDAO {

	public List<ProdutoEntity> list();

	public void create(ProdutoEntity t);

	public void update(ProdutoEntity t);

	public void delete(ProdutoEntity t);

}
