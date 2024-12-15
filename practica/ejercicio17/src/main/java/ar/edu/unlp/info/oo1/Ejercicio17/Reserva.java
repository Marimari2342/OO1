public class Reserva {
    
    //variables de instancia
    private Propiedad propiedad;
    private DateLapse fecha;
    private double precioNoche;
    private int cantNoches;

    //constructor
    public Reserva(Propiedad propiedad, DateLapse fecha, double precio, int cantNoches){
        this.propiedad=propiedad;
        this.fecha=fecha;
        this.precioNoche=precio;
        this.cantNoches=cantNoches;
    }

    //metodos
    public Propiedad getPropiedad(){
        return this.propiedad;
    }
    
    public DateLapse getFecha(){
        return this.fecha;
    }

    public double getPrecio(){
        return this.precioNoche;
    }

    public int getCantNoches(){
        return this.cantNoches;
    }

    public double calcularPrecio(){
        return this.getPrecio() * this.getCantNoches();
    }
}
