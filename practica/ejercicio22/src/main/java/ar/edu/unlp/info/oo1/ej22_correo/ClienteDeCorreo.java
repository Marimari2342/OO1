package ar.edu.unlp.info.oo1.ej13_correo;

import java.util.ArrayList;
import java.util.List;

import main.java.ar.edu.unlp.info.oo1.ej13_correo.Email;

public class ClienteDeCorreo {
    
    //Variables de instancia
    private Carpeta inbox; //acá almaceno los mails recibidos
    private List <Carpeta> carpetas;

    //Constructor
    public ClienteDeCorreo (Carpeta inbox){
        this.inbox = inbox;
        this.carpetas = new ArrayList<Carpeta>();
    }

    //Getters y Setters
    public List<Carpeta> getCarpetas(){
        return this.carpetas;
    }

    public Carpeta getInbox(){
        return this.inbox;
    }

    //Otros métodos
    /* Agregar una carpeta nueva */
    public void crearCarpeta(Carpeta carpeta){
        this.carpetas.add(carpeta);
    }

    /* En respuesta al mensaje #recibir, almacena en el inbox (una de las carpetas) el email que
     * recibe como parámetro. */
    public void recibir(Email email){
        this.inbox.nuevoMail(email);
    }

    /* En respuesta al mensaje #buscar retorna el primer email en el Cliente de Correo cuyo título
     * o cuerpo contienen el texto indicado como parámetro. Busca en todas las carpetas. */
    public Email buscar(String texto){
        Email aux = this.inbox.buscar(texto); //Me fijo si está en inbox
        if (aux!=null){
            return aux;
        }
        // Sino busco en el resto de carpetas utilizando Streams
        return this.carpetas
            .stream()  // Convierte la lista de carpetas en un Stream
            .map(carpeta -> carpeta.buscar(texto))  // Mapeo cada carpeta para obtener email que coincida con el texto
            .filter(email -> email != null)  // Filtra solo los emails no nulos
            .findFirst()  // Encuentra el primer email que no es nulo
            .orElse(null);  // Si no encuentra ninguno, retorna null
    }

    /* En respuesta al mensaje #espacioOcupado, retorna la suma del espacio ocupado por todos los
     * emails de todas las carpetas. */
    public int espacioOcupado(){
        return  (int) this.inbox.espacioOcupado() + (int) this.carpetas.stream()
                .mapToDouble(carpeta -> carpeta.espacioOcupado()).sum();
    }

    // --> PUNTO 22
    //Cantidad total de emails en el cliente de correo: considerando todas las carpetas existentes.
    public int cantidadTotalMails(){
        return this.getCarpetas().stream().mapToInt(carpeta -> carpeta.cantidadMails()).sum();
    }
}
