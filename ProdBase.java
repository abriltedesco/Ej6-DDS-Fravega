public class ProdBase implements Producto {
    private String nombre;
    private double precioBase;

    public ProdBase(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    @Override
    public String getNombre() { return nombre; }

    @Override
    public double getPrecioBase() { return precioBase; }

    @Override
    public double getPrecioFinal() { 
        return precioBase; 
    }
}