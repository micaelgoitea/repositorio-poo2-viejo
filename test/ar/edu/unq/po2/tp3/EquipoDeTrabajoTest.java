package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class EquipoDeTrabajoTest {
	
	private Persona yo;
	private Persona vanina;
	private Persona facundo;
	private Persona viviana;
	private Persona tomas;
	private List<Persona> listaDeIntegrantes;
	
	@Before
	public void setUp() throws ParseException { //SetUp
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String stringFecha1 = "06/10/1999";
		Date fecha1 = sdf.parse(stringFecha1);
		
		String stringFecha2 = "06/10/1989";
		Date fecha2 = sdf.parse(stringFecha2);
		
		String stringFecha3 = "06/12/1988";
		Date fecha3 = sdf.parse(stringFecha3);
		
		String stringFecha4 = "30/10/1971";
		Date fecha4 = sdf.parse(stringFecha4);
		
		String stringFecha5 = "16/09/1999";
		Date fecha5 = sdf.parse(stringFecha5);
		
		yo = new Persona("Micael", fecha1);
		vanina = new Persona("Vanina", fecha2);
		facundo = new Persona("Facundo", fecha3);
		viviana = new Persona ("Viviana", fecha4);
		tomas = new Persona ("Tomas", fecha5);
		listaDeIntegrantes = new ArrayList<>();
		listaDeIntegrantes.add(yo);
		listaDeIntegrantes.add(vanina);
		listaDeIntegrantes.add(facundo);
		listaDeIntegrantes.add(viviana);
		listaDeIntegrantes.add(tomas);
	}
	
	@Test
	public void equipoDeTrabajoTieneUnNombreYUnConjuntoDeIntegrantes() {
		
		EquipoDeTrabajo equipoDeTrabajo = new EquipoDeTrabajo();
		equipoDeTrabajo.setNombre("Glitter");
		equipoDeTrabajo.setIntegrantes(listaDeIntegrantes);
		assertEquals("Glitter", equipoDeTrabajo.getNombre());
		assertTrue(equipoDeTrabajo.getIntegrantes().containsAll(listaDeIntegrantes));
	}
	
	@Test
	public void equipoDeTrabajoConoceSuNombreYElPromedioDeEdadDeSusIntegrantes() {
		
		EquipoDeTrabajo equipoDeTrabajo = new EquipoDeTrabajo();
		equipoDeTrabajo.setNombre("My Group");
		equipoDeTrabajo.setIntegrantes(listaDeIntegrantes);
		assertEquals("My Group", equipoDeTrabajo.getNombre());
		assertEquals(31, equipoDeTrabajo.getPromedioDeEdades());
		System.out.println("El promedio de edad del Equipo " + equipoDeTrabajo.getNombre() + " es " + equipoDeTrabajo.getPromedioDeEdades());
	}
}
