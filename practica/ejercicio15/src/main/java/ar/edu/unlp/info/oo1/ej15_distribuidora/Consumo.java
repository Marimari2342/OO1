
import java.time.LocalDate;

public class Consumo {
    
    //variables de instancia
    private double energiaAct;
    private double energiaReac;
    private LocalDate fecha;

    //constructor
    public Consumo (double energiaAct, double energiaReac){
        this.energiaAct=energiaAct;
        this.energiaReac=energiaReac;
        this.fecha=LocalDate.now();
    }

    //metodos

    public double getEnergiaAct(){
        return this.energiaAct;
    }

    public double getEnergiaReact(){
        return this.energiaReac;
    }

    /*El costo del consumo se calcula multiplicando el consumo de energía activa por el precio del 
    kWh proporcionado por el cuadro tarifario. */
    public double costoConsumo(double preciokWh){
        return this.getEnergiaAct()*preciokWh;
    }

    /*Retorno el factor de potencia (que luego uso para ver si tengo o no bonificacion)*/
    public double factorPotencia(){
        return this.getEnergiaAct() / (Math.sqrt( Math.pow(this.getEnergiaAct(),2) + Math.pow(this.getEnergiaReact(),2) ));
    }
}
