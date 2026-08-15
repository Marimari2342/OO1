package ar.edu.unlp.info.oo1.examen01;

public class Inspeccion extends TrabajoExtenso{

	//variables de instancia
	private String sector;
	private boolean urgente;
	
	//constructor
	public Inspeccion(String nombre, int duracion, String sector, boolean urgente) {
		super(nombre, duracion);
		this.sector = sector;
		this.urgente = urgente;
	}
	
	//metodos
	public String descripcion() {
		return "Inspeccion de "+this.sector+" por "+this.getNombre() 
				+" ("+(this.urgente?"urgente":"normal")+", "+this.getDuracion()+" horas).";
	}
		
	public double costo() {
		return this.urgente ? 9000 : 6000;
	}

}
