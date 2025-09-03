package clases.felino.animales;

import clases.felino.Felino;

public class Tigre extends Felino {
    private String especieTigre;

    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanioGarras,
            int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    @Override
    public String comer() {
        return "Soy un tigre y estoy comiendo.";
    }

    @Override
    public String dormir() {
        return "Soy un tigre y estoy durmiendo.";
    }

    @Override
    public String correr() {
        return "Soy un tigre y estoy corriendo.";
    }

    @Override
    public String comunicarse() {
        return "Soy un tigre y estoy rugiendo.";
    }

    @Override
    public String toString() {
        return super.toString() + "Tigre{" +
                "especieTigre='" + especieTigre + '\'' +
                '}';
    }

}
