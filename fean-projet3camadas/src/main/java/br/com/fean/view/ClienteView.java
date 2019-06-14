package br.com.fean.view;

import java.util.List;

import javax.swing.JOptionPane;

import br.com.fean.entity.ClienteEntity;
import br.com.fean.service.ClienteService;
import br.com.fean.service.ClienteServiceImpl;

public class ClienteView {

	ClienteService clienteService = new ClienteServiceImpl();

	public void montarMenu() {

		int menu = 10;
		while (menu != 0) {
			switch (menu = Integer.parseInt(
					JOptionPane.showInputDialog("                    CLIENTE \n"+ 
							"Escolha uma das opções que deseja executar:\r\n"  
							+ " 1 - Cadastrar \n" + " 2 - Editar \n"
							+ " 3 - Listar \n" + " 4 - Deletar \n" + " 0 - Voltar ao menu principal. \n "))) {
			case 1:
				create();
				break;
			case 2:
				update();
				break;
			case 3:
				listar();
				break;
			case 4:
				deletar();
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "Opção escolhida foi: Voltar ao menu pricipal.");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção invalida, tente outra vez");
			}

		}
	}

	public void create() {

		ClienteEntity c = new ClienteEntity();
		c.setCpf(JOptionPane.showInputDialog("Qual seu CPF: "));
		c.setNome(JOptionPane.showInputDialog("Qual seu nome: "));
		c.setIdade(JOptionPane.showInputDialog("Qual seu idade: "));
		this.clienteService.create(c);
		JOptionPane.showMessageDialog(null,
				"Cadastrado com sucesso: \n" + " \n" + c.getCpf() + " \n" + c.getNome() + " \n" + c.getIdade());

	}

	public void update() {

		ClienteEntity c = new ClienteEntity();
		int cpfAlterar = Integer.parseInt(JOptionPane.showInputDialog("Qual CPF deseja alterar?"));
		c.equals(cpfAlterar);
		c.setNome(JOptionPane.showInputDialog("Qual seu nome: "));
		c.setIdade(JOptionPane.showInputDialog("Qual seu idade: "));
		this.clienteService.update(c);
		JOptionPane.showMessageDialog(null, "Editado com sucesso: \n" + c.getNome() + " \n" + c.getIdade());
	}

	public void deletar() {
		String cpfDeletar = (JOptionPane.showInputDialog("Qual seu CPF: "));
		ClienteEntity c = new ClienteEntity();
		c.equals(cpfDeletar);
		clienteService.delete(c);
		JOptionPane.showMessageDialog(null, "deletado com susceso: " + cpfDeletar);
	}

	public void listar() {

		List<ClienteEntity> list = clienteService.list();
		
		StringBuilder sb = new StringBuilder();
		
		for (ClienteEntity clienteEntity : list) {
			sb.append("CPF: " + clienteEntity.getCpf() + " | NOME: " + clienteEntity.getNome() + " | IDADE: " + clienteEntity.getIdade() + "\n");
		}
		
		JOptionPane.showMessageDialog(null, "Lista de clientes cadastrados: \n" + sb.toString());


		// jogar na tela para o usuario ver os clientes qeu tem na lista
	}

}
