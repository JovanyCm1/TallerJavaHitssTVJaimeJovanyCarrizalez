package modelos;

import interfaces.IProducto;

public class Producto implements IProducto{
    int precio;

    public Producto(int precio) {
        this.precio = precio;
    }
    public int getPrecio() {
        return precio;
    }
    @Override
    public double getPrecioVenta() {
        return precio * 2.0;
    }
    
}