package modelos;

public class TvLcd extends Electronico {
    private int pulgada;
    public TvLcd(String fabricante, int precio, int pulgada) {
        super(fabricante, precio);
        this.pulgada = pulgada;
    }

    @Override
    public double getPrecioVenta() {
        return precio * 8;
    }
}