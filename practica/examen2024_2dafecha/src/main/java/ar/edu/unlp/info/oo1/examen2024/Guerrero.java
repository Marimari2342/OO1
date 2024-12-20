public class Guerrero implements Rol{
    
    //metodos
    //1. se determina el valor base
    public double determinarValorBase(Personaje personaje){
        return (personaje.getFuerza()*2)+personaje.getInteligencia()+personaje.getNivel();
    }

    //2. se incrementa una habilidad
    public void mejorarHabilidad(Personaje personaje){
        personaje.setFuerza(personaje.getFuerza() + personaje.getNivel()/6);
    }
}
