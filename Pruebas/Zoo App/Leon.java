public class Leon extends Animal {

    public Leon(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " ruge fuertemente.");
    }

    @Override
    public void alimentar() {
        System.out.println(nombre + " está comiendo carne.");
    }
}
