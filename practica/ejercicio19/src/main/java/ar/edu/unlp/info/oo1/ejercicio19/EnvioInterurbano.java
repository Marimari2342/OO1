public class EnvioInterurbano extends Envio {
    
    //variables de instancia
    private double distanciaKM;

    //constructor
    public EnvioInterurbano(String origen, String destino, double peso, double distancia){
        super(origen, destino, peso);
        this.distanciaKM=distancia;
    }

    //metodos
    public double getDistanciaKM(){
        return this.distanciaKM;
    }

    public double precioEnvio(){
        if (this.getDistanciaKM()<100) {
            return this.getPeso()*20;
        }
        else if (this.getDistanciaKM()<=500) {
            return this.getPeso()*25;
        }
        else 
            return this.getPeso()*30;
    }
}
