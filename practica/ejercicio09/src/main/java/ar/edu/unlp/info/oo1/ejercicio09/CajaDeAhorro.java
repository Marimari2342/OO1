package ar.edu.unlp.info.oo1.ejercicio09;

public class CajaDeAhorro extends Cuenta {

    public CajaDeAhorro(){
        super();
    }

    /** Las cajas de ahorro solo pueden extraer y transferir cuando cuentan con
     * fondos suficientes.  */

    @Override
    protected boolean puedeExtraer(double monto){
        return (this.getSaldo() >= monto);
    }
    
    /*Las extracciones, los depósitos y las transferencias desde cajas de ahorro 
    tienen un costo adicional de 2% del monto en cuestión (téngalo en cuenta antes 
    de permitir una extracción o transferencia desde caja de ahorro). */

    @Override
    public boolean extraer(double monto){
        return super.extraer(monto*1.02);
    }

    @Override
    public void depositar(double monto){
        super.depositar(monto*0.98);
    }

    @Override
    public boolean transferirACuenta(double monto, Cuenta cuentaDestino){
        return super.transferirACuenta(monto*1.02, cuentaDestino);
    }

}
