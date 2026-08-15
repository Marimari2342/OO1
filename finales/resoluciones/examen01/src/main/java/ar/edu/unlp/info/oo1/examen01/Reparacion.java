package ar.edu.unlp.info.oo1.examen01;

public class Reparacion extends TrabajoExtenso{
	
	//variables de instancia
	private String equipo;
	private double precioHora;
	
	//constructor
	public Reparacion(String nombre, int duracion, String equipo, double precio) {
		super(nombre, duracion);
		this.equipo = equipo;
		this.precioHora = precio;
	}
	
	//metodos
	public String descripcion() {
		return "Reparacion de "+this.equipo+" por "+this.getNombre() 
				+" ("+this.getDuracion()+" horas a $"+this.precioHora+ " por hora).";
	}
		
	public double costo() {
		return this.precioHora*this.getDuracion();
	}
}
