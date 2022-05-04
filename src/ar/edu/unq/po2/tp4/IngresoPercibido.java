package ar.edu.unq.po2.tp4;

public class IngresoPercibido {
	
	private String mesDePercepción;
	private String concepto;
	private float montoPercibido;
	
	public IngresoPercibido(String mesDePercepción, String concepto, float montoPercibido) {
		this.setMesDePercepción(mesDePercepción);
		this.setConcepto(concepto);
		this.setMontoPercibido(montoPercibido);
	}
	
	// Getters y Setters
	public String getMesDePercepción() {
		return mesDePercepción;
	}
	public void setMesDePercepción(String mesDePercepción) {
		this.mesDePercepción = mesDePercepción;
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