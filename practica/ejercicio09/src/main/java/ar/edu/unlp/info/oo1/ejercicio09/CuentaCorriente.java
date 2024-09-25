package ar.edu.unlp.info.oo1.ejercicio09;

public class CuentaCorriente extends Cuenta{
    
    private double descubierto;

    /* Cuando se abre una cuenta corriente, su límite descubierto es 0 
    (no olvide definir el constructor por default) */
    public CuentaCorriente(){
        super();
        this.descubierto=0;
    }

    //metodos
    public double getDescubierto(){
        return this.descubierto;
    }

    public void setDescubierto(double monto){
        this.descubierto=monto;
    }

    /*Las cuentas corrientes pueden extraer aún cuando el saldo de la cuenta sea 
    insuficiente. Sin embargo, no deben superar cierto límite por debajo del saldo. 
    Dicho límite se conoce como límite de descubierto (algo así como el máximo saldo 
    negativo permitido). Ese límite es diferente para cada cuenta (lo negocia el 
    cliente con la gente del banco). */
    @Override
    protected boolean puedeExtraer(double monto){
        return (this.getDescubierto()+this.getSaldo()>=monto);
    }
}
