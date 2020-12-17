package ec.edu.ups.appdis.g1.banco.modelo;

import java.util.Date;

public class Transferencia {
	
	private int id;
	private Date fechaRegistro;
	private int cuentaOrigen;
	private int cuentaDestino;
	private double comision;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public int getCuentaOrigen() {
		return cuentaOrigen;
	}
	public void setCuentaOrigen(int cuentaOrigen) {
		this.cuentaOrigen = cuentaOrigen;
	}
	public int getCuentaDestino() {
		return cuentaDestino;
	}
	public void setCuentaDestino(int cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}
	public double getComision() {
		return comision;
	}
	public void setComision(double comision) {
		this.comision = comision;
	}
	
	@Override
	public String toString() {
		return "Transferencia [id=" + id + ", fechaRegistro=" + fechaRegistro + ", cuentaOrigen=" + cuentaOrigen
				+ ", cuentaDestino=" + cuentaDestino + ", comision=" + comision + "]";
	}
}
