package clases.felino;
import clases.Mamifero;

public abstract class Felino extends Mamifero {
    private float tamanioGarras;
    private int velocidad;
    public Felino(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanioGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanioGarras = tamanioGarras;
        this.velocidad = velocidad;
    }
    @Override
    public String toString() {
        return "Felino [tamanioGarras=" + tamanioGarras + ", velocidad=" + velocidad + ", " + super.toString() + "]";
    }

    
}
