package clases.canino.animales;
import clases.canino.*;


public class Perro extends Canino {
    int fuerzaMordida;
    public Perro(String habitat, float altura, float largo, float peso, String nombreCientifico, String color,
            float tamanoColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }
    @Override
    public String comer() {
        return "Soy un perro y estoy comiendo.";
    }
    @Override
    public String dormir() {
        return "Soy un perro y estoy durmiendo.";
    }
    @Override
    public String correr() {
        return "Soy un perro y estoy corriendo.";
    }
    @Override
    public String comunicarse() {
        return "Soy un perro y estoy ladrando.";
    }
    
    
}
