package ar.edu.unlp.info.oo1.ejercicio15;
import java.util.LinkedList;

public class ClienteDeCorreo {

	//variables de instancia
	private Carpeta inbox;
	private LinkedList<Carpeta> carpetas;
	
	//constructor
	public ClienteDeCorreo() {
		this.inbox = new Carpeta("inbox");
		this.carpetas = new LinkedList<>();
	}
	
	//metodos
	
	public void agregarCarpeta(Carpeta carpeta) {
		this.carpetas.add(carpeta);
	}
	
	public void recibir(Email email) {
		this.inbox.recibirMail(email);
	}
	
	public Email buscar (String texto) {
		Email email = this.inbox.buscar(texto);
		if (email != null) return email;
		email = this.carpetas.stream()
				.map(carpeta->carpeta.buscar(texto))
				.filter(mail -> mail!=null)
				.findFirst().orElse(null);
		return email;
	}
	
	public int espacioOcupado() {
		return this.inbox.tamanio()+this.carpetas.stream().mapToInt(carpeta->carpeta.tamanio()).sum();
	}
}
