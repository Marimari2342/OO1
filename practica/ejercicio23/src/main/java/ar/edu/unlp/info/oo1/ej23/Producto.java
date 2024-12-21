public class Producto {
    //variables de instancia
    private String nombre;
    private String categoria;
    private double precio;
    private int cantDisp;

    //constructor
    public Producto(String nombre, String categoria, double precio, int cantDisp){
        this.nombre=nombre;
        this.categoria=categoria;
        this.precio=precio;
        this.cantDisp=cantDisp;
    }

    //metodos
    public int getCantDisp(){
        return this.cantDisp;
    }

    public void setCantidad(int cant){
        this.cantDisp=cant;
    }

    public double getPrecio(){
        return this.precio;
    }

    //1. verificar stock
    public boolean verificarStock(int cant){
        return this.getCantDisp()>cant;
    }

    public void descontarUnidades(int cant){
        this.setCantidad(this.getCantDisp()-cant);
    }

    //2. devolver categoria
    public String getCategoria(){
        return this.categoria;
    }
}
