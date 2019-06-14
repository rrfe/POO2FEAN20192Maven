package br.com.fean.entity;

public class ProdutoEntity {

	protected String id;
	protected String nome;
	protected String pedido;
	protected String notaFiscal;

	public String getId() {
		return id;
	}

	public void setId(String string) {
		this.id = string;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPedido() {
		return pedido;
	}

	public void setPedido(String pedido) {
		this.pedido = pedido;
	}

	public String getNotaFiscal() {
		return notaFiscal;
	}

	public void setNotaFiscal(String notaFiscal) {
		this.notaFiscal = notaFiscal;
	}

}
