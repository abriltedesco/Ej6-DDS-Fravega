public class OficinaContable implements Venta {
    private ContabilidadREST apiContable;

    public OficinaContable(ContabilidadREST api) { this.apiContable = api; }

    @Override
    public void notificarVenta(Producto producto) {
        apiContable.registrarVenta(producto.getPrecioFinal());
    }
} 