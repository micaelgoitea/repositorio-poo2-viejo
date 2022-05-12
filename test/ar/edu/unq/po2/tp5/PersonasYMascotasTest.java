package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class PersonasYMascotasTest {

	@Test
	void personasyMascotasEnUnaColeccion() {
		Persona mike = new Persona("Micael", null);
		Persona laVani = new Persona("VanniManni", null);
		Mascota perro = new Mascota("Boby", "Caniche");
		Mascota perro2 = new Mascota("Tiger", "Boxer");
		List<SerVivo> seresVivos = new ArrayList<>();
		
		seresVivos.add(mike);
		seresVivos.add(laVani);
		seresVivos.add(perro);
		seresVivos.add(perro2);
		
		for (SerVivo serVivo : seresVivos) {
			System.out.println(serVivo.getNombre());
		}
	}
}
