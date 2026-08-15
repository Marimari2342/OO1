package ar.edu.unlp.info.oo1.examen01;

public abstract class TrabajoExtenso implements Trabajo {
	
	//variables de instancia
	private String nombreTecnico;
	private int duracion;

	//constructor 
	public TrabajoExtenso(String nombre, int duracion) {
		this.nombreTecnico = nombre;
		this.duracion = duracion;
	}
	
	//metodos
	public abstract String descripcion();
	public abstract double costo();
	protected String getNombre() {
		return this.nombreTecnico;
	}
	protected int getDuracion() {
		return this.duracion;
	}
}
