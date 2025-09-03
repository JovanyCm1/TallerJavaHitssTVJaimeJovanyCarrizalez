package clases;

public abstract class Mamifero {
    private String habitat;
    private float altura;
    private float largo;
    private float peso;
    private String nombreCientifico;
    public Mamifero(String habitat, float altura, float largo, float peso, String nombreCientifico) {
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nombreCientifico = nombreCientifico;
    }

    public abstract String comer();
    public abstract String dormir();
    public abstract String correr();
    public abstract String comunicarse();

    @Override
    public String toString() {
        return "Mamifero [habitat=" + habitat + ", altura=" + altura + ", largo=" + largo + ", peso=" + peso
                + ", nombreCientifico=" + nombreCientifico + "]";
    }

}
