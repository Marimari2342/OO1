package ar.edu.unlp.info.oo1.ejercicio15;
import java.util.LinkedList;

public class Email {

	//variables de instancia
	private String titulo;
	private String cuerpo;
	private LinkedList<Archivo> adjuntos;
	
	//constructor
	public Email(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos = new LinkedList<>();
	}
	
	//metodos
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getCuerpo() {
		return this.cuerpo;
	}
	
	public void agregarArchivo(Archivo archivo) {
		this.adjuntos.add(archivo);
	}
	
	public LinkedList<Archivo> adjuntos() {
		return this.adjuntos;
	}
	
	public int tamanioEmail() {
		int tamanioArchivos = 0;
		tamanioArchivos = adjuntos.stream()
				.mapToInt(archivo -> archivo.tamanio())
				.sum();
		return this.getCuerpo().length() + this.getTitulo().length() + tamanioArchivos;
	}
	
	public boolean buscarTexto(String texto) {
		return this.getTitulo().contains(texto) || this.getCuerpo().contains(texto);
	}
}
