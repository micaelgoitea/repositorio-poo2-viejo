package ar.edu.unq.po2.tp3;

import java.awt.Rectangle;

public class Rectangulo {
	
	private Point esquinaSuperiorIzquierda;
	private Point esquinaSuperiorDerecha;
	private Point esquinaInferiorIzquierda;
	private Point esquinaInferiorDerecha;
	
	public Rectangulo(Point punto, int alto, int ancho) {
		super ();
		this.setEsquinaInferiorIzquierda(punto);
		this.setEsquinaSuperiorIzquierda(new Point (punto.getX(), punto.getY() + alto));
		this.setEsquinaSuperiorDerecha(new Point (punto.getX() + ancho, punto.getY() + alto));
		this.setEsquinaInferiorDerecha(new Point (punto.getX() + ancho, punto.getY()));	
	}
	
	private void setEsquinaSuperiorIzquierda(Point esquinaSuperiorIzquierda) {
		this.esquinaSuperiorIzquierda = esquinaSuperiorIzquierda;
	}

	private void setEsquinaSuperiorDerecha(Point esquinaSuperiorDerecha) {
		this.esquinaSuperiorDerecha = esquinaSuperiorDerecha;
	}

	private void setEsquinaInferiorIzquierda(Point esquinaInferiorIzquierda) {
		this.esquinaInferiorIzquierda = esquinaInferiorIzquierda;
	}

	private void setEsquinaInferiorDerecha(Point esquinaInferiorDerecha) {
		this.esquinaInferiorDerecha = esquinaInferiorDerecha;
	}

	public Point getEsquinaSuperiorIzquierda() {
		return esquinaSuperiorIzquierda;
	}

	public Point getEsquinaSuperiorDerecha() {
		return esquinaSuperiorDerecha;
	}

	public Point getEsquinaInferiorIzquierda() {
		return esquinaInferiorIzquierda;
	}

	public Point getEsquinaInferiorDerecha() {
		return esquinaInferiorDerecha;
	}

	public float getArea() {
		return (this.getBase() * getAltura());
	}
	
	private float getBase() {
		return (this.esquinaInferiorDerecha.getX() - this.esquinaInferiorIzquierda.getX());
	}
	
	private float getAltura() {
		return (this.esquinaSuperiorIzquierda.getY() - this.esquinaInferiorIzquierda.getY());
	}

	public float getPerimetro() {
		return (this.getAltura() * 2) + (this.getBase() * 2);
	}

	public boolean esHorizontal() {
		return this.getBase() > this.getAltura();
	}

	public boolean esVertical() {
		return this.getAltura() > this.getBase();
	}
}