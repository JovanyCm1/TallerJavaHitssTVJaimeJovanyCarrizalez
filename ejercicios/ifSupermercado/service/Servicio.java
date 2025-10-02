package service;

import java.util.List;
import java.util.function.*;

import enums.TipoCliente;
import interfaces.IServicio;
import models.Cliente;
import models.Empleado;
import models.Producto;
import models.Venta;

public class Servicio implements IServicio {
    // Predicate <T> -> Recibe un parametro y devuelve un boolean
    @Override
    public Predicate<Producto> filtrarStockBajo() {
        return p -> p.getStock() < 5;
    }

    // Function <T, R> -> Recibe un parametro T y devuelve un resultado R
    @Override
    public Function<List<Producto>, Double> calcularTotalVenta() {
        return listaRecibida -> {
            double total = 0;
            for (Producto producto : listaRecibida) {
                total += producto.getPrecio();
            }
            return total;
        };

    }

    // Consumer <T> -> Recibe un parametro T y no devuelve nada (void)
    @Override
    public Consumer<Venta> imprimirDetallesVenta() {
        return s -> {
            System.out.println("Hola " + s.getCliente().getNombre()
                    + ", gracias por su compra. El total de su compra es: " + s.getTotal() + ".");
        };
    }

    // Supplier <T> -> No recibe parametros y devuelve un resultado T
    @Override
    public Supplier<Producto> generarProductoMuestra() {
        return () -> {
            Producto productoARegresar = new Producto("Salchicha de Pavo", 100, 8);
            return productoARegresar;
        };
    }

    // UnaryOperator<T> -> Recibe un argumento (T). Devuelve un resultado del mismo
    @Override
    public UnaryOperator<Producto> aplicarDescuento() {
        return producto -> {
            producto.setPrecio(producto.getPrecio() - (producto.getPrecio() * 0.10));
            return producto;
        };
    }

    // BinaryOperator<T> -> Recibe dos argumentos del mismo tipo (T). Devuelve un
    // resultado del mismo tipo (T)
    @Override
    public BinaryOperator<Producto> compararMasCaro() {
        return (a, b) -> {
            if (a.getPrecio() > b.getPrecio()) {
                return a;
            } else {
                return b;
            }
        };
    }

    // BiPredicate <T, U> -> Recibe dos parametros y devuelve un boolean
    @Override
    public BiPredicate<Cliente, Venta> verificarDescuentoCliente() {
        return (cliente, venta) -> {
            if (cliente.getTipo().equals(TipoCliente.VIP) && venta.getTotal() > 1000) {
                return true;
            } else {
                return false;
            }
        };
    }

    // BiFunction <T, U, R> -> Recibe dos parametros T, U y devuelve un resultado R
    @Override
    public BiFunction<Cliente, Venta, String> generarTicketVenta() {
        return (cliente, venta) -> {
            return "Ticket de venta: " + cliente.getNombre() + " - Total: $" + venta.getTotal();
        };
    }

    // BiConsumer <T, U> -> Recibe dos parametros T, U y no devuelve nada (void)
    @Override
    public BiConsumer<Cliente, Empleado> notificarCompraProcesada() {
        return (cliente, empleado) -> {
            System.out.println(
                    "Hola " + cliente.getNombre() + " tu compra ha sido procesada por " + empleado.getNombre());
        };
    }
}
