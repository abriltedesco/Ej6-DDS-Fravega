public class EI extends Impuesto {
    private static double gananciasImpositivas = 3.50;

    public EI(Producto producto) {
        super(producto);
    }

    public static void setGananciasImpositivas(double valor) {
        gananciasImpositivas = valor; 
    }

    @Override
    protected double calcularImpuesto() {
        return (producto.getPrecioBase()/4) + (0.3 * gananciasImpositivas);
    }
}