package ar.edu.unlp.info.oo1.ejercicio08;
import java.time.LocalDate;

public class Mamifero {
	//variables
	private String id;
	private String especie;
	private LocalDate nacimiento;
	private Mamifero madre;
	private Mamifero padre;
	
	//constructor
	public Mamifero(String nombre){
		this.id=nombre;
		madre = null;
		padre = null;
	}
	public Mamifero(){}
	
	//metodos
	public String getIdentificador(){
		return this.id;
	}
	
	public void setIdentificador(String id){
		this.id=id;
	}
	
	public String getEspecie(){
		return this.especie;
	}
	
	public void setEspecie(String especie){
		this.especie=especie;
	}
	
	public LocalDate getFechaNacimiento(){
		return this.nacimiento;
	}
	
	public void setFechaNacimiento(LocalDate fecha){
		this.nacimiento=fecha;
	}
	
	public Mamifero getPadre(){
		return this.padre;
	}
	
	public void setPadre(Mamifero padre){
		this.padre=padre;
	}
	
	public Mamifero getMadre(){
		return this.madre;
	}
	public void setMadre(Mamifero madre){
		this.madre=madre;
	}
	
	public Mamifero getAbueloPaterno() {
		if (this.padre!=null) {
			return this.padre.getPadre();
		} else 
			return null;
	}
	
	public Mamifero getAbuelaPaterna() {
		if (this.padre!=null) {
			return this.padre.getMadre();
		} else
			return null;
	}
	
	public Mamifero getAbueloMaterno() {
		if (this.madre!=null) {
			return this.madre.getPadre();
		} else
			return null;
	}
	
	public Mamifero getAbuelaMaterna() {
		if (this.madre!=null) {
			return this.madre.getMadre();
		} else
			return null;
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		return ((this.madre == unMamifero || this.padre == unMamifero) 
				|| (this.padre!=null && padre.tieneComoAncestroA(unMamifero))
				|| (this.madre!=null && madre.tieneComoAncestroA(unMamifero)));
	}
	
}
