package ar.edu.unq.po2.tp5;

public class ProductoDeCooperativa extends ProductoTradicional {
	
	public ProductoDeCooperativa (String nombre, double precio, int stock) {
		super(nombre, precio, stock);
		this.setIVAAplicar(11f);
	}
}