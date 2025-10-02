package test;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import interfaces.VecesRepetidas;

public class Test {

    public static void main(String[] args) {
        VecesRepetidas lambdaVecesRepetidas = (frase) -> {
            Map<String, Integer> mapa = new TreeMap<>();

            String[] partes = frase.split(" ");
            for (String parte : partes) {
                mapa.put(parte, mapa.getOrDefault(parte, 0) + 1);
            }
            Map<String, Integer> mapaOrdenado = new TreeMap<>(
                    (a, b) -> mapa.get(b).compareTo(mapa.get(a)));
            mapaOrdenado.putAll(mapa);
            return mapaOrdenado;
        };

        String frase = "Jaime Jaime Jaime Jaime Jovany Jo Jo Ja Ja Ja XD XD XD XD XD";
        Map<String, Integer> resultado = lambdaVecesRepetidas.palabraMasRepetida(frase);

        Entry<String, Integer> entry = resultado.entrySet().iterator().next();
        System.out.println(
                "La frase más repetida es: " + entry.getKey() + " con " + entry.getValue() + " repeticiones.");
    }
}
