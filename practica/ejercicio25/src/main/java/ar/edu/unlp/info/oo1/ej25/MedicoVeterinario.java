package ar.edu.unlp.info.oo1.ej25;

import java.time.LocalDate;
import java.time.Period;

public class MedicoVeterinario {
    
    //variables de instancia
    private String nombre;
    private LocalDate fechaIngreso;
    private double honorarios;

    //constructor
    public MedicoVeterinario(String nombre, LocalDate fecha, double honorarios){
        this.nombre = nombre;
        this.fechaIngreso = fecha;
        this.honorarios = honorarios;
    }

    //metodos
    public String getNombre(){
        return this.nombre;
    }

    public LocalDate getFechaIngreso(){
        return this.fechaIngreso;
    }

    public double getHonorarios(){
        return this.honorarios;
    }

    public int antiguedad(){
        return Period.between(this.fechaIngreso, LocalDate.now()).getYears();
    }
}
