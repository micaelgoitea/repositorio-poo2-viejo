package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PointTest {

	@Test
	public void createPoint() {
		Point point = new Point(3,6);
		assertEquals(3, point.getX(),0);
		assertEquals(6, point.getY(),0);
	}
	
	@Test
	public void createPointZero() {
		Point point = new Point();
		assertEquals(0, point.getX(),0);
		assertEquals(0, point.getY(),0);
	}
	
	@Test
	public void movePoint() {
		Point point = new Point(6,8);
		point.setXY(9, 12);
		assertEquals(9, point.getX(),0);
		assertEquals(12, point.getY(),0);
	}
	
	@Test
	public void sumarPoints() {
		Point point1 = new Point(1,2);
		Point point2 = new Point(3,4);
		Point pointResultante = point1.sumar(point2);
		assertEquals(4, pointResultante.getX(),0);
		assertEquals(6, pointResultante.getY(),0);
	}
	

}
