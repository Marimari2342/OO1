import java.time.LocalDate;

public class Factura {
    
    //variables de instancia
    private Usuario usuario;
    private LocalDate fecha;
    private boolean bonificacion;
    private double monto;
    private Consumo consumo;

    //constructor
    public Factura(Usuario usuario, CuadroTarifario precioKWh){
        this.usuario=usuario;
        this.fecha=LocalDate.now();
        this.consumo=this.usuario.ultimoConsumo();
        this.bonificacion=calcularBonificacion();
        this.monto=calcularMontoFinal(this.bonificacion, precioKWh.getPrecioKWh());
    }

    //metodos
    /*Si el factor de potencia estimado (fpe) del último consumo del usuario es mayor a 0.8, el 
    usuario recibe una bonificación del 10%.*/
    public boolean calcularBonificacion(){
        return consumo.factorPotencia()>0.8;
    }

    /*El monto final de la factura: se calcula restando la bonificación al costo del consumo*/
    public double calcularMontoFinal(boolean bonificacion, double  precioKWh){
        double costo = this.consumo.costoConsumo(precioKWh);
        return this.bonificacion ? costo*0.9: costo;
    }
}
