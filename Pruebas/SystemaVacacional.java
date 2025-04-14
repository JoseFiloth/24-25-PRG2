import  java.util.Scanner;

class SystemaVacacional{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String nombre = "" ;
        int clave = 0, antiguedad = 0;

        System.out.println("**********************************");
        System.out.println("*Bienvenido al sistema vacacional*");
        System.out.println("**********************************");
        System.out.println("");
        System.out.println("");

        System.out.print("Ingrese su Nombre: ");
        nombre = sc.nextLine();
        System.out.println("");

        System.out.print("Ingrese su Tiempo de Servicio: ");
        antiguedad = sc.nextInt();  
        System.out.println("");

        System.out.print("Ingrese su Clave: ");
        clave = sc.nextInt(); 
        System.out.println("");

        if (clave == 1){
            if (antiguedad ==1){
                System.out.println("El trabajador " + nombre + " tiene derecho a 6 dias de vacaciones.");
            }else if (antiguedad >= 2 && antiguedad <= 6){
                System.out.println("El trabajador " + nombre + " tiene derecho a 14 dias de vacaciones.");
            }else if (antiguedad >= 7){
                System.out.println("El trabajador " + nombre + " tiene derecho a 20 dias de vacaciones.");  
        } else if (clave == 2){
            if (antiguedad ==1){
                System.out.println("El trabajador " + nombre + " tiene derecho a 7 dias de vacaciones.");
            }else if (antiguedad >= 2 && antiguedad <= 6){
                System.out.println("El trabajador " + nombre + " tiene derecho a 15 dias de vacaciones.");
            }else if (antiguedad >= 7){
                System.out.println("El trabajador " + nombre + " tiene derecho a 22 dias de vacaciones.");  
        } else if (clave == 3){
            if (antiguedad ==1){
                System.out.println("El trabajador " + nombre + " tiene derecho a 10 dias de vacaciones.");
            }else if (antiguedad >= 2 && antiguedad <= 6){
                System.out.println("El trabajador " + nombre + " tiene derecho a 20 dias de vacaciones.");
            }else if (antiguedad >= 7){
                System.out.println("El trabajador " + nombre + " tiene derecho a 30 dias de vacaciones.");  
        } else {
            System.out.println("La clave ingresada no es correcta, por favor verifique su clave.");
        }
    }
}
        }
    }
}