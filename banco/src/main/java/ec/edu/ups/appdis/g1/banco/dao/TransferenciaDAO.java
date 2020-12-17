package ec.edu.ups.appdis.g1.banco.dao;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.appdis.g1.banco.modelo.Transferencia;

public class TransferenciaDAO {
	
	@Inject
	private EntityManager em;

	public boolean insertJPA(Transferencia entity) throws SQLException {
		em.persist(entity);
		return true;
		
	}
	
	public boolean updateJPA(Transferencia entity) {
		em.merge(entity);
		return true;
	}
	
	public Transferencia readJPA(int id)  {
		Transferencia Transferencia = em.find(Transferencia.class, id);
		return Transferencia;		
	}
	
	public boolean deleteJPA(int id) throws SQLException {
		Transferencia Transferencia = this.readJPA(id);
		em.remove(Transferencia);
		return true;		
	}
	public List<Transferencia> getTransferencia(){
		String jpql = "SELECT s FROM Transferencia s WHERE id = ?";
		Query q = em.createQuery(jpql, Transferencia.class);
		q.setParameter(1, 1);
		return (List<Transferencia>) q.getResultList();
	}
}
