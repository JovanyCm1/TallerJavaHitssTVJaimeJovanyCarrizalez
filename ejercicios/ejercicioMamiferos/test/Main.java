package test;

import clases.felino.animales.*;
import clases.Mamifero;
import clases.canino.animales.*;

public class Main {
    public static void main(String[] args) {

        Mamifero[] mamiferoArreglo = new Mamifero[5];

        Mamifero lobo = new Lobo(
                "Bosque embrujado de Caperucita",
                1.2f, 1.8f, 45f,
                "Canis Lupus Fiestus",
                "Gris",
                7.5f,
                5,
                "Lobo programador que aúlla en Java");

        Mamifero perro = new Perro(
                "Sofá de la sala",
                0.6f, 1.0f, 15f,
                "Canis Familiaris Glotonis",
                "Marrón con manchas de salsa",
                4.0f,
                1200);

        Mamifero guepardo = new Guepardo(
                "Autopista Panamericana",
                0.9f, 1.5f, 50f,
                "Acinonyx Memeus",
                3.5f,
                300);

        Mamifero leon = new Leon(
                "Estadio de fútbol",
                1.2f, 2.0f, 190f,
                "Panthera Leo Influencius",
                5.0f,
                80,
                15,
                120.5f);

        Mamifero tigre = new Tigre(
                "Selva con WiFi",
                1.1f, 2.2f, 220f,
                "Panthera Tigris",
                6.0f,
                70,
                "Tigre que juega Fortnite");

        mamiferoArreglo[0] = lobo;
        mamiferoArreglo[1] = perro;
        mamiferoArreglo[2] = guepardo;
        mamiferoArreglo[3] = leon;
        mamiferoArreglo[4] = tigre;

        for (Mamifero mamifero : mamiferoArreglo) {
            System.out.println(mamifero.dormir());
        }

    }
}
