package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CajaMercadoCentralTest {
	
	private List<ProductoTradicional> listaDeProductosAComprar = new ArrayList<>();

	@Test
	public void registroDeLaCompraDeDosProductos() {
		CajaMercadoCentral cajaDeCobro = new CajaMercadoCentral();
		ProductoTradicional leche = new ProductoTradicional("La Serenisima", 150, 20);
		ProductoDeCooperativa galletitas = new ProductoDeCooperativa("Baggley", 200, 30);
		listaDeProductosAComprar.add(leche);
		listaDeProductosAComprar.add(galletitas);
		
		assertEquals(403.5, cajaDeCobro.RegistrarCompra(listaDeProductosAComprar));
		assertEquals(19, leche.getStock());
		assertEquals(29, galletitas.getStock());
	}

}