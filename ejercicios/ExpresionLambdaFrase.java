import java.util.function.Function;

public class ExpresionLambdaFrase {
    public static void main(String[] args) {
        Function<String, String> limpiarYMayusculas = frase -> frase.replaceAll("[ ,\\.]", "").toUpperCase();

        String frase = "Hola, soy. jaime";
        String fraseProcesada = limpiarYMayusculas.apply(frase);
        System.out.println(fraseProcesada);
        
    }
}
