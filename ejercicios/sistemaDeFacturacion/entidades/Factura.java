package entidades;

import java.util.List;

import genericos.Identificable;

public class Factura implements Identificable<Long> {
    private long id;
    private Cliente cliente;
    private List<Producto> productos;

    public Factura(long id, Cliente cliente, List<Producto> productos) {
        this.id = id;
        this.cliente = cliente;
        this.productos = productos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    // ! Método dinamico para agregar un producto a la factura

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto);
    }

    // !Eliminar un producto de la factura
    
    public boolean eliminarProducto(int idProducto) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId() == idProducto) {
                productos.remove(i);
                System.out.println("Producto eliminado: " + idProducto);
                return true;
            }
        }
        System.out.println("El producto no se encontró en la factura: " + idProducto);
        return false;
    }

    // ! Calcular el total de la factura

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    //! Construccion de factura en formato String

    public String construirFacturaString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Factura ID: ").append(id).append("\n");
        sb.append("Cliente: ").append(cliente).append("\n");
        sb.append("Productos:\n");
        for (Producto producto : productos) {
            sb.append("- ").append(producto)
              .append(" | Precio: $").append(producto.getPrecio()).append("\n");
        }
        sb.append("Total: $").append(calcularTotal()).append("\n");
        return sb.toString();
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Factura [id=" + id + ", cliente=" + cliente + ", productos=" + productos + ", total=" + calcularTotal() + "]";
    }
}
