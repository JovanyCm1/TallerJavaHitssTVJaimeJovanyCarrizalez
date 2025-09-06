package test;
import java.time.LocalDate;
import interfaces.IProducto;
import modelos.*;

public class main {
    public static void main(String[] args) {
        IProducto[] productos = new IProducto[6];
        LocalDate fecha = LocalDate.now();

        productos[0] = new IPhone("Apple", 5000, "iPhone", "Blanco");
        productos[1] = new TvLcd("Samsung", 7000, 42);
        productos[2] = new Comics(fecha, "Stan lee", "Spiderman", "Marvel", 2000, "El hombre araña");
        productos[3] = new Libro(fecha, "Gabriel Garcia Marquez", "Cien años de soledad", "Editorial",1500);
        productos[4] = new Comics(fecha, "Joe Hernandez", "Captain America", "Marvel", 2500, "Captain America");
        productos[5] = new IPhone("Apple", 8000, "iPhone 13", "Negro");

    }
}
