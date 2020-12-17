package ec.edu.ups.appdis.g1.banco.modelo;

import java.util.Date;

public class Sesion {
	
	private int id;
	private String usuario;
	private String contrasenia;
	private Date fecha;
	private int numeroIntentos;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getNumeroIntentos() {
		return numeroIntentos;
	}
	public void setNumeroIntentos(int numeroIntentos) {
		this.numeroIntentos = numeroIntentos;
	}
	
	@Override
	public String toString() {
		return "Sesion [id=" + id + ", usuario=" + usuario + ", contrasenia=" + contrasenia + ", fecha=" + fecha
				+ ", numeroIntentos=" + numeroIntentos + "]";
	}
	

}
