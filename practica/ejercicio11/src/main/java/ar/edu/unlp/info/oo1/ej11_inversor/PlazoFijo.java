package main.java.ar.edu.unlp.info.oo1.ej11_inversor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion{
    //variables de instancia
    private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;

    //constructor
    public PlazoFijo(LocalDate fecha, double monto, double interes){
        this.fechaDeConstitucion=fecha;
        this.montoDepositado=monto;
        this.porcentajeDeInteresDiario=interes;
    }

    //getters
    public LocalDate getFechaDeConstitucion() {
        return this.fechaDeConstitucion;
    }

    public double getMontoDepositado(){
        return this.montoDepositado;
    }

    public double getPorcentajeDeInteresDiario(){
        return this.porcentajeDeInteresDiario;
    }

    //metodos
    /*El valor actual de un PlazoFijo equivale al montoDepositado incrementado 
    como corresponda por el porcentaje de interés diario, desde la fecha de 
    constitución a la fecha actual (la del momento en el que se hace el cálculo). */
    @Override
    public double valorActual(){
        long cantDias = ChronoUnit.DAYS.between(this.getFechaDeConstitucion(), LocalDate.now());
        return this.getMontoDepositado()+this.getPorcentajeDeInteresDiario()*cantDias;
    }
}
