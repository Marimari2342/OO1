package ar.edu.unlp.info.oo1.examen2024b;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.List;

public abstract class Especie {

	//variables de instancia
	private String nombre;
	private int nivel;
	private double inteligencia;
	private double fuerza;
	private Rol rol;
	
	//constructor
	public Especie(String nombre, double inteligencia, double fuerza, Rol rol) {
		this.nombre = nombre;
		this.nivel = 1;
		this.inteligencia = inteligencia;
		this.fuerza = fuerza;
		this.rol = rol;
	}
	
	//metodos
	public abstract boolean cumpleSubirNivel(int nivel);
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void cambiarRol(Rol rol) {
		this.rol = rol;
	}
	
	public double poderBase() {
		return this.rol.poderBase(this);
	}
	
	public double poderBaseMago() {
		return this.inteligencia + this.nivel*2;
	}
	
	public double poderBaseGuerrero() {
		return this.fuerza*2 + this.nivel + this.inteligencia;
	}
	
	public abstract double poderAtaque(int momentoDia);
	
	public void subirNivel() {
		this.nivel++;
		if (this.cumpleSubirNivel(this.nivel)) {
			this.rol.subirHabilidades(this);
		}
	}
	
	public void enfrentamientoUnoAUno(Especie rival, int momentoDia) {
		if (this.poderAtaque(momentoDia) > rival.poderAtaque(momentoDia)) {
			this.subirNivel();
			System.out.printf("Ganador: ", this.getNombre());
		} else if (this.poderAtaque(momentoDia) < rival.poderAtaque(momentoDia)){
			rival.subirNivel();
			System.out.printf("Ganador: ", rival.getNombre());
		} else {
			this.subirNivel();
			rival.subirNivel();
			System.out.printf("Empate");
		}
	}
	
	public boolean cumpleCondicion(int nivel) {
		return this.nivel == nivel && this.poderAtaque(12)<5 || Math.abs(nivel-this.nivel)==2;
	}
	
	public List<Especie> buscarOponentes(LinkedList<Especie> candidatos){
		return candidatos.stream()
				.filter(cand -> cand.cumpleCondicion(nivel))
				.collect(Collectors.toList());
	}
	
	public void subirNivelComoMago() {
		this.inteligencia = this.inteligencia*(3/2*this.nivel);
	}
	
	public void subirNivelComoGuerrero() {
		this.fuerza = fuerza*(this.nivel/6);
	}
	
	
}
