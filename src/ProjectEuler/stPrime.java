package ProjectEuler;

import java.util.ArrayList;

public class stPrime {
    private static ArrayList<Integer> numerosPrimos = new ArrayList<>();

    //Metodo llenar array
    public static void llenarArray(){
        for (int i = 2; i <= 200000; i++){
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

    //Metodo para mostrar
    public static void mostrar(int n){
        System.out.println("Es: " + numerosPrimos.get(n - 1));
    }
}
