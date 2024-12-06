package ar.edu.unlp.info.oo1.ej25;

import java.time.LocalDate;

public class ConsultaMedica extends ServicioMedico {
    
    //variables de instancia
    private LocalDate fechaAtencion;

    //constructor
    public ConsultaMedica(Mascota mascota, MedicoVeterinario medico){
        super(mascota, medico);
        this.fechaAtencion = LocalDate.now(); 
    }

    //metodos
    public LocalDate getFechaAtencion(){
        return this.fechaAtencion;
    }

    @Override
    protected double costoMateriales(){
        return 300;
    }

    @Override
    protected double otrosCostos(){
        return this.getMedico().antiguedad()*100;
    }
}
