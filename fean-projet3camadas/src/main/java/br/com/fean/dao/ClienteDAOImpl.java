package br.com.fean.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import br.com.fean.entity.ClienteEntity;

// T é um generico, quando implementa T. Quer receber qualquer classe. Classe qualquer que define. Composição 

public class ClienteDAOImpl implements ClienteDAO {

	EntityManagerFactory emf;
	EntityManager em;

	public void create(ClienteEntity cliente) {
		em.getTransaction().begin();
		em.persist(cliente);
	}

	public ClienteDAOImpl() {
		em = getEntityManager();
	}

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("db_poo2_20191");
		if (em == null) {
			em = factory.createEntityManager();
		}

		return em;
	}

	public void update(ClienteEntity cliente) {
		em.getTransaction().begin();
		em.merge(cliente);
		em.getTransaction().commit();
		emf.close();
	}

	public void delete(ClienteEntity cliente) {
		em.getTransaction().begin();
		em.remove(cliente);
		em.getTransaction().commit();
		emf.close();
	}

	@SuppressWarnings("unchecked")
	public List<ClienteEntity> listarTodos() {

		em.getTransaction().begin();
		Query consulta = em.createQuery("select cliente from Cliente cliente");
		List<ClienteEntity> clientes = consulta.getResultList();
		em.getTransaction().commit();
		emf.close();
		return clientes;

	}

}
// *******************************************************************************************************

/*
 * private static List<ClienteEntity> bancoCliente = new
 * ArrayList<ClienteEntity>();
 * 
 * public List<ClienteEntity> list() { return bancoCliente; }
 * 
 * public void create(ClienteEntity t) { ClienteDAOImpl.bancoCliente.add(t);
 * 
 * }
 * 
 * public void update(ClienteEntity t) { for (ClienteEntity item : bancoCliente)
 * { if (item.getCpf().equals(t.getCpf())) { item.setIdade(t.getIdade());
 * item.setNome(t.getNome()); } }
 * 
 * }
 * 
 * public void delete(ClienteEntity t) { for (ClienteEntity item : bancoCliente)
 * { if (item.getCpf().equals(t.getCpf())) { bancoCliente.remove(item); } } }
 * 
 * }
 */
