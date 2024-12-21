public class ExpressDomicilio implements OpcionesEnvio {
    /*Si la forma de envío es "express a domicilio" el costo es $0.5 por Km de distancia
    entre la dirección del vendedor y del cliente. Asuma que existe una clase
    CalculadoraDeDistancia, cuyas instancias entienden el mensaje #distanciaEntre que
    recibe dos direcciones y retorna la distancia en Km entre ellas. Por ahora trabaje con
    una implementación propia para pruebas que siempre retorna 100 (sin importar las
    direcciones recibidas). */
    //metodos
    public double costoEnvio(){
        return 100*0.5;
    }
}
