
public class Item {
    private String detalle;
    private int cantidad;
    private double costoUnitario;

    //constructor
    public Item(String unDetalle,int unaCant,double unCostoUnitario){
        this.detalle=unDetalle;
        this.cantidad=unaCant;
        this.costoUnitario=unCostoUnitario;
    }

    //getters
    public String getDetalle(){
        return this.detalle;
    }

    public int getCantidad(){
        return this.cantidad;
    }

    public double getCostoUnitario(){
        return this.costoUnitario;
    }

    //setters
    public void setDetalle(String detalle){
        this.detalle=detalle;
    }

    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }

    public void setCostoUnitario(double costoUnitario){
        this.costoUnitario=costoUnitario;
    }

    //metodos
    /*me devuelve el costo total calculando cantidad por costo unitario*/
    public double costo(){
        return this.getCantidad()*this.getCostoUnitario();
    }
}
