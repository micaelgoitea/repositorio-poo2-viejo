package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class PersonaTest {
	
	private Persona yo;
	private Persona persona2;
	
	@Before
	public void setUp() throws ParseException { //SetUp
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String stringFecha1 = "06/10/1999";
		Date fecha1 = sdf.parse(stringFecha1);
		
		String stringFecha2 = "06/10/1989";
		Date fecha2 = sdf.parse(stringFecha2);
		
		yo = new Persona("Micael", fecha1);
		persona2 = new Persona("Vanina", fecha2);
	}
	
	@Test
	public void crearUnaPersona () throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		assertEquals("Micael", yo.getNombre());
		assertEquals("06/10/1999", sdf.format(yo.getFechaDeNacimiento()));
	}

	@Test
	public void edadPersona() {
		
		assertEquals(22, yo.getEdad());
	}
	
	// Solo Persona conoce como calcular su edad, cualquier otro objeto solo obtiene y le importa su valor.
	// El mecanismo que que permite esto se denomina "Encapsulamiento".
	
	@Test
	public void esMenorQue() {
				
		assertTrue(yo.menorQue(persona2));
	}
}