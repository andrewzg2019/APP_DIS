package ec.edu.ups.appdis.g1.banco.dao;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.appdis.g1.banco.modelo.Transaccion;

public class TransaccionDAO {
	
	@Inject
	private EntityManager em;

	public boolean insertJPA(Transaccion entity) throws SQLException {
		em.persist(entity);
		return true;
		
	}
	
	public boolean updateJPA(Transaccion entity) {
		em.merge(entity);
		return true;
	}
	
	public Transaccion readJPA(int id)  {
		Transaccion Transaccion = em.find(Transaccion.class, id);
		return Transaccion;		
	}
	
	public boolean deleteJPA(int id) throws SQLException {
		Transaccion Transaccion = this.readJPA(id);
		em.remove(Transaccion);
		return true;		
	}
	public List<Transaccion> getTransaccion(){
		String jpql = "SELECT s FROM Transaccion s WHERE id = ?";
		Query q = em.createQuery(jpql, Transaccion.class);
		q.setParameter(1, 1);
		return (List<Transaccion>) q.getResultList();
	}
}
