package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ImpuestoTrabajadorTest {
	
	private IngresoPercibido ingreso1;
	private IngresoPercibido ingreso2;
	private IngresoPercibido ingreso3;
	private IngresoHorasExtras ingreso4;
	
	@BeforeEach
	public void setUp() {
		ingreso1 = new IngresoPercibido("Enero", "ConceptoX", 1200);
		ingreso2 = new IngresoPercibido("Febrero", "ConceptoY", 1000);
		ingreso3 = new IngresoPercibido("Marzo", "ConceptoZ", 1000);
		ingreso4 = new IngresoHorasExtras("Abril", "ConceptoH", 3000, 2);
	}
	@Test
	public void montoTotalPercibidoTest() {
		Trabajador trabajador = new Trabajador();
		trabajador.agregarIngresoPercibido(ingreso1);
		trabajador.agregarIngresoPercibido(ingreso2);
		trabajador.agregarIngresoPercibido(ingreso3);
		trabajador.agregarIngresoPercibido(ingreso4);
		assertEquals(6200, trabajador.getMontoTotalPercibido());
	}
	
	@Test
	public void montoImponibleTotalTest() {
		Trabajador trabajador = new Trabajador();
		trabajador.agregarIngresoPercibido(ingreso1);
		trabajador.agregarIngresoPercibido(ingreso2);
		trabajador.agregarIngresoPercibido(ingreso3);
		trabajador.agregarIngresoPercibido(ingreso4);
		assertEquals(3200, trabajador.getMontoTotalImponible());
	}
	
	@Test
	public void montoDeImpuestoAlTrabajadorTest() {
		Trabajador trabajador = new Trabajador();
		trabajador.agregarIngresoPercibido(ingreso1);
		trabajador.agregarIngresoPercibido(ingreso2);
		trabajador.agregarIngresoPercibido(ingreso3);
		trabajador.agregarIngresoPercibido(ingreso4);
		assertEquals(64, trabajador.getImpuestoAPagar());
	}
	
}