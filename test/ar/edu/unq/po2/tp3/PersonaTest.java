package ar.edu.unq.po2.tp3;

import static org.junit.Assert.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;

public class PersonaTest {

	@Test
	public void edadPersona () throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String stringFecha = "06/10/1999";
		Date fecha = sdf.parse(stringFecha);
		
		Persona persona = new Persona();
				persona.setNombre("Micael");
				persona.setFechaDeNacimiento(fecha);
		
				assertEquals(22, persona.getEdad());		
	}
	
	@Test
	public void esMenorQue () throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String stringFecha = "06/10/1999";
		Date fecha = sdf.parse(stringFecha);
		
		String stringFecha2 = "06/10/1989";
		Date fecha2 = sdf.parse(stringFecha2);
		
		Persona persona1 = new Persona();
				persona1.setNombre("Micael");
				persona1.setFechaDeNacimiento(fecha);
		
		Persona persona2 = new Persona();
				persona2.setNombre("Vanina");
				persona2.setFechaDeNacimiento(fecha2);
				
	 assertTrue(persona1.menorQue(persona2));
}

// Solo Persona conoce como calcular su edad, cualquier otro objeto solo obtiene y le importa su valor.
// El mecanismo que que permite esto se denomina "Encapsulamiento".

			
}
