package ec.edu.ups.appdis.g1.banco.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Transaccion {
	@Id
	private int id;
	private Date fechaRegistro;
	private double comision;
	private double monto;
	private String tipoTransaccion;
	
	
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
	public double getComision() {
		return comision;
	}
	public void setComision(double comision) {
		this.comision = comision;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public String getTipoTransaccion() {
		return tipoTransaccion;
	}
	public void setTipoTransaccion(String tipoTransaccion) {
		this.tipoTransaccion = tipoTransaccion;
	}
	
	@Override
	public String toString() {
		return "Transaccion [id=" + id + ", fechaRegistro=" + fechaRegistro + ", comision=" + comision + ", monto="
				+ monto + ", tipoTransaccion=" + tipoTransaccion + "]";
	}

}
