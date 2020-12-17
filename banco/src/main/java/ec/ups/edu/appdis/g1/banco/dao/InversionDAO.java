package ec.ups.edu.appdis.g1.banco.dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.Query;

import ec.ups.edu.appdis.g1.banco.modelo.Inversion;

public class InversionDAO {

	public boolean insertJPA(Inversion entity) throws SQLException {
		em.persist(entity);
		return true;
		
	}
	
	public boolean updateJPA(Inversion entity) {
		em.merge(entity);
		return true;
	}
	
	public Inversion readJPA(int id)  {
		Inversion Inversion = em.find(Inversion.class, id);
		return Inversion;		
	}
	
	public boolean deleteJPA(int id) throws SQLException {
		Inversion Inversion = this.readJPA(id);
		em.remove(Inversion);
		return true;		
	}
	public List<Inversion> getInversion(){
		String jpql = "SELECT s FROM Inversion s WHERE id = ?";
		Query q = em.createQuery(jpql, Inversion.class);
		q.setParameter(1, 1);
		return (List<Inversion>) q.getResultList();
	}
	
}
