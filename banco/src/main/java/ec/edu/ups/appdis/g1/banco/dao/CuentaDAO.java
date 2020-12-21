package ec.edu.ups.appdis.g1.banco.dao;
import java.sql.SQLException;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.appdis.g1.banco.modelo.Cuenta;
@Stateless
public class CuentaDAO {
	
	@Inject
	private EntityManager em;
	
	public boolean insertJPA(Cuenta entity) throws SQLException {
		em.persist(entity);
		return true;
		
	}
	
	public boolean updateJPA(Cuenta entity) {
		em.merge(entity);
		return true;
	}
	
	public Cuenta readJPA(int id)  {
		Cuenta Cuenta = em.find(Cuenta.class, id);
		return Cuenta;		
	}
	
	public boolean deleteJPA(int id) throws SQLException {
		Cuenta Cuenta = this.readJPA(id);
		em.remove(Cuenta);
		return true;		
	}
	public List<Cuenta> getCuenta(){
		String jpql = "SELECT s FROM Cuenta s WHERE id = ?";
		Query q = em.createQuery(jpql, Cuenta.class);
		q.setParameter(1, 1);
		return (List<Cuenta>) q.getResultList();
	}
}
