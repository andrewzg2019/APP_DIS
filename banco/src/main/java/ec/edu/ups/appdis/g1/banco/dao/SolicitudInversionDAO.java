package ec.edu.ups.appdis.g1.banco.dao;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.appdis.g1.banco.modelo.SolicitudInversion;

public class SolicitudInversionDAO {
	
	@Inject
	private EntityManager em;

	public boolean insertJPA(SolicitudInversion entity) throws SQLException {
		em.persist(entity);
		return true;
		
	}
	
	public boolean updateJPA(SolicitudInversion entity) {
		em.merge(entity);
		return true;
	}
	
	public SolicitudInversion readJPA(int id)  {
		SolicitudInversion SolicitudInversion = em.find(SolicitudInversion.class, id);
		return SolicitudInversion;		
	}
	
	public boolean deleteJPA(int id) throws SQLException {
		SolicitudInversion SolicitudInversion = this.readJPA(id);
		em.remove(SolicitudInversion);
		return true;		
	}
	public List<SolicitudInversion> getSolicitudInversion(){
		String jpql = "SELECT s FROM SolicitudInversion s WHERE id = ?";
		Query q = em.createQuery(jpql, SolicitudInversion.class);
		q.setParameter(1, 1);
		return (List<SolicitudInversion>) q.getResultList();
	}
	
	
}
