package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class MultioperadorTest {

	@Test
	public void sumaTest() {
		Multioperador multioperador = new Multioperador();
		ArrayList<Integer> listaDeNumeros = new ArrayList<>();
		listaDeNumeros.add(6);
		listaDeNumeros.add(10);
		listaDeNumeros.add(99);
		assertEquals(115, multioperador.sumar(listaDeNumeros));
	}
	
	@Test
	public void restaTest() {
		Multioperador multioperador = new Multioperador();
		ArrayList<Integer> listaDeNumeros = new ArrayList<>();
		listaDeNumeros.add(99);
		listaDeNumeros.add(10);
		listaDeNumeros.add(6);
		assertEquals(83, multioperador.restar(listaDeNumeros));
	}
	
	@Test
	public void multiplicacionTest() {
		Multioperador multioperador = new Multioperador();
		ArrayList<Integer> listaDeNumeros = new ArrayList<>();
		listaDeNumeros.add(99);
		listaDeNumeros.add(10);
		listaDeNumeros.add(6);
		assertEquals(5940, multioperador.multiplicar(listaDeNumeros));
	}
}