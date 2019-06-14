package br.com.fean.view;

import java.util.List;

import javax.swing.JOptionPane;

import br.com.fean.entity.ProdutoEntity;
import br.com.fean.service.ProdutoService;
import br.com.fean.service.ProdutoServiceImpl;

public class ProdutoView {

	ProdutoService produtoService = new ProdutoServiceImpl();
 void montarMenuProduto() {

		int menu = 90;
		while (menu != 0) {
			switch (menu = Integer.parseInt(JOptionPane
					.showInputDialog("Qual ação do grud desaja fazer: \n" + " 1 - Cadastrar \n" + " 2 - Editar \n"
							+ " 3 - Listar \n" + "4 - Deletar \n" + " 0 - Voltar ao menu principal. \n "))) {
			case 1:
				JOptionPane.showMessageDialog(null, "Opção escolhida foi: Cadastrar ");
				
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Opção escolhida foi:  Editar ");
				update();
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Opção escolhida foi: Listar ");
				listar();
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Opção escolhida foi: Listar ");
				deletar();
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Opção escolhida foi: Deletar ");
				deletar();
				break;
			case 6:
				JOptionPane.showMessageDialog(null, "Opção escolhida foi: Voltar ao menu pricipal.");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção invalida, tente outra vez");
				deletar();
			}

			// digite 1 apra cadatarr 2 para editar 3 para listar 4 para deletar
		}
	}

	public void create() {

		ProdutoEntity c = new ProdutoEntity();
		c.setId(JOptionPane.showInputDialog("Codigo do porduto: "));
		c.setNome(JOptionPane.showInputDialog("Nome do produto: "));
		this.produtoService.create(c);
		JOptionPane.showMessageDialog(null, "Cadastrado com sucesso: \n" + " \n" + c.getId() + " \n" + c.getNome());

	}

	public void update() {

		ProdutoEntity c = new ProdutoEntity();
		int idAlterar = Integer.parseInt(JOptionPane.showInputDialog("Qual id deseja alterar?"));
		c.equals(idAlterar);
		c.setNome(JOptionPane.showInputDialog("Qual seu nome: "));
		this.produtoService.update(c);
		JOptionPane.showMessageDialog(null, "Editado com sucesso: \n" + c.getNome());
	}

	public void deletar() {
		String cpf = (JOptionPane.showInputDialog("Qual seu CPF: "));
		ProdutoEntity c = new ProdutoEntity();
		c.setId(cpf);
		produtoService.delete(c);
		JOptionPane.showMessageDialog(null, "deletado com susceso: " + cpf);
	}

	public void listar() {

		List<ProdutoEntity> list = produtoService.list();

		JOptionPane.showMessageDialog(null, "Lista de produto cadastrados: \n" + list.toString());

		// JOptionPane.showMessageDialog(null, "Lista de clientes cadastrados: \n" +
		// list.toArray());

		// jogar na tela para o usuario ver os clientes qeu tem na lista
	}

}
