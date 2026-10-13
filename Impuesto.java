public abstract class Impuesto implements Producto {
    protected Producto producto;

    public Impuesto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String getNombre() { return producto.getNombre(); }

    @Override
    public double getPrecioBase() { return producto.getPrecioBase(); }

    @Override
    public double getPrecioFinal() {
        return producto.getPrecioFinal() + calcularImpuesto(); 
    }

    protected abstract double calcularImpuesto();
}