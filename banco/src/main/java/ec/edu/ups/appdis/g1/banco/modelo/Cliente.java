package ec.edu.ups.appdis.g1.banco.modelo;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Cliente {
	@Id
	private String dni;
	private String nombre;
	private String apellido;
	private String direccion;
	private String email;
	private String telefono;
	@OneToMany(mappedBy = "cliente")
	private Set<SolicitudInversion> solicitudLista;
	@OneToMany(mappedBy = "cliente")
	private Set<Cuenta> cuentasLista;
	private String nombreUsuario;
	private int contrasenia;
	
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
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
	public Set<Cuenta> getCuentasLista() {
		return cuentasLista;
	}
	public void setCuentasLista(Set<Cuenta> cuentasLista) {
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
	
	public Set<SolicitudInversion> getSolicitudLista() {
		return solicitudLista;
	}
	public void setSolicitudLista(Set<SolicitudInversion> solicitudLista) {
		this.solicitudLista = solicitudLista;
	}
	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ ", email=" + email + ", telefono=" + telefono + ", solicitudLista=" + solicitudLista
				+ ", cuentasLista=" + cuentasLista + ", nombreUsuario=" + nombreUsuario + ", contrasenia=" + contrasenia
				+ "]";
	}
	
}
