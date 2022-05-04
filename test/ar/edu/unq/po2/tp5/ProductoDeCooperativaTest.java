package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProductoDeCooperativaTest {

	@Test
	public void creacionDeProducto() {
		ProductoDeCooperativa galletitas = new ProductoDeCooperativa("Baggley", 200, 30);
		
		assertEquals("Baggley", galletitas.getNombre());
		assertEquals(200, galletitas.getPrecio());
		assertEquals(30, galletitas.getStock());
		assertEquals(11, galletitas.getIVAAplicar());
	}
	
	@Test
	public void precioTotalConIvaIncluido() {
		ProductoDeCooperativa galletitas = new ProductoDeCooperativa("Baggley", 200, 30);
		
		assertEquals(222, galletitas.getPrecioTotal());
	}

}