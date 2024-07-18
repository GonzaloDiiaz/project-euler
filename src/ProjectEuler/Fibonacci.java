package ProjectEuler;

public class Fibonacci {
    public static void ejercicio() {
        int a = 1; // Primer número de Fibonacci
        int b = 2; // Segundo número de Fibonacci
        int suma;
        int numPar = 0; // Para almacenar la suma de los números pares

        while (a <= 4000000) { // Continuar mientras el número de Fibonacci no exceda los 4 millones
            if (a % 2 == 0) {
                numPar += a; // Sumar el número par a la suma total
            }
            suma = a + b; // Calcular el siguiente número de Fibonacci
            a = b; // Actualizar a
            b = suma; // Actualizar b
        }

        System.out.println("La suma de números pares en la secuencia de Fibonacci que no exceden los cuatro millones es: " + numPar);
    }

    public static void main(String[] args) {
        ejercicio();
    }
}
