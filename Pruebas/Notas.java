class Notas {
    public static void main(String[] args) {
        int Matematicas = 5;
        int Biologia = 8;
        int Quimica = 7;
        int Promedio = 0;

        Promedio = (Matematicas + Biologia + Quimica) / 3;
        
        if (Promedio >= 6) {
            System.out.println("El promedio es: " + Promedio + " y el alumno aprueba la materia.");
        } else {
            System.out.println("El promedio es: " + Promedio + " y el alumno reprueba la materia.");            
        }
    }
}