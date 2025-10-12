package ar.edu.unlp.info.oo1.ejercicio15;
import java.util.LinkedList;

public class Carpeta {

	//variables de instancia
	private String nombre;
	private LinkedList<Email> emails;
	
	//constructor
	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.emails = new LinkedList<>();
	}
	
	//metodos
	public String getNombre() {
		return this.nombre;
	}
	
	public LinkedList<Email> getMails() {
		return this.emails;
	}
	
	public void mover(Email email, Carpeta destino) {
		destino.recibirMail(email);
		this.eliminarMail(email);
	}
	
	public void recibirMail(Email email) {
		this.emails.add(email);
	}
	
	public void eliminarMail(Email email) {
		this.emails.remove(email);
	}
	
	public Email buscar(String texto) {
		return this.emails.stream()
				.filter(email->email.buscarTexto(texto))
				.findFirst().orElse(null);
	}
	
	public int tamanio() {
		return this.emails.stream()
				.mapToInt(email->email.tamanioEmail())
				.sum();
	}
	
}

