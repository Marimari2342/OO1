public class Orco extends Personaje{
    
    //variables de instancia

    //constructor
    public Orco(String nombre, Rol rol){
        super(nombre, rol);
        this.setInteligencia(1);
        this.setFuerza(2);
    }

    //metodos
    //1. definido por el rol, el momento del día y la especie del personaje
    public double determinarPoderAtaque(int horaDia){
        double aux = this.getRol().determinarValorBase(this);
        return (horaDia<=8 || horaDia<20)?aux*1.6:aux;
    }

    //2. Orco aumenta habilidad según su rol cada 3 niveles
    public void mejorarHabilidad(){
        if (this.getNivel()%3==0){
            this.getRol().mejorarHabilidad(this);
        }
    }
}
