import java.util.List;
import java.util.LinkedList;

public class Distribuidora {
    private List<Usuario> usuarios;
    private CuadroTarifario cuadroTarifario;

    public Distribuidora(double precioKWh) {
        usuarios = new LinkedList<Usuario>();
        cuadroTarifario = new CuadroTarifario(precioKWh);
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void ajustarTarifa(double nuevoPrecio) {
        cuadroTarifario.setPrecioKWh(nuevoPrecio);
    }
}

