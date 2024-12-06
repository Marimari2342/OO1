package ar.edu.unlp.info.oo1.ej25;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Mascota {
    
    //variables de instancia
    private String nombre;
    private LocalDate fechaNacimiento;
    private String especie;
    private List <ServicioVeterinario> servicios;

    //constructor
    public Mascota (String nombre, LocalDate fecha, String especie){
        this.nombre = nombre;
        this.fechaNacimiento = fecha;
        this.especie = especie;
        this.servicios = new LinkedList<ServicioVeterinario>();
    }

    //metodos
    public String getNombre(){
        return this.nombre;
    }

    public LocalDate getFechaNacimiento(){
        return this.fechaNacimiento;
    }

    public String getEspecie(){
        return this.especie;
    }

    public double recaudacion(LocalDate fecha){
        return this.servicios.stream() //Creo un Stream
        .filter(servicio -> servicio.getFecha().equals(fecha)) //Filtro los servicios en la fecha dada
        .mapToDouble(servicio -> servicio.costoServicio()) //Mapeo costo de cada servicio
        .sum(); //Sumo los costos
    }

    public void agregarServicio(ServicioVeterinario servicio){
        this.servicios.add(servicio);
    }

    public int cantServicios(){
        return this.servicios.size();
    }
}
