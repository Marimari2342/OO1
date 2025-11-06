package ar.edu.unlp.info.oo1.ejercicio29;
import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import ar.edu.unlp.info.oo1.ejercicio17.DateLapse;

public class Cliente {

	//variables de instancia
	private String nombre;
	private LocalDate fechaAlta;
	private Plan plan;
	private LinkedList<Actividad> actividades;
	
	//constructor
	public Cliente(String nombre, Plan plan) {
		this.nombre = nombre;
		this.fechaAlta = LocalDate.now();
		this.plan = plan;
		this.actividades = new LinkedList<>();
	}
	
	//metodos
	public void cambiarPlan(Plan plan) {
		this.plan = plan;
	}
	
	public double montoPorActividades(DateLapse periodo) {
		return this.actividades.stream().filter(act -> act.estaEnPeriodo(periodo)).mapToDouble(act -> act.montoActividad()).sum();
	}
	
	public void agregarActividad(Actividad act) {
		this.actividades.add(act);
	}
	
	public int calcularCantidadIP(DateLapse periodo) {
		Set<String> iP = new HashSet<>();
		this.actividades.stream()
			.filter(actividad -> actividad.estaEnPeriodo(periodo))
			.forEach(actividad -> actividad.verIP(iP));
		return iP.size();
	}
	
	public int antiguedad() {
		return Period.between(this.fechaAlta, LocalDate.now()).getYears();
	}
	
	public double montoTotal(DateLapse periodo) {
		return this.plan.calcularPrecioBase()+this.montoPorActividades(periodo)+this.plan.montoPenalizacion(this, periodo);
	}
}
