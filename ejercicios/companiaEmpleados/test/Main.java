package companiaEmpleados.test;
import companiaEmpleados.*;
public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Jaime", "Carrizalez", "84415", "Zapata 210 NTE", 1000, 2000);
        System.out.println(gerente);
        System.out.println();
        System.out.println("---------- Uso Metodo Aumetar Remuneración ---------");
        System.out.println();
        gerente.aumentarRemuneracion(100);
        System.out.println(gerente);
        System.out.println();
        System.out.println("---------- Uso Clase Cliente ---------");
        Cliente cliente = new Cliente("Santiago", "Lopez", "12345", "Rotaria");
        System.out.println(cliente);
    }
}
