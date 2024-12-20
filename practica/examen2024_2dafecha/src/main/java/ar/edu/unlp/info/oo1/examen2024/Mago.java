public class Mago implements Rol{

    //metodos
    //1. se determina el valor base
    public double determinarValorBase(Personaje personaje){
        return (personaje.getInteligencia()+personaje.getNivel())*2;
    }

    //2. se incrementa una habilidad
    public void mejorarHabilidad(Personaje personaje){
        personaje.setInteligencia(personaje.getInteligencia() + 3/2*personaje.getNivel());
    }
}
