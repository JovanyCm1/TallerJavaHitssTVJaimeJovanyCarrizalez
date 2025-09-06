package modelos;

public class IPhone extends Electronico {
    String modelo;
    String color;

    public IPhone(String fabricante, int precio, String modelo, String color) {
        super(fabricante, precio);
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public double getPrecioVenta() {
        return precio * 3;
    }
}
