package bolsa;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {
    private List<T> elementos = new ArrayList<>();

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public List<T> obtenerTodos() {
        return elementos;
    }
}
