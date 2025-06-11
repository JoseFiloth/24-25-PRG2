public class Elefante extends Animal {

    public Elefante(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " barrita suavemente.");
    }

    @Override
    public void alimentar() {
        System.out.println(nombre + " está comiendo hierba y frutas.");
    }
}
