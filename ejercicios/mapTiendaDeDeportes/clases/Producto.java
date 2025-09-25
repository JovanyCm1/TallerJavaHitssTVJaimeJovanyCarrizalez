package clases;
public class Producto{
    private int sku;
    private String nombre;
    private String categoria;
    private int stock;

    public Producto(int sku, String nombre, String categoria, int stock) {
        this.sku = sku;
        this.nombre = nombre;
        this.categoria = categoria;
        this.stock = stock;
    }

    public void venderProducto(int cantidadAVender){
        this.stock -= cantidadAVender;
    }
    public void comprarProducto(int cantidadAComprar){
        this.stock+= cantidadAComprar;
    }

    public int getSku() {
        return sku;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCategoria() {
        return categoria;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "[sku=" + sku + ", nombre=" + nombre + ", categoria=" + categoria + ", stock="
                + stock + "]";
    }
}