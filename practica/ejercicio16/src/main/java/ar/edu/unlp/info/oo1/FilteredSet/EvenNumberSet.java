import java.util.HashSet;

public class EvenNumberSet extends HashSet<Integer>{
    
    /*variables de instancia y constructor --> Ya los tengo en HashSet, no necesito ponerlos acá*/
    
    //metodos
    /*Sobrecarga de add(): En lugar de agregar directamente un número al conjunto, primero 
    verificamos si el número es par.*/
    public boolean add(Integer num){
        return (int)num % 2 == 0 ? super.add(num): false;
    }
}
