package test;

import bolsa.BolsaGenerica;
import clases.Fruta;
import clases.Lacteo;
import clases.Limpieza;
import clases.NoPerecible;

public class Test {
    public static void main(String[] args) {
     BolsaGenerica<Fruta> bolsaFrutas = new BolsaGenerica<>();
        bolsaFrutas.agregar(new Fruta("Manzana", 10, 1.2, "Rojo"));
        bolsaFrutas.agregar(new Fruta("Banana", 30, 1.5, "Amarillo"));
        bolsaFrutas.agregar(new Fruta("Uva", 80, 0.5, "Morado"));
        bolsaFrutas.agregar(new Fruta("Pera", 60, 1.0, "Verde"));
        bolsaFrutas.agregar(new Fruta("Naranja", 40, 1.3, "Naranja"));

        BolsaGenerica<Lacteo> bolsaLacteos = new BolsaGenerica<>();
        bolsaLacteos.agregar(new Lacteo("Leche", 100, 1, 80));
        bolsaLacteos.agregar(new Lacteo("Yogur", 80, 1, 10));
        bolsaLacteos.agregar(new Lacteo("Queso", 50, 1, 20));
        bolsaLacteos.agregar(new Lacteo("Mantequilla", 25, 1, 1));
        bolsaLacteos.agregar(new Lacteo("Crema", 30, 1, 5));

        BolsaGenerica<Limpieza> bolsaLimpieza = new BolsaGenerica<>();
        bolsaLimpieza.agregar(new Limpieza("Detergente", 30.0, "Sodium Laureth Sulfate", 2.0));
        bolsaLimpieza.agregar(new Limpieza("Jabón", 20.0, "Sodium Palmate", 1.0));
        bolsaLimpieza.agregar(new Limpieza("Desinfectante", 40.0, "Alcohol", 1.5));
        bolsaLimpieza.agregar(new Limpieza("Limpiador Multiusos", 20.5, "Ammonium Quaternary", 1.0));
        bolsaLimpieza.agregar(new Limpieza("Suavizante", 30.5, "Cationic Surfactants", 2.0));

        BolsaGenerica<NoPerecible> bolsaNoPerecibles = new BolsaGenerica<>();
        bolsaNoPerecibles.agregar(new NoPerecible("Atun", 20, 2,1500));
        bolsaNoPerecibles.agregar(new NoPerecible("Arroz", 15, 5,1000));
        bolsaNoPerecibles.agregar(new NoPerecible("Fideos", 10, 3,500));
        bolsaNoPerecibles.agregar(new NoPerecible("Galletitas", 25, 4,800));
        bolsaNoPerecibles.agregar(new NoPerecible("Aceite", 30, 2,2000));
        System.out.println("------ Frutas ----");
        bolsaFrutas.obtenerTodos().forEach(System.out::println);

        System.out.println("------ Lacteos ----");
        bolsaLacteos.obtenerTodos().forEach(System.out::println);
        System.out.println("------ Limpieza ----");
        bolsaLimpieza.obtenerTodos().forEach(System.out::println);

        System.out.println("------ No Perecibles ----");
        bolsaNoPerecibles.obtenerTodos().forEach(System.out::println);
    }
}
