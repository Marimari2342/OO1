package ar.edu.unlp.info.oo1.ejercicio25;
import java.util.Objects;

public class Jugador {

	//variables de instancia
	private String nombre;
	private String apellido;
	
	//constructor
	public Jugador(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	//metodo
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Jugador)) return false;
        Jugador jugador = (Jugador) o;
        return Objects.equals(nombre, jugador.nombre) &&
               Objects.equals(apellido, jugador.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }
   
}
