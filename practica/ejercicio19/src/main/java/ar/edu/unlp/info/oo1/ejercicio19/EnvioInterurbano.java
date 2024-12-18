public class EnvioInterurbano extends Envio {
    
    //variables de instancia
    private double distanciaKM;

    //constructor
    public EnvioInterurbano(String origen, String destino, double peso, double distancia){
        super(origen, destino, peso);
        this.distanciaKM=distancia;
    }
    
    //metodos
}
