package ar.edu.unlp.info.oo1.ejercicio21;

public class EnvioInterurbano extends Envio {
	
	//variables de instancia
	private double distancia;
	
	//constructor
	public EnvioInterurbano(String origen, String destino, double peso, double distancia){
		super(origen, destino, peso);
		this.distancia = distancia;
	}
	
	public double costoEnvio(){
		if (this.distancia<100){
			return this.getPeso()*20;
		}else if(this.distancia<500){
			return this.getPeso()*25;
		}else return this.getPeso()*30;
	}
}
