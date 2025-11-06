package ar.edu.unlp.info.oo1.ejercicio21;

public class EnvioInternacional extends Envio {

	//variables de instancia
	private boolean entregaRapida;
	
	//constructor
	public EnvioInternacional(String origen, String destino, double peso, boolean rapida){
		super(origen, destino, peso);
		this.entregaRapida = rapida;
	}
	
	//metodos
	public double costoEnvio(){
		double aux = (this.getPeso()<=1000) ? 10*this.getPeso() : 12*this.getPeso();
		return (this.entregaRapida) ? aux+5800 : aux+5000;
	}
}
