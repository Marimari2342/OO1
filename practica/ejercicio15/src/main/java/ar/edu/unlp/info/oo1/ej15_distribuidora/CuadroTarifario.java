public class CuadroTarifario {
    
    //variables de instancia
    private double precioKWh;

    //constructor
    public CuadroTarifario(double precioKWh) {
        this.precioKWh = precioKWh;
    }

    //metodos
    public double getPrecioKWh() {
        return this.precioKWh;
    }

    public void setPrecioKWh(double nuevoPrecio) {
        this.precioKWh = nuevoPrecio;
    }
}

