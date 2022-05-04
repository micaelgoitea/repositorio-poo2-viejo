package ar.edu.unq.po2.tp5;

import java.util.List;

public class CajaMercadoCentral {
	
	public double RegistrarCompra(List<ProductoTradicional> productos) {
		double montoTotalAPagar = 0;
		for (ProductoTradicional producto : productos) {
			montoTotalAPagar += producto.getPrecioTotal();
			producto.disminuirStock();
		}
		return montoTotalAPagar;
	}
}