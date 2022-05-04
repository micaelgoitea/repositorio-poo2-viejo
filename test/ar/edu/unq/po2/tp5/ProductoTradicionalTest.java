package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProductoTradicionalTest {
	
	@Test
	public void creacionDeProducto() {
		ProductoTradicional leche = new ProductoTradicional("La Serenisima", 150, 20);
		
		assertEquals("La Serenisima", leche.getNombre());
		assertEquals(150, leche.getPrecio());
		assertEquals(20, leche.getStock());
		assertEquals(21, leche.getIVAAplicar());
	}
	
	@Test
	public void precioTotalConIvaIncluido() {
		ProductoTradicional leche = new ProductoTradicional("La Serenisima", 150, 20);
		
		assertEquals(181.5, leche.getPrecioTotal());
	}
}