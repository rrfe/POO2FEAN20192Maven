package br.com.fean.service;

import java.util.List;

import br.com.fean.entity.ProdutoEntity;

public interface ProdutoService {

	public List<ProdutoEntity> list();

	public void create(ProdutoEntity t);

	public void update(ProdutoEntity t);

	public void delete(ProdutoEntity t);

}
