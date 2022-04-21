package ar.edu.unq.po2.tp3;

public class Cuadrado extends Rectangulo {

	private Cuadrado(Point punto, int alto, int ancho) {
		super(punto, alto, ancho);
	}
	
	public Cuadrado(Point punto, int lado) {
		this(punto, lado, lado);
	}

}
