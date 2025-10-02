package models;

import enums.TipoCliente;

public class Cliente {
    private static int contadorClientes = 0;
    private int id;
    private String nombre;
    private TipoCliente tipo;

    public Cliente(String nombre, TipoCliente tipo) {
        this.id = ++Cliente.contadorClientes;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + "]";
    }

}
