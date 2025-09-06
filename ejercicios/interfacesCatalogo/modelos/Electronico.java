 package modelos;

import interfaces.IElectronico;

public class Electronico extends Producto implements IElectronico{

    String fabricante;

    public Electronico(String fabricante, int precio) {
        super(precio);
        this.fabricante = fabricante;
    }
    
    @Override
    public String getFabricante() {
        return fabricante;
    }

}