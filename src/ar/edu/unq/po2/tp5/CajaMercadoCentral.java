package ar.edu.unq.po2.tp5;

import java.util.List;

public class CajaMercadoCentral {
	
	public double RegistrarCompra(List<Facturable> productos) {
		double montoTotalAPagar = 0;
		for (Facturable producto : productos) {
			montoTotalAPagar += producto.getPrecioTotal();
			producto.registrarElPago();
		}
		return montoTotalAPagar;
	}
}