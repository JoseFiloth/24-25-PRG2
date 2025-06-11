import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Leon("Simba", 5));
        animales.add(new Elefante("Dumbo", 10));

        Cuidador cuidador = new Cuidador("Carlos");

        for (Animal animal : animales) {
            animal.mostrarInfo();
            animal.hacerSonido();
            cuidador.alimentarAnimal(animal);
            System.out.println("------------");
        }
    }
}
