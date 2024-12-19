public class ClienteCorporativo extends Cliente{
    
    //variables de instancia
    private String cuit;

    //constructor
    public ClienteCorporativo(String nombre, String direccion, String cuit){
        super(nombre, direccion);
        this.cuit=cuit;
    }
}
