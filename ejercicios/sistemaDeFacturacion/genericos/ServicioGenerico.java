package genericos;

import java.util.ArrayList;
import java.util.List;

public class ServicioGenerico<T extends Identificable<ID>, ID> {
    private List<T> datos = new ArrayList<>();
    // ServicioGenerico<Cliente

    public void agregar(T elemento) {
        if (buscarPorId(elemento.getId()) != null) {
            System.out.println("El elemento con ID " + elemento.getId() + " ya existe.");
            return;
        }
        datos.add(elemento);
    }

    public List<T> listar() {
        return datos;
    }

    public T buscarPorId(ID id) {
        for (T elemento : datos) {
            if (elemento.getId().equals(id)) {
                return elemento;
            }
        }
        return null;
    }

    public boolean eliminarPorId(ID id) {
        for (int i = 0; i < datos.size(); i++) {
            if (datos.get(i).getId().equals(id)) {
                datos.remove(i);
                return true;
            }
        }
        System.out.println("El elemento con ID " + id + " no existe.");
        return false;
    }

    public boolean actualizar(ID id, T nuevoElemento) {
        for (int i = 0; i < datos.size(); i++) {
            if (datos.get(i).getId().equals(id)) {
                datos.set(i, nuevoElemento);
                System.out.println("El elemento con ID " + id + " ha sido actualizado.");
                return true;
            }
        }
        System.out.println("El elemento con ID " + id + " no existe.");
        return false;
    }

    // falta entidades y pruebas
}
