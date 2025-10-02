package models;

import java.util.List;

public class Venta {

    private static int contadorVentas = 0;
    private int id;
    private Cliente cliente;
    private Empleado empleado;
    private List<Producto> produtos;
    private double total;

    public Venta(Cliente cliente, Empleado empleado, List<Producto> produtos, double total) {
        this.id = ++Venta.contadorVentas;
        this.cliente = cliente;
        this.empleado = empleado;
        this.produtos = produtos;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public List<Producto> getProductos() {
        return produtos;
    }

    public void setProdutos(List<Producto> produtos) {
        this.produtos = produtos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Venta [id=" + id + ", cliente=" + cliente + ", empleado=" + empleado + ", produtos=" + produtos
                + ", total=" + total + "]";
    }

}
