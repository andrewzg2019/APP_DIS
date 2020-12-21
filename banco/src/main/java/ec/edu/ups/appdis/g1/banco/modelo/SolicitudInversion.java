package ec.edu.ups.appdis.g1.banco.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SolicitudInversion {
	@Id
	private int id;
	private int plazo;
	private double monto;
	private double tasaInteresValor;
	private double tasaInteresPorcentaje;
	private double totalPoliza;
	private Date fechaInicio;
	private Date fechaFin;
	private String estado;
	private String cedulaIMG;
	private String planillaIMG;
	private Cliente cliente;
	private Empleado empleado;
	
	
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPlazo() {
		return plazo;
	}
	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public double getTasaInteresValor() {
		return tasaInteresValor;
	}
	public void setTasaInteresValor(double tasaInteresValor) {
		this.tasaInteresValor = tasaInteresValor;
	}
	public double getTasaInteresPorcentaje() {
		return tasaInteresPorcentaje;
	}
	public void setTasaInteresPorcentaje(double tasaInteresPorcentaje) {
		this.tasaInteresPorcentaje = tasaInteresPorcentaje;
	}
	public double getTotalPoliza() {
		return totalPoliza;
	}
	public void setTotalPoliza(double totalPoliza) {
		this.totalPoliza = totalPoliza;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCedulaIMG() {
		return cedulaIMG;
	}
	public void setCedulaIMG(String cedulaIMG) {
		this.cedulaIMG = cedulaIMG;
	}
	public String getPlanillaIMG() {
		return planillaIMG;
	}
	public void setPlanillaIMG(String planillaIMG) {
		this.planillaIMG = planillaIMG;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	@Override
	public String toString() {
		return "Solicitud_Inversion [id=" + id + ", plazo=" + plazo + ", monto=" + monto + ", tasaInteresValor="
				+ tasaInteresValor + ", tasaInteresPorcentaje=" + tasaInteresPorcentaje + ", totalPoliza=" + totalPoliza
				+ ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", estado=" + estado + ", cedulaIMG="
				+ cedulaIMG + ", planillaIMG=" + planillaIMG + ", cliente=" + cliente + "]";
	}
	
}
