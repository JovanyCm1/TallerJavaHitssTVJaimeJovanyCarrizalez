package clases.canino.animales;
import clases.canino.*;

public class Lobo extends Canino {
    int numeroDeCamada;
    String especieLobo;
    public Lobo(String habitat, float altura, float largo, float peso, String nombreCientifico, String color,
            float tamanoColmillos, int numeroDeCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numeroDeCamada = numeroDeCamada;
        this.especieLobo = especieLobo;
    }
       @Override
    public String comer() {
        return "Soy un lobo y estoy comiendo... pero solo si no hay Caperucita cerca!";
    }
    @Override
    public String dormir() {
        return "Soy un lobo y estoy durmiendo... soñando que programo en Java y aúllo a la luna";
    }
    @Override
    public String correr() {
        return "Soy un lobo y estoy corriendo... más rápido que los bugs en mi código";
    }
    @Override
    public String comunicarse() {
        return "Soy un lobo y estoy aullando... para que todos los programadores despierten!";
    }
    
    
}
