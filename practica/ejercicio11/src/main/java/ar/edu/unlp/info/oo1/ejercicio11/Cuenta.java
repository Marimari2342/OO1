package ar.edu.unlp.info.oo1.ejercicio11;

public abstract class Cuenta {

	//variables de instancia
	private double saldo;
	
	//constructor
	public Cuenta() {
		this.saldo=0;
	}
	
	//metodos
	public double getSaldo(){
		return this.saldo;
	}
	
	public void depositar(double monto){
		this.saldo+=monto;
	}
	
	protected void extraerSinControlar(double monto){
		this.saldo-=monto;
	}
	
	public boolean extraer(double monto){
		if (this.puedeExtraer(monto)){
			this.extraerSinControlar(monto);
			return true;
		}
		return false;
	}
	
	public boolean transferirACuenta(double monto, Cuenta destino){
		if (this.puedeExtraer(monto)){
			this.extraerSinControlar(monto);
			destino.depositar(monto);
			return true;
		}
		return false;
	}
	
	protected abstract boolean puedeExtraer(double monto);
}
