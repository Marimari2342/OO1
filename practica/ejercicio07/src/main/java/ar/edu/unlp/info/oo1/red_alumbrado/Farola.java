package main.java.ar.edu.unlp.info.oo1.red_alumbrado;

import java.util.ArrayList;
import java.util.List;

public class Farola {
    
    private Boolean on;
    private List<Farola> neighbors;

    /*Crear una farola. Debe inicializarla como apagada*/
    public Farola (){
        this.neighbors = new ArrayList<Farola>(); //inicio sin vecinos
        this.on=false;
    }

    /*Crea la relación de vecinos entre las farolas. La relación de vecinos entre las
    farolas es recíproca, es decir el receptor del mensaje será vecino de otraFarola,
    al igual que otraFarola también se convertirá en vecina del receptor del mensaje*/
    public void pairWithNeighbor( Farola otraFarola ){
        if (!this.neighbors.contains(otraFarola)){ //pregunto así la op se hace una vez sola
            this.neighbors.add(otraFarola);
            otraFarola.pairWithNeighbor(this);
        }
    }

    /*Retorna sus farolas vecinas*/
    public List<Farola> getNeighbors (){
        return this.neighbors;
    }


    /*Si la farola no está encendida, la enciende y propaga la acción.*/
    public void turnOn(){
        if(!this.on){
            this.on=true;
            this.getNeighbors().stream().forEach(Farola::turnOn);
        }
    }

    /*Si la farola no está apagada, la apaga y propaga la acción.*/
    public void turnOff(){
        if(this.on){
            this.on=false;
            this.getNeighbors().stream().forEach(Farola::turnOff);
        }
    }

    /*Retorna true si la farola está encendida.*/
    public boolean isOn(){
        return this.on;
    }

    /*Retorna true si la farola está apagada.*/
    public boolean isOff(){
        return !this.on;
    }
}
