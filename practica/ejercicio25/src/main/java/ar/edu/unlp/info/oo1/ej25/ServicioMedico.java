package ar.edu.unlp.info.oo1.ej25;

import java.time.DayOfWeek;

public abstract class ServicioMedico extends ServicioVeterinario{
    
    //variables de instancia
    private MedicoVeterinario medico;

    //constructor
    public ServicioMedico(Mascota mascota, MedicoVeterinario medico){
        super(mascota);
        this.medico = medico;
    }

    //metodos
    public MedicoVeterinario getMedico(){
        return this.medico;
    }

    private double extraDomingo(){
        return this.getFecha().getDayOfWeek().equals(DayOfWeek.SUNDAY)? 200 : 0;
    }

    protected abstract double costoMateriales(); 

    protected abstract double otrosCostos();

    @Override
    public double costoServicio(){
        return this.medico.getHonorarios() + this.costoMateriales() + this.extraDomingo() + this.otrosCostos();
    }

}
