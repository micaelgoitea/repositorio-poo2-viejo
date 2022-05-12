package ar.edu.unq.po2.tp5;

public abstract class Factura implements Facturable {

	private Agencia agenciaRecaudadora;

	public Factura(Agencia agenciaRecaudadora) {
		super();
		this.agenciaRecaudadora = agenciaRecaudadora;
	}

	public Agencia getAgenciaRecaudadora() {
		return agenciaRecaudadora;
	}

	public void setAgenciaRecaudadora(Agencia agenciaRecaudadora) {
		this.agenciaRecaudadora = agenciaRecaudadora;
	}

	@Override
	public void registrarElPago() {
		this.getAgenciaRecaudadora().registrarPago(this);
	}
}