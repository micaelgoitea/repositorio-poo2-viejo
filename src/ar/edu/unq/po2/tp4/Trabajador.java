package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	
	private List<IngresoPercibido> ingresosPercibidosDelA�o = new ArrayList<>();
	
	public void agregarIngresoPercibido(IngresoPercibido ingresoPercibido) {
		this.ingresosPercibidosDelA�o.add(ingresoPercibido);
	}
	
	public float getMontoTotalPercibido() {
		float montoTotal = 0;
		for (IngresoPercibido ingreso : ingresosPercibidosDelA�o) {
			montoTotal += ingreso.getMontoPercibido();
		}
		return montoTotal;
	}
	
	public float getMontoTotalImponible() {
		float montoImponibleTotal = 0;
		for (IngresoPercibido ingreso : ingresosPercibidosDelA�o) {
			montoImponibleTotal += ingreso.getMontoImponible();
		}
		return montoImponibleTotal;
	}
	
	public float getImpuestoAPagar() {
		return (float) (this.getMontoTotalImponible() * 0.02);
	}

	public List<IngresoPercibido> getIngresosPercibidosDelA�o() {
		return ingresosPercibidosDelA�o;
	}

	public void setIngresosPercibidosDelA�o(List<IngresoPercibido> ingresosPercibidosDelA�o) {
		this.ingresosPercibidosDelA�o = ingresosPercibidosDelA�o;
	}
}