public class EnvioLocal extends Envio{
 
    //variables de instancia
    private boolean entregaRapida;

    //constructor
    public EnvioLocal(String origen, String destino, double peso, boolean entrega){
        super(origen, destino, peso);
        this.entregaRapida=entrega;
    }

    //metodos
    public boolean getEntregaRapida(){
        return this.entregaRapida;
    }

    public double precioEnvio(){
        return this.getEntregaRapida() ? 1500 : 1000;
    }
}
