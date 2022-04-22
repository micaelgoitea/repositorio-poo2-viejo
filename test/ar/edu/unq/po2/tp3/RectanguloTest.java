package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RectanguloTest {

	@Test
	public void createRectangle() {
		Point punto = new Point (1, 5);
		Rectangulo rectangulo = new Rectangulo (punto, 4, 8);
		
		// Esquina inferior Izquierda
		assertEquals(rectangulo.getEsquinaInferiorIzquierda().getX(), 1, 0);
		assertEquals(rectangulo.getEsquinaInferiorIzquierda().getY(), 5, 0);
		
		// Esquina superior Izquierda
		assertEquals(rectangulo.getEsquinaSuperiorIzquierda().getX(), 1, 0);
		assertEquals(rectangulo.getEsquinaSuperiorIzquierda().getY(), 9, 0);
		
		// Esquina superior Derecha
		assertEquals(rectangulo.getEsquinaSuperiorDerecha().getX(), 9, 0);
		assertEquals(rectangulo.getEsquinaSuperiorDerecha().getY(), 9, 0);
		
		// Esquina inferior Derecha
		assertEquals(rectangulo.getEsquinaInferiorDerecha().getX(), 9, 0);
		assertEquals(rectangulo.getEsquinaInferiorDerecha().getY(), 5, 0);
	}
	
	@Test
	public void RectangleArea() {
		Point punto = new Point (1, 5);
		Rectangulo rectangulo = new Rectangulo (punto, 4, 8);
		assertEquals(rectangulo.getArea(), 32, 0);
	}
	
	@Test
	public void RectanglePerimetro() {
		Point punto = new Point (1, 5);
		Rectangulo rectangulo = new Rectangulo (punto, 4, 8);
		assertEquals(rectangulo.getPerimetro(), 24, 0);
	}
	
	@Test
	public void rectanguloEsHorizontalTest () {
		Point punto = new Point (1, 5);
		Rectangulo rectangulo = new Rectangulo (punto, 4, 8);
		assertTrue(rectangulo.esHorizontal());
	}
	
	@Test
	public void rectanguloVerticalTest () {
		Point punto = new Point (1, 5);
		Rectangulo rectangulo = new Rectangulo (punto, 8, 4);
		assertTrue(rectangulo.esVertical());
	}
}