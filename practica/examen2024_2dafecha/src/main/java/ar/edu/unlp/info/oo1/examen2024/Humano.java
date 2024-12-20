public class Humano extends Personaje{
    
    //variables de instancia

    //constructor
    public Humano(String nombre, Rol rol){
        super(nombre, rol);
        this.setInteligencia(2);
        this.setFuerza(1);
    }

    //metodos
    //1. definido por el rol, el momento del día y la especie del personaje
    public double determinarPoderAtaque(int horaDia){
        double aux = this.getRol().determinarValorBase(this);
        return (horaDia>8 && horaDia<=20)?aux*1.4:aux;
    }

    //2. Humano aumenta habilidad según su rol a partir del nivel 7
    public void mejorarHabilidad(){
        if (this.getNivel()>=7){
            this.getRol().mejorarHabilidad(this);
        }
    }
}
