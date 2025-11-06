package ar.edu.unlp.info.oo1.ejercicio21;

public class ClienteCorporativo extends Cliente{
	
	//variables de instancia
	private String cuit;
	
	//constructor
	public ClienteCorporativo(String nombre, String dir, String cuit){
		super(nombre,dir);
		this.cuit=cuit;
	}
	
}
