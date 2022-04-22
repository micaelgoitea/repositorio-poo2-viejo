package ar.edu.unq.po2.tp4;

public class Producto {
	
	private String nombre;
	private double precio;
	private boolean esPrecioCuidado = false;

	public Producto(String nombre, double precio) {
		super();
		this.setNombre(nombre);
		this.setPrecio(precio);
	}
	
	public Producto(String nombre, double precio, boolean precioCuidado) {
		this(nombre, precio);
		this.setPrecioCuidado(precioCuidado);
	}
	
	public void aumentarPrecio(double precioAAumentar) {
		this.setPrecio(this.getPrecio() + precioAAumentar);
	}
	
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}

	public void setPrecioCuidado(boolean precioCuidado) {
		this.esPrecioCuidado = precioCuidado;
	}
}
