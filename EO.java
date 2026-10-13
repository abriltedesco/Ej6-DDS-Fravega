public class EO extends Impuesto {
    private static double gananciasImpositivas = 4.0; 

    public EO(Producto producto) { 
        super(producto);
    }

    public static void setGananciasImpositivas(double valor) { gananciasImpositivas = valor; }

    @Override
    protected double calcularImpuesto() {
        return (0.5 * producto.getPrecioBase()) / (4 * gananciasImpositivas);
    }
}