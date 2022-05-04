package ar.edu.unq.po2.tp4;

public class IngresoPercibido {
	
	private String mesDePercepci�n;
	private String concepto;
	private float montoPercibido;
	
	public IngresoPercibido(String mesDePercepci�n, String concepto, float montoPercibido) {
		this.setMesDePercepci�n(mesDePercepci�n);
		this.setConcepto(concepto);
		this.setMontoPercibido(montoPercibido);
	}
	
	// Getters y Setters
	public String getMesDePercepci�n() {
		return mesDePercepci�n;
	}
	public void setMesDePercepci�n(String mesDePercepci�n) {
		this.mesDePercepci�n = mesDePercepci�n;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public float getMontoPercibido() {
		return montoPercibido;
	}
	public void setMontoPercibido(float montoPercibido) {
		this.montoPercibido = montoPercibido;
	}

	public float getMontoImponible() {
		return this.getMontoPercibido();
	}
}