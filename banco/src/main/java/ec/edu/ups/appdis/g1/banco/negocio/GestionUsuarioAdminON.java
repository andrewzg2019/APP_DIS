package ec.edu.ups.appdis.g1.banco.negocio;

import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.appdis.g1.banco.dao.EmpleadoDAO;
import ec.edu.ups.appdis.g1.banco.modelo.Empleado;

@Stateless
public class GestionUsuarioAdminON {

	@Inject
	private EmpleadoDAO daoEmpleado;
	
	public boolean registrarCliente(Empleado empleado) throws Exception {
		
		if(empleado.getCedula().length()!=10)
			throw new Exception("Cedula Incorrecta");
		
		try {
			daoEmpleado.insertJPA(empleado);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return true;
	}
	
	//Metodos
	
	

}
