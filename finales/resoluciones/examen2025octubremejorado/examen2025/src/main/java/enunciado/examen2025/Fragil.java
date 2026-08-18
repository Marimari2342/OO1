package enunciado.examen2025;

public class Fragil implements Contenido{

	//variables de instancia
	private String producto;
	private boolean embalajeEspecial;
	
	//constructor
	public Fragil(String prod, boolean especial) {
		this.producto = prod;
		this.embalajeEspecial = especial;
	}
	
	//metodos
	public double costo() {
		return this.embalajeEspecial ? 700 : 500;
	}
	
	public String resumen() {
		return "Producto fragil, tipo: "+this.producto;
	}
	
	public String instruccion() {
		return this.embalajeEspecial?"Requiere embalaje especial":"";
	}
}