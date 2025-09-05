package ar.edu.unlp.oo1.ejercicio1;

/**
 * Completar esta clase de acuerdo a lo especificado
 */
public class WallPost {

	// Atributos
	private String textoPublicacion;
	private int cantidadMeGusta;
	private boolean destacado;

	/**
	 * Retorna el texto descriptivo de la publicación
	 * 
	 * @return
	 */
	public String getText() {
		return this.textoPublicacion;
	};

	/**
	 * Setea el texto descriptivo de la publicación
	 * @param text
	 */
	public void setText(String text) {
		this.textoPublicacion = text;
	};

	/**
	 * Retorna la cantidad de “me gusta”
	 * 
	 * @return
	 */
	public int getLikes() {
		return this.cantidadMeGusta;
	};

	/**
	 * Incrementa la cantidad de likes en uno
	 */
	public void like() {
		this.cantidadMeGusta++;
	};

	/**
	 * Decrementa la cantidad de likes en uno. Si ya es 0, no hace nada
	 */
	public void dislike() {
		if (this.cantidadMeGusta > 0){
			this.cantidadMeGusta--;
		}
		
	};

	/**
	 * Retorna true si el post está marcado como destacado, false en caso contrario
	 * 
	 * @return
	 */
	public boolean isFeatured() {
		return this.destacado;
	};

	/**
	 * Cambia el post del estado destacado a no destacado y viceversa
	 */
	public void toggleFeatured() {
		this.destacado = !this.destacado;
	};

	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
	@Override
	public String toString() {
		return "WallPost {" +
			"text: " + getText() +
			", likes: '" + getLikes() + "'" +
			", featured: '" + isFeatured() + "'" +
			"}";
	}

}