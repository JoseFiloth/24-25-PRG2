import java.util.Scanner;

class MadLibs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido a Mad Libs!");

        System.out.print("Introduce un nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce un lugar: ");
        String lugar = scanner.nextLine();

        System.out.print("Introduce un verbo: ");
        String verbo = scanner.nextLine();

        System.out.print("Introduce un adjetivo: ");
        String adjetivo = scanner.nextLine();

        System.out.println("\nAquí está tu historia:");
        System.out.println("Un día, " + nombre + " fue a " + lugar + " y decidió " + verbo + " un " + adjetivo + " objeto.");

        scanner.close();
        System.out.println("¡Gracias por jugar Mad Libs!"); 
    }
}