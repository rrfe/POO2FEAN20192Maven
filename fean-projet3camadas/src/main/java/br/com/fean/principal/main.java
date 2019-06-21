package br.com.fean.principal;

import javax.swing.JOptionPane;

import com.exemplo.entidade.Cliente;
import com.exemplo.entidade.RepositorioCliente;

import br.com.fean.dao.ClienteDAO;
import br.com.fean.dao.ClienteDAOImpl;
import br.com.fean.entity.ClienteEntity;
import br.com.fean.view.ClienteView;
import br.com.fean.view.ProdutoView;
import br.com.fean.view.UsuarioView;

public class main {

	public static void main(String[] args) {

		ClienteDAOImpl clienteDAOImpl = new ClienteDAOImpl();
		ClienteEntity clienteEntity = new ClienteEntity();
		clienteDAOImpl.create(clienteEntity);
	}

}

/*
 * public static void main(String[] args) {
 * 
 * int opcaoMenu = 90; main testa = new main(); while (opcaoMenu != 0) { switch
 * (testa.mainView()) {
 * 
 * case 1:
 * 
 * new ClienteView().montarMenu(); break;
 * 
 * case 0: JOptionPane.showMessageDialog(null, "Obrigado até mais!");
 * System.exit(0); break; default: JOptionPane.showMessageDialog(null,
 * "Opção invalida, tente outra vez"); testa.mainView(); break;
 * 
 * }
 * 
 * new ClienteView(); new ProdutoView(); new UsuarioView();
 * 
 * } }
 * 
 * private int mainView() {
 * 
 * String opcaoMenu = JOptionPane
 * .showInputDialog("            MENU PRINCIPAL          \n" +
 * "Qual Opção deseja manipular \n" + " 1 - Cliente \n" + " 2 - Produto \n" +
 * " 3 - Usuario \n" + " 0 - Sair Menu \n "); if (opcaoMenu.replaceAll("\\D",
 * "").isEmpty()) { return -1; } return
 * Integer.parseInt(opcaoMenu.replaceAll("\\D", "")); }
 */

//}