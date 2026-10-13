public class ContadorVentas implements Venta {
    private int cantidadVentas = 0;

    @Override
    public void notificarVenta(Producto producto) {
        cantidadVentas++;
    }

    public int getCantidadVentas() { return cantidadVentas; }
}