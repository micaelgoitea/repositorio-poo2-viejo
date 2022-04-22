package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CuadradoTestCase {

	@Test
	public void createCuadrado() {
		Point punto = new Point (1, 5);
		Cuadrado cuadrado = new Cuadrado (punto, 4);
		
		// Esquina inferior Izquierda
		assertEquals(cuadrado.getEsquinaInferiorIzquierda().getX(), 1, 0);
		assertEquals(cuadrado.getEsquinaInferiorIzquierda().getY(), 5, 0);
		
		// Esquina superior Izquierda
		assertEquals(cuadrado.getEsquinaSuperiorIzquierda().getX(), 1, 0);
		assertEquals(cuadrado.getEsquinaSuperiorIzquierda().getY(), 9, 0);
		
		// Esquina superior Derecha
		assertEquals(cuadrado.getEsquinaSuperiorDerecha().getX(), 5, 0);
		assertEquals(cuadrado.getEsquinaSuperiorDerecha().getY(), 9, 0);
		
		// Esquina inferior Derecha
		assertEquals(cuadrado.getEsquinaInferiorDerecha().getX(), 5, 0);
		assertEquals(cuadrado.getEsquinaInferiorDerecha().getY(), 5, 0);
	}
	
	@Test
	public void CuadradoArea() {
		Point punto = new Point (1, 5);
		Rectangulo cuadrado = new Cuadrado (punto, 4);
		assertEquals(cuadrado.getArea(), 16, 0);
	}
	
	@Test
	public void CuadradoPerimetro() {
		Point punto = new Point (1, 5);
		Rectangulo cuadrado = new Cuadrado (punto, 4);
		assertEquals(cuadrado.getPerimetro(), 16, 0);
	}

}
