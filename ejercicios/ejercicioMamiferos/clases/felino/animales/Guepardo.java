package clases.felino.animales;

import clases.felino.Felino;

public class Guepardo extends Felino {

    public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanioGarras,
            int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
    }

    @Override
    public String comer() {
        return "Soy un guepardo y estoy comiendo. ¡Espero que mi comida no sea más rápida que yo!";
    }

    @Override
    public String dormir() {
        return "Soy un guepardo y estoy durmiendo. ¡No me despiertes, sueño que gano carreras!";
    }

    @Override
    public String correr() {
        return "Soy un guepardo y estoy corriendo. ¡Si parpadeas, me pierdes!";
    }

    @Override
    public String comunicarse() {
        return "Soy un guepardo y estoy rugiendo. ¡Mi rugido es más rápido que tu WiFi!";
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
