
public class Calculadora {

    private double[] numeros;
    private int posicionActual;
    private boolean error;
    private String mensajeError;
    static final private int MEMORIA_MAXIMA = 10;

    public Calculadora() {
        this(MEMORIA_MAXIMA);
    }

    public void ingresarNumero(double valor) {
        if(posicionActual < numeros.length){
            numeros[posicionActual]= valor;
            posicionActual++;
        } else {
            error = true; 
            mensajeError = "memoria llena mamaguevo";
        }
    }
    
    public String mostrar(){
        if (error) {
            return mensajeError;
        } else if (posicionActual > 0) {
            return "" + numeros[posicionActual - 1];
        } else {
            return "-";
        }
    }


    public String mostrarTodo(){
        String resultado = "";
        for(int i = 0; i < posicionActual; i ++){
            resultado += numeros[i] + " ";
        }
        resultado = resultado + "-".repeat(10);
        return error ? mensajeError : resultado;
    }

}
