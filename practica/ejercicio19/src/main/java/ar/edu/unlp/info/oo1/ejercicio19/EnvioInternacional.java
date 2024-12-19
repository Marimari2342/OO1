public class EnvioInternacional extends Envio{

    //constructor
    public EnvioInternacional(String origen, String destino, double peso){
        super(origen, destino, peso);
    }

    //metodos
    public double precioEnvio(){
        return this.getPeso()<=1000 ? 10*this.getPeso()+5000 : 12*this.getPeso()+5000;
    }
}
