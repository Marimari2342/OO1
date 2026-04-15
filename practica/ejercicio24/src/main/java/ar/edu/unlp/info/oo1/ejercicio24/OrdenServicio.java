package ar.edu.unlp.info.oo1.ejercicio24;
import java.util.LinkedList;

public class OrdenServicio extends Orden{

	//variables de instancia
	private String descripcion;
	private int horas;
	private LinkedList<Tecnico> tecnicos;
	
	//constructor
	public OrdenServicio(Usuario usuario, String domicilio, String descripcion, int horas) {
		super(usuario, domicilio);
		this.descripcion = descripcion;
		this.horas = horas;
		this.tecnicos = new LinkedList<>();
	}
	
	//metodos
	public double calcularCosto() {
		double valTec = (!this.tecnicos.isEmpty()) ? this.tecnicos.stream()
				.mapToDouble(tec -> tec.calcularPrecio(horas)).sum():0;
		return this.calcularCostoServicio(valTec, this.horas>10);
	}
}
