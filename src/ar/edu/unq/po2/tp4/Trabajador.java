package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	
	private List<IngresoPercibido> ingresosPercibidosDelAño = new ArrayList<>();
	
	public void agregarIngresoPercibido(IngresoPercibido ingresoPercibido) {
		this.ingresosPercibidosDelAño.add(ingresoPercibido);
	}
	
	public float getMontoTotalPercibido() {
		float montoTotal = 0;
		for (IngresoPercibido ingreso : ingresosPercibidosDelAño) {
			montoTotal += ingreso.getMontoPercibido();
		}
		return montoTotal;
	}
	
	public float getMontoTotalImponible() {
		float montoImponibleTotal = 0;
		for (IngresoPercibido ingreso : ingresosPercibidosDelAño) {
			montoImponibleTotal += ingreso.getMontoImponible();
		}
		return montoImponibleTotal;
	}
	
	public float getImpuestoAPagar() {
		return (float) (this.getMontoTotalImponible() * 0.02);
	}

	public List<IngresoPercibido> getIngresosPercibidosDelAño() {
		return ingresosPercibidosDelAño;
	}

	public void setIngresosPercibidosDelAño(List<IngresoPercibido> ingresosPercibidosDelAño) {
		this.ingresosPercibidosDelAño = ingresosPercibidosDelAño;
	}
}