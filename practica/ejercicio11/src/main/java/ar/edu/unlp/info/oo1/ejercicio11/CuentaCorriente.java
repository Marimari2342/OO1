package ar.edu.unlp.info.oo1.ejercicio11;

public class CuentaCorriente extends Cuenta {

	//variables de instancia
	private double limiteDescubierto;
	
	//constructor
	public CuentaCorriente(){
		this.limiteDescubierto=0;
	}
	
	//metodos
	public double getDescuebierto(){
		return this.limiteDescubierto;
	}
	
	public void setDescubierto(double descubierto){
		this.limiteDescubierto=descubierto;
	}
	
	@Override
	protected boolean puedeExtraer(double monto){
		return monto <= this.limiteDescubierto+this.getSaldo();
	}
}
