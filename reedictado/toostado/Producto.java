public abstract class Producto {
    
    //variables
    private String nombre;
    private double precio;
    private Promocion promocion;

    //constructor
    public Producto(String nombre, double precio, Promocion promocion){
        this.nombre=nombre;
        this.precio=precio;
        this.promocion=promocion;
    }

    //metodos
    public String getNombre(){
        return this.nombre;
    }

    public double getPrecio(){
        return this.precio;
    }

    public void setPrecio(double precio){
        this.precio=precio;
    }

    public double aplicarDescuento(){
        return this.promocion.aplicarDescuento(this);
    }
}