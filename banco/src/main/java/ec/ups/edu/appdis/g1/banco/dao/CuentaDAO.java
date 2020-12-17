package ec.ups.edu.appdis.g1.banco.dao;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.Query;

import ec.ups.edu.appdis.g1.banco.modelo.Cuenta;

public class CuentaDAO {
	
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
