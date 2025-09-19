import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Validacion {

    public static void main(String[] args) {
        try {
            Path archivo = Path.of("ejercicios/validacionDeUsuarios/usuarios.txt");
            List<String> lineas = Files.readAllLines(archivo);
            for (String linea : lineas) {
                try {
                    if (linea.trim().length() < 3) {
                        throw new NombreInvalidoException(
                                "El nombre '" + linea + "' debe tener al menos 3 caracteres.");
                    }
                    System.out.println(linea);
                } catch (NombreInvalidoException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + e.getMessage());
        }
    }
}

class NombreInvalidoException extends Exception {
    public NombreInvalidoException(String mensaje) {
        super(mensaje);
    }
}