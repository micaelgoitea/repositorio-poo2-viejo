package ar.edu.unq.po2.tp4;

public class IngresoHorasExtras extends IngresoPercibido {
	
	private int horasExtrasRealizadas;
	
	public IngresoHorasExtras(String mesDePercepci�n, String concepto, float montoPercibido, int horasExtrasRealizadas) {
		super(mesDePercepci�n, concepto, montoPercibido);
		this.setHorasExtrasRealizadas(horasExtrasRealizadas);
	}

	public int getHorasExtrasRealizadas() {
		return horasExtrasRealizadas;
	}

	public void setHorasExtrasRealizadas(int horasExtrasRealizadas) {
		this.horasExtrasRealizadas = horasExtrasRealizadas;
	}
	
	@Override
	public float getMontoImponible() {
		return 0;
	} 
}