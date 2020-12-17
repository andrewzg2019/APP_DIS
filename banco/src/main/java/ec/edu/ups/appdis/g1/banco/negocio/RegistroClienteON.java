package ec.edu.ups.appdis.g1.banco.negocio;

import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.appdis.g1.banco.dao.ClienteDAO;
import ec.edu.ups.appdis.g1.banco.modelo.Cliente;

@Stateless
public class RegistroClienteON {
	
	@Inject
	private ClienteDAO daoCliente;
	
	public boolean registrarCliente(Cliente cliente) throws Exception {

		if (cliente.getDni().length() != 10)
			throw new Exception("Cedula Incorrecta");

		try {
			daoCliente.insertJPA(cliente);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return true;
	}

}
