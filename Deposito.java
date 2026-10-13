public class Deposito implements Venta {
    private DepositoWebApi apiDeposito;

    public Deposito(DepositoWebApi api) {
        this.apiDeposito = api; 
    }

    @Override
    public void notificarVenta(Producto producto) {
        apiDeposito.prepararEntrega(producto.getNombre());
    }
}