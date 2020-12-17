package ec.ups.edu.appdis.g1.banco.dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.Query;

import ec.edu.ups.appdis.g1.modelo.Sesion;
import ec.ups.edu.appdis.g1.banco.modelo.Sesion;

public class SesionDAO {

	public boolean insertJPA(Sesion entity) throws SQLException {
		em.persist(entity);
		return true;
		
	}
	
	public boolean updateJPA(Sesion entity) {
		em.merge(entity);
		return true;
	}
	
	public Sesion readJPA(int id)  {
		Sesion Sesion = em.find(Sesion.class, id);
		return Sesion;		
	}
	
	public boolean deleteJPA(int id) throws SQLException {
		Sesion Sesion = this.readJPA(id);
		em.remove(Sesion);
		return true;		
	}
	public List<Sesion> getSesion(){
		String jpql = "SELECT s FROM Sesion s WHERE id = ?";
		Query q = em.createQuery(jpql, Sesion.class);
		q.setParameter(1, 1);
		return (List<Sesion>) q.getResultList();
	}
}
