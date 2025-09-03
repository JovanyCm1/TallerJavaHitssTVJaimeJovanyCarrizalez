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
        return "Soy un perro y estoy comiendo... ¡pero solo si no me quitan la croqueta!";
    }

    @Override
    public String dormir() {
        return "Soy un perro y estoy durmiendo... ¡soñando que persigo carteros y programo en Java!";
    }

    @Override
    public String correr() {
        return "Soy un perro y estoy corriendo... ¡más rápido que mi humano cuando escucha la palabra 'baño'!";
    }

    @Override
    public String comunicarse() {
        return "Soy un perro y estoy ladrando... ¡para que todos los programadores despierten y me saquen a pasear!";
    }

}
