package ProjectEuler;

import java.util.ArrayList;

public class SumationOfPrimes {
    private static ArrayList<Integer> numerosPrimos = new ArrayList<>();

    public static void llenarArray(){
        for (int i = 2; i <= 2000000; i++){
            esPrimo(i);
        }
    }

    // Método para verificar si un número es primo y agregarlos a la lista
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            numerosPrimos.add((int) n);
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        numerosPrimos.add((int) n);
        return true;
    }

    //Metodo sumar numeros primos
    public static void sumar(){
        long suma = 0;
        for (int i = 0; i < numerosPrimos.size(); i++){
            suma += numerosPrimos.get(i);
        }
        System.out.println("La suma de los números primos es: " + suma);
    }
}
