package clases.canino;

import clases.Mamifero;

public abstract class Canino extends Mamifero{
    private String color;
    private float tamanoColmillos;
    public Canino(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanoColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    @Override
    public String toString() {
        return "Canino [color=" + color + ", tamanoColmillos=" + tamanoColmillos + ", " + super.toString() + "]";
    }

}
