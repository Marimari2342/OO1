package ar.edu.unlp.info.oo1.ej25;

public class Guarderia extends ServicioVeterinario {
    
    //variables de instancia
    private int cantDias;

    //constructor
    public Guarderia(Mascota mascota, int dias){
        super(mascota);
        this.cantDias = dias;
    }

    //metodos
    public int getCantDias(){
        return this.cantDias;
    }

    /*•	La guardería se cobra según un costo diario de $500 y, si la mascota utilizó previamente 5 o 
    más servicios, se le aplica un descuento del 10%.*/
    @Override
    public double costoServicio(){
        if (this.getMascota().cantServicios() >= 5) {
            return this.getCantDias()*500*0.1;
        }
        return this.getCantDias()*500;
    }

}
