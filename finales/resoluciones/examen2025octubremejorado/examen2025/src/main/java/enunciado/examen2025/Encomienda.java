package enunciado.examen2025;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.LinkedList;

public class Encomienda{

	//variables de instancia
	private int seguimiento;
	private String destinatario;
	private List<Contenido> contenidos;
	private Etiqueta etiqueta;
	
	//constructor
	public Encomienda(int seguimiento, String destinatario) {
		this.seguimiento = seguimiento;
		this.destinatario = destinatario;
		this.contenidos = new LinkedList<Contenido>();
	}
	
	//metodos
	public void agregarContenido(Contenido contenido) {
		this.contenidos.add(contenido);
	}
	
	public Etiqueta generarEtiqueta() {
		return new Etiqueta(this.info(),this.contenidoTotal(),this.instrucciones());
	}
	
	private String info() { //correcto
		return "Numero de seguimiento: "+this.seguimiento+", destinatario: "+this.destinatario;
	}
	
	private String contenidoTotal() { //correcto
		return this.contenidos.stream().map(contenido -> contenido.resumen()).collect(Collectors.joining("; "));
	}
	
	private String instrucciones() {
		return IntStream.range(0,this.contenidos.size())
				.filter(i -> !this.contenidos.get(i).instruccion().isEmpty())
				.mapToObj(i -> (i+1)+". "+this.contenidos.get(i).instruccion())
				.collect(Collectors.joining("\n"));
	}
}
