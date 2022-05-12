package ar.edu.unq.po2.tp5;

public class Servicio extends Factura{
	
	private double costoPorUnidadConsumida;
	private int cantidadDeUnidadesConsumidas;
	
	public Servicio(double costoPorUnidadConsumida, int cantidadDeUnidadesConsumidas, Agencia agenciaRecaudadora) {
		super(agenciaRecaudadora);
		this.costoPorUnidadConsumida = costoPorUnidadConsumida;
		this.cantidadDeUnidadesConsumidas = cantidadDeUnidadesConsumidas;
	}

	public double getPrecioTotal() {
		return costoPorUnidadConsumida * cantidadDeUnidadesConsumidas;
	}
	
	// Getters y Setters
	public double getCostoPorUnidadConsumida() {
		return costoPorUnidadConsumida;
	}
	public void setCostoPorUnidadConsumida(float costoPorUnidadConsumida) {
		this.costoPorUnidadConsumida = costoPorUnidadConsumida;
	}
	public int getCantidadDeUnidadesConsumidas() {
		return cantidadDeUnidadesConsumidas;
	}
	public void setCantidadDeUnidadesConsumidas(int cantidadDeUnidadesConsumidas) {
		this.cantidadDeUnidadesConsumidas = cantidadDeUnidadesConsumidas;
	}

	@Override
	public void registrarElPago() {
	} 
}