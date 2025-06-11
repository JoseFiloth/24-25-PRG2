public class Cuidador implements ICuidador {
    private String nombre;

    public Cuidador(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void alimentarAnimal(Animal animal) {
        System.out.println(nombre + " está alimentando a " + animal.getClass().getSimpleName() + "...");
        animal.alimentar();
    }
}
