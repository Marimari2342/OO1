package ar.edu.unlp.info.oo1.ejercicio21;

public class EnvioLocal extends Envio {
	
	//variables de instancia
	private boolean entregaRapida;
	
	//constructor
	public EnvioLocal(String origen, String destino, double peso, boolean rapida){
		super(origen, destino, peso);
		this.entregaRapida = rapida;
	}
	
	//metodos
	public double costoEnvio(){
		return (this.entregaRapida) ? 1500 : 1000;
	}
	
}
