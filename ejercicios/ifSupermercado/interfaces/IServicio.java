package interfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import models.Cliente;
import models.Empleado;
import models.Producto;
import models.Venta;

public interface IServicio {

    Predicate<Producto> filtrarStockBajo();

    Function<List<Producto>, Double> calcularTotalVenta();

    Consumer<Venta> imprimirDetallesVenta();

    Supplier<Producto> generarProductoMuestra();

    UnaryOperator<Producto> aplicarDescuento();

    BinaryOperator<Producto> compararMasCaro();

    BiPredicate<Cliente, Venta> verificarDescuentoCliente();

    BiFunction<Cliente, Venta, String> generarTicketVenta();

    BiConsumer<Cliente, Empleado> notificarCompraProcesada();

}
