package ar.edu.unlp.info.oo1.ej25;

import java.time.LocalDate;

public abstract class ServicioVeterinario {
    
    //variables de instancia
    private Mascota mascota;
    private LocalDate fecha;

    //constructor
    public ServicioVeterinario(Mascota mascota){
        this.mascota = mascota;
        this.fecha = LocalDate.now();
        this.mascota.agregarServicio(this); // agregar el nuevo servicio a la lista de servicios de la mascota
    }

    //metodos
    public abstract double costoServicio();

    public Mascota getMascota(){
        return this.mascota;
    }

    public LocalDate getFecha(){
        return this.fecha;
    }
}
