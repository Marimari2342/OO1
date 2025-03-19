public class PromoCafeFrio implements Promocion {
    public double aplicarDescuento(Producto producto){
        if (producto instanceof Bebida){
            Bebida aux = (Bebida) producto;
            return aux.getNombre().equals("café") && !aux.esCaliente() ? aux.getPrecio()*0.9 : aux.getPrecio();
            } 
        return producto.getPrecio();
    }
}

