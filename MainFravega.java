public class MainFravega {
    public static void main(String[] args) {
        ContabilidadREST apiContable = valor -> System.out.println("[Contabilidad] Registro en libro por valor: $" + valor);
        DepositoWebApi apiDeposito = nombre -> System.out.println("[Depósito] Preparando rápido el producto: " + nombre);

        OficinaContable contabilidad = new OficinaContable(apiContable);
        Deposito deposito = new Deposito(apiDeposito);
        ContadorVentas contador = new ContadorVentas();

        Sucursal sucursal = new Sucursal();
        sucursal.suscribir(contabilidad);
        sucursal.suscribir(deposito);
        sucursal.suscribir(contador);

        Producto tvBase = new ProdBase("Smart TV 50", 100000);
        Producto tvElectronico = new EO(new IVA(tvBase)); 

        Producto sofaBase = new ProdBase("Sofá 3 Cuerpos", 50000);
        Producto sofaHogar = new EI(new IVA(sofaBase));

        System.out.println("--- VENTA DE ELECTRÓNICA ---");
        sucursal.registrarVenta(tvElectronico);

        System.out.println("\n--- VENTA DE HOGAR ---");
        sucursal.registrarVenta(sofaHogar);

        System.out.println("\n[Control Cruzado] Cantidad total de ventas hoy: " + contador.getCantidadVentas());
    }
}