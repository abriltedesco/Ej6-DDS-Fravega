import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private List<Venta> observadores = new ArrayList<>();

    public void suscribir(Venta observer) {
        observadores.add(observer);
    }

    public void registrarVenta(Producto producto) {
        System.out.println("Vendiendo: " + producto.getNombre() + " a $" + producto.getPrecioFinal());
        for (Venta obs : observadores) {
            obs.notificarVenta(producto);
        }
    }
}