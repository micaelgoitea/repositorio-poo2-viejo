package ar.edu.unq.po2.tp5;

public class ProductoTradicional implements Facturable {
	
	private String nombre;
	private double precio;
	private double IVAAplicar;
	private int stock;
	
	public ProductoTradicional(String nombre, double precio, int stock) {
		super();
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setIVAAplicar(21);
		this.setStock(stock);
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getIVAAplicar() {
		return IVAAplicar;
	}

	public void setIVAAplicar(double iVAAplicar) {
		IVAAplicar = iVAAplicar;
	}

	public double getPrecioTotal() {
	
		return this.getPrecio() + (this.getIVAAplicar() / 100 * this.getPrecio());
	}

	public void disminuirStock() {
		this.stock--;
	}

	@Override
	// En el caso de un producto al procesar el pago se le disminuye el stock, pero en el caso
	// pero en el caso de una factura de lo registra en la agencia correspondiente.
	public void registrarElPago() {
		this.disminuirStock();	
	}
}