package main.java.ar.edu.unlp.info.oo1.ej11_inversor;

public class InversionEnAcciones implements Inversion{
    //variables de instancia
    private String nombre;
	private int cantidad;
	private double valorUnitario;

    public InversionEnAcciones(String nombre, int cant, double valor){
        this.nombre=nombre;
        this.cantidad=cant;
        this.valorUnitario=valor;
    }

    //getters
    public String getNombre(){
        return this.nombre;
    }

    public int getCantidad(){
        return this.cantidad;
    }

    public double getValorUnitario(){
        return this.valorUnitario;
    }

    //metodos
    /*El valor actual de una InversionEnAcciones se calcula multiplicando el 
    número de acciones por el valor unitario de las mismas. */
    @Override
    public double valorActual(){
        return this.getValorUnitario()*this.getCantidad();
    }
}
