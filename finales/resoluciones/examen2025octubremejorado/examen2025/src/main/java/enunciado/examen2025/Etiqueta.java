package enunciado.examen2025;

public class Etiqueta {
	
	//variables de instancia
	private String infoDestinatario;
	private String contenido;
	private String instruccionesEspeciales;
	
	public Etiqueta(String info, String contenido, String instruccion) {
		this.infoDestinatario = info;
		this.contenido = contenido;
		this.instruccionesEspeciales = instruccion;
	}
	
	public String generar() {
		return this.infoDestinatario+"\n"+this.contenido+"\nInstrucciones especiales:\n"+this.instruccionesEspeciales;
	}
}
