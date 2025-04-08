
class Suma {

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 2;
        int resultado = 0;
        int parametro = 2;

        switch (parametro) {

            case 1:
                resultado = num1 + num2;
                System.out.println("La suma es: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("La resta es: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("La multiplicacion es: " + resultado);
                break;
            case 4:
                resultado = num1 / num2;
                System.out.println("La division es: " + resultado);
                break;
            default:
                System.out.println("Opcion no valida, por favor verifique su opcion.");
                break;

        }

    }
}
