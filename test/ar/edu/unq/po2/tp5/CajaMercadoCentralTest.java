package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class CajaMercadoCentralTest {
	
	private List<Facturable> listaDeProductosAComprarYFacturas = new ArrayList<Facturable>();

	@Test
	public void registroDeLaCompraDeDosProductos() {
		CajaMercadoCentral cajaDeCobro = new CajaMercadoCentral();
		ProductoTradicional leche = new ProductoTradicional("La Serenisima", 150, 20);
		ProductoDeCooperativa galletitas = new ProductoDeCooperativa("Baggley", 200, 30);
		listaDeProductosAComprarYFacturas.add(leche);
		listaDeProductosAComprarYFacturas.add(galletitas);
		
		assertEquals(403.5, cajaDeCobro.RegistrarCompra(listaDeProductosAComprarYFacturas));
		assertEquals(19, leche.getStock());
		assertEquals(29, galletitas.getStock());
	}
	
	@Test
	public void registroDeLaCompraDeProductosYPagoFacturas() {
		PagoFacil pagoFacil = new PagoFacil();
		CajaMercadoCentral cajaDeCobro = new CajaMercadoCentral();
		ProductoTradicional leche = new ProductoTradicional("La Serenisima", 150, 20);
		ProductoDeCooperativa galletitas = new ProductoDeCooperativa("Baggley", 200, 30);
		Servicio telecentro = new Servicio(2000, 1, pagoFacil);
		Impuesto luz = new Impuesto(pagoFacil);
		
		listaDeProductosAComprarYFacturas.add(leche);
		listaDeProductosAComprarYFacturas.add(galletitas);
		listaDeProductosAComprarYFacturas.add(telecentro);
		listaDeProductosAComprarYFacturas.add(luz);
		
		assertEquals(2463.5, cajaDeCobro.RegistrarCompra(listaDeProductosAComprarYFacturas));
		assertEquals(19, leche.getStock());
		assertEquals(29, galletitas.getStock());
	}
}