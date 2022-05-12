package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura {
	
	public Impuesto(Agencia agenciaRecaudadora) {
		super(agenciaRecaudadora);
	}

	private double tasaDeServicio = 60f;
	
	public double getPrecioTotal() {
		return this.getTasaDeServicio();
	}

	public double getTasaDeServicio() {
		return tasaDeServicio;
	}

	public void setTasaDeServicio(double tasaDeServicio) {
		this.tasaDeServicio = tasaDeServicio;
	}

	@Override
	public void registrarElPago() {
		// TODO Auto-generated method stub
		
	}
}