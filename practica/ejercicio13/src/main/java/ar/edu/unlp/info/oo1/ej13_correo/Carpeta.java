package ar.edu.unlp.info.oo1.ej13_correo;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
        
    //Variables de instancia
    private String nombre;
    private List<Email> emails;

    //Constructor
    public Carpeta(String nombre) {
        this.nombre = nombre;
        this.emails = new ArrayList<Email>(); 
    }

    //Getters y Setters
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public List<Email> getEmails(){
        return this.emails;
    }

    //Otros métodos
    /* En respuesta al mensaje #mover, mueve el email desde una carpeta de origen a una carpeta
     * destino (asuma que el email está en la carpeta origen cuando se recibe este mensaje).  */
    public void mover(Email email, Carpeta destino){
        //muevo el email pasado como parametro a la carpera de nombre 'destino'
        this.emails.add(email);
        System.out.println("Se movió el email a la carpeta"+ destino.getNombre());
    }

    /* Agrego mail nuevo */
    public void nuevoMail(Email email){ //lo uso desde recibir() en la clase ClienteDeCorreo
        this.emails.add(email);
    }

    /* Elimino un mail pasado como parámetro */
    public void eliminarMail (Email email){
        this.emails.remove(email);
    }

    // Metodos que son necesarios para los métodos de la clase ClienteDeCorreo
    /* Busca en todos los emails de la carpeta, hasta que alguno devuelva true, entonces se detiene
     * y retorna ese mail (que sería el primero que encuentra)*/
    public Email buscar(String texto){
        return this.emails
				.stream() // Convierte la lista de emails en un Stream
				.filter(email -> email.buscar(texto)) // Filtro buscando mail que contiene texto
				.findFirst() // Encuentor el primero no nulo
                .orElse(null); // Si no encuentro ninguno devuelvo null
    }
    
    public int espacioOcupado(){
        return (int) this.emails.stream().mapToDouble(email -> email.espacioOcupado()).sum();
    }

}
