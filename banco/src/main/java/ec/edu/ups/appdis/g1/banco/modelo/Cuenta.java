package ec.edu.ups.appdis.g1.banco.modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Cuenta {
	@Id
	private int numeroCuenta;
	private double saldo;
	private String tipoCuenta;
	private Date fechaRegistro;
	private String estado;
	private Empleado empleado;
	private Cliente cliente;
	private List<Transaccion> transacciones;
	
	public List<Transaccion> getTransacciones() {
		return transacciones;
	}
	public void setTransacciones(List<Transaccion> transacciones) {
		this.transacciones = transacciones;
	}
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getTipoCuenta() {
		return tipoCuenta;
	}
	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", tipoCuenta=" + tipoCuenta
				+ ", fechaRegistro=" + fechaRegistro + ", estado=" + estado + ", empleado=" + empleado + ", cliente="
				+ cliente + "]";
	}

}
