package ar.edu.unlp.info.oo1.ej13_correo;

import java.util.ArrayList;
import java.util.List;

public class Email {
        
    //Variables de instancia
    private String titulo;
    private String cuerpo;
    private List <Archivo> archivos;

    //Constructor
    public Email(String titulo, String cuerpo){
        this.titulo=titulo;
        this.cuerpo=cuerpo;
        this.archivos=new ArrayList<Archivo>();
    }

    //Getters y Setters (Setters no porque no podes settear un mail que ya creaste... va no tiene sentido no se)
    public String getTitulo(){
        return this.titulo;
    }

    public String getCuerpo(){
        return this.cuerpo;
    }

    public List<Archivo> adjuntos(){ //sería el getter de archivos
        return this.archivos;
    }

    public void agregarArchivoAdjunto(Archivo archivo){
        this.archivos.add(archivo);
    }

    //Otros métodos
    /* Devuelve true si el mail contiene en el título o cuerpo el texto indicado como parámetro. */
    public boolean buscar(String texto){
        return titulo.contains(texto) || cuerpo.contains(texto);
    }

    /* El tamaño de un email es la suma del largo del título, el largo del cuerpo, y del tamaño de
     * sus adjuntos. */
    public int espacioOcupado(){
        return  (int) (this.titulo.length() + this.cuerpo.length() + this.archivos.stream()
                .mapToDouble(archivo -> archivo.tamaño()).sum());
    }
}
