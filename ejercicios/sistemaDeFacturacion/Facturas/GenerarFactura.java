package Facturas;

import entidades.Factura;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GenerarFactura {

    private static final String CARPETA_FACTURAS = "ejercicios/sistemaDeFacturacion/facturasGuardadas";

    public static void guardarFactura(Factura factura) {

        boolean anexar = false;
        File carpeta = new File(CARPETA_FACTURAS);
        if (!carpeta.exists()) {
            carpeta.mkdirs();
        }
        File archivo = new File(CARPETA_FACTURAS + File.separator + "factura_" + factura.getId() + ".txt");
        try {
            anexar = archivo.exists();
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
            String nuevoContenido = factura.construirFacturaString();
            salida.print(nuevoContenido);
            salida.close();
            System.out.println("La informacion se ha escrito de manera exitosa.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error " + e.getMessage());
        }
    }

    public static void leerFactura(int idFactura) {

        String nombreArchivo = CARPETA_FACTURAS + File.separator + "factura_" + idFactura + ".txt";

        try {
            System.out.println("El contenido de tu archivo es el siguiente: ");
            System.out.println("-------------------------------------------");
            BufferedReader leer = new BufferedReader(new FileReader(nombreArchivo));
            String linea = leer.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = leer.readLine();
            }
            leer.close();
            System.out.println();
            System.out.println("Archivo " + nombreArchivo + " leido con exito ");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e);
        }
    }

    public static List<String> listarFacturas() {
        List<String> nombres = new ArrayList<>();
        File dir = new File(CARPETA_FACTURAS);
        File[] archivos = dir.listFiles();
        if (archivos != null) {
            for (File archivo : archivos) {
                nombres.add(archivo.getName());
            }
        }
        return nombres;
    }
}
