package ProjectEuler;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NumeroPrimo {
    private static ArrayList<Integer> numerosPrimos = new ArrayList<>();

    // Método para verificar si un número es primo
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

    //Metodo para factorizar un numero dado por los primos
    public static void factorizar(long n) {
        ArrayList<Integer> factoresPrimos = new ArrayList<>();
        int factorMayor = 0;

        int i = 0;
        while (n > 1 && i < numerosPrimos.size()) {
            int primo = numerosPrimos.get(i);
            while (n % primo == 0) {
                factoresPrimos.add(primo);
                n = n / primo;
                factorMayor = primo;
            }
            i++;
        }

        if (n > 1) {
            factorMayor = (int) n;
        }

        System.out.println("El mayor factor primo de " + n + " es: " + factorMayor);
    }

    // Método para mostrar si los números hasta n son primos
    public static void mostrar(double n){
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " -> " + esPrimo(i));
        }
    }
}
