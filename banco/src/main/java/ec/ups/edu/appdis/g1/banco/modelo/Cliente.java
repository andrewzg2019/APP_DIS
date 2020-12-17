package ec.ups.edu.appdis.g1.banco.modelo;

import java.util.List;

public class Cliente {
	
	private int id;
	private String nombre;
	private String apellido;
	private String direccion;
	private String email;
	private String telefono;
	private List<Solicitud_Inversion> solicitudLista;
	private List<Cuenta> cuentasLista;
	private String nombreUsuario;
	private int contrasenia;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public List<Solicitud_Inversion> getSolicitudLista() {
		return solicitudLista;
	}
	public void setSolicitudLista(List<Solicitud_Inversion> solicitudLista) {
		this.solicitudLista = solicitudLista;
	}
	public List<Cuenta> getCuentasLista() {
		return cuentasLista;
	}
	public void setCuentasLista(List<Cuenta> cuentasLista) {
		this.cuentasLista = cuentasLista;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public int getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(int contrasenia) {
		this.contrasenia = contrasenia;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ ", email=" + email + ", telefono=" + telefono + ", solicitudLista=" + solicitudLista
				+ ", cuentasLista=" + cuentasLista + ", nombreUsuario=" + nombreUsuario + ", contrasenia=" + contrasenia
				+ "]";
	}
	
	
	
}
