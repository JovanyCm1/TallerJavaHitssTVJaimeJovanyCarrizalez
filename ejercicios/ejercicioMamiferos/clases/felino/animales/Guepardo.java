package clases.felino.animales;

import clases.felino.Felino;

public class Guepardo extends Felino {

    public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanioGarras,
            int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
    }

    @Override
    public String comer() {
      
        return "Soy un guepardo y estoy comiendo.";
    }

    @Override
    public String dormir() {
        
        return "Soy un guepardo y estoy durmiendo.";

    }

    @Override
    public String correr() {
     return "Soy un guepardo y estoy corriendo.";

    }

    @Override
    public String comunicarse() {
        return "Soy un guepardo y estoy rugiendo.";
    }

    @Override
    public String toString() {
        return super.toString();
    }

    
    
}
