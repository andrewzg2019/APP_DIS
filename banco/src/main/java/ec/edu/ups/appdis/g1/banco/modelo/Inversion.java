package ec.edu.ups.appdis.g1.banco.modelo;

public class Inversion {
	
	private String idInversion;
	private String monto;
	private String frecuencia;
	private String plazo;
	private String tasa;
	private double interesesGanados;
	private Inversion inversion;
	
	
	public Inversion getInversion() {
		return inversion;
	}
	public void setInversion(Inversion inversion) {
		this.inversion = inversion;
	}
	public String getIdInversion() {
		return idInversion;
	}
	public void setIdInversion(String idInversion) {
		this.idInversion = idInversion;
	}
	public String getMonto() {
		return monto;
	}
	public void setMonto(String monto) {
		this.monto = monto;
	}
	public String getFrecuencia() {
		return frecuencia;
	}
	public void setFrecuencia(String frecuencia) {
		this.frecuencia = frecuencia;
	}
	public String getPlazo() {
		return plazo;
	}
	public void setPlazo(String plazo) {
		this.plazo = plazo;
	}
	public String getTasa() {
		return tasa;
	}
	public void setTasa(String tasa) {
		this.tasa = tasa;
	}
	public double getInteresesGanados() {
		return interesesGanados;
	}
	public void setInteresesGanados(double interesesGanados) {
		this.interesesGanados = interesesGanados;
	}
	
	@Override
	public String toString() {
		return "Inversion [idInversion=" + idInversion + ", monto=" + monto + ", frecuencia=" + frecuencia + ", plazo="
				+ plazo + ", tasa=" + tasa + ", interesesGanados=" + interesesGanados + "]";
	}
	
}
