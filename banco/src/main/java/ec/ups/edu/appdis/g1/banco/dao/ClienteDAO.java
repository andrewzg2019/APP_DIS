package ec.ups.edu.appdis.g1.banco.dao;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.ups.edu.appdis.g1.banco.modelo.Cliente;

public class ClienteDAO {

	@Inject
	private EntityManager em;
	public boolean insertJPA(Cliente entity) throws SQLException {
		em.persist(entity);
		return true;
		
	}
	
	public boolean updateJPA(Cliente entity) {
		em.merge(entity);
		return true;
	}
	
	public Cliente readJPA(int id)  {
		Cliente Cliente = em.find(Cliente.class, id);
		return Cliente;		
	}
	
	public boolean deleteJPA(int id) throws SQLException {
		Cliente Cliente = this.readJPA(id);
		em.remove(Cliente);
		return true;		
	}
	public List<Cliente> getCliente(){
		String jpql = "SELECT c FROM Cliente c WHERE id = ?";
		Query q = em.createQuery(jpql, Cliente.class);
		q.setParameter(1, 1);
		return (List<Cliente>) q.getResultList();
	}
	
}
