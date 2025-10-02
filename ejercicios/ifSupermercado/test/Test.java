package test;

import java.util.List;

import enums.TipoCliente;
import models.Cliente;
import models.Empleado;
import models.Producto;
import models.Venta;
import service.Servicio;

public class Test {
    public static void main(String[] args) {
        Servicio servicio = new Servicio();

        System.out.println("======= Filtrar Stock bajo =======");
        Producto p1 = new Producto("Leche", 20, 10);
        Producto p2 = new Producto("Pan", 15, 3);
        Producto p3 = new Producto("Huevo", 40, 2);
        Producto p4 = new Producto("Cereal", 35, 8);
        System.out.println(servicio.filtrarStockBajo().test(p1));
        System.out.println(servicio.filtrarStockBajo().test(p2));
        System.out.println(servicio.filtrarStockBajo().test(p3));
        System.out.println(servicio.filtrarStockBajo().test(p4));

        System.out.println();

        System.out.println("======= Calcular Total Venta =======");
        List<Producto> listaProductos = List.of(p1, p2, p3, p4);
        System.out.println("Total Venta: " + servicio.calcularTotalVenta().apply(listaProductos));

        System.out.println();

        System.out.println("======= Imprimir Detalles de Venta =======");
        Cliente cliente = new Cliente("Julio Barcenas", TipoCliente.NORMAL);
        Empleado empleado = new Empleado("Ana Gomez", "Vendedora");
        Venta venta = new Venta(cliente, empleado, listaProductos, servicio.calcularTotalVenta().apply(listaProductos));
        servicio.imprimirDetallesVenta().accept(venta);

        System.out.println();

        System.out.println("======= Generar Producto Muestra =======");
        Producto productoMuestra = servicio.generarProductoMuestra().get();
        System.out.println(productoMuestra);

        System.out.println();
        System.out.println("======= Aplicar Descuento =======");
        Producto productoConDescuento = servicio.aplicarDescuento().apply(productoMuestra);
        System.out.println("Producto con descuento: " + productoConDescuento);

        System.out.println();
        System.out.println("======= Comparar Producto Más Caro =======");
        Producto productoMasCaro = servicio.compararMasCaro().apply(p1, p3);
        System.out.println("Producto más caro: " + productoMasCaro);

        System.out.println();

        System.out.println("======= Verificar Descuento Cliente =======");
        System.out.println("Cliente: " + cliente.getNombre() + ", Tiene descuento: "
                + servicio.verificarDescuentoCliente().test(cliente, venta));

        System.out.println();

        System.out.println("======= Generar Ticket de Venta =======");
        String ticket = servicio.generarTicketVenta().apply(cliente, venta);
        System.out.println(ticket);

        System.out.println();

        System.out.println("======= Notificar Compra Procesada =======");
        servicio.notificarCompraProcesada().accept(cliente, empleado);

    }
}
