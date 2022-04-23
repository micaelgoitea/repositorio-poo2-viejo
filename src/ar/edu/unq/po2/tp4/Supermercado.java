package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	
	private String nombre;
	private String direccion;
	private ArrayList<Producto> catalogoDeProductos = new ArrayList<Producto>();
	
	public Supermercado(String nombre, String direccion) {
		super();
		this.setNombre(nombre);
		this.setDireccion(direccion);
	}
	
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCantidadDeProductos() {
		
		return this.catalogoDeProductos.size();
	}

	public void agregarProducto(Producto productoAAgregar) {
		this.catalogoDeProductos.add(productoAAgregar);
	}

	public Double getPrecioTotal() {
		double precioTotal = 0;
		for (Producto producto : catalogoDeProductos) {
			precioTotal += producto.getPrecio();
		}
		return precioTotal;
	}

	public List<Producto> getCatálogoProductos() {
		return catalogoDeProductos;
	}

	public ArrayList<Producto> getCatalogoDeProductos() {
		return catalogoDeProductos;
	}

	public void setCatalogoDeProductos(ArrayList<Producto> catalogoDeProductos) {
		this.catalogoDeProductos = catalogoDeProductos;
	}

}