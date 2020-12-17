package ec.ups.edu.appdis.g1.banco.dao;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.Query;

import ec.edu.ups.appdis.g1.modelo.Empleado;
import ec.ups.edu.appdis.g1.banco.modelo.Empleado;

public class EmpleadoDAO {
	
	public boolean insertJPA(Empleado entity) throws SQLException {
		em.persist(entity);
		return true;
		
	}
	
	public boolean updateJPA(Empleado entity) {
		em.merge(entity);
		return true;
	}
	
	public Empleado readJPA(int id)  {
		Empleado Empleado = em.find(Empleado.class, id);
		return Empleado;		
	}
	
	public boolean deleteJPA(int id) throws SQLException {
		Empleado Empleado = this.readJPA(id);
		em.remove(Empleado);
		return true;		
	}
	public List<Empleado> getEmpleado(){
		String jpql = "SELECT s FROM Empleado s WHERE id = ?";
		Query q = em.createQuery(jpql, Empleado.class);
		q.setParameter(1, 1);
		return (List<Empleado>) q.getResultList();
	}
}
