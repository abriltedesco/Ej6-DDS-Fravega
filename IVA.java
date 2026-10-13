public class IVA extends Impuesto {
    private static double porcentaje = 0.21; 

    public IVA(Producto producto) { super(producto); }
    
    public static void setPorcentaje(double nuevoPorcentaje) { porcentaje = nuevoPorcentaje; }

    @Override
    protected double calcularImpuesto() {
        return porcentaje * producto.getPrecioBase();
    }
}