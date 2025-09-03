package clases.felino.animales;

import clases.felino.Felino;

public class Leon extends Felino {
    private int numeroManada;
    private float potenciaRugidoEnDecibel;

    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanioGarras,
            int velocidad, int numeroManada, float potenciaRugidoEnDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
        this.numeroManada = numeroManada;
        this.potenciaRugidoEnDecibel = potenciaRugidoEnDecibel;
    }

    @Override
    public String comer() {
        return "Soy un león y estoy comiendo.";
    }

    @Override
    public String dormir() {
        return "Soy un león y estoy durmiendo.";
    }

    @Override
    public String correr() {
        return "Soy un león y estoy corriendo.";
    }

    @Override
    public String comunicarse() {
        return "Soy un león y estoy rugiendo.";

    }

    @Override
    public String toString() {
        return super.toString() + "Leon{" +
            "numeroManada='" + numeroManada + '\'' +
            ", potenciaRugidoEnDecibel=" + potenciaRugidoEnDecibel +
            '}';
    }

    

}
