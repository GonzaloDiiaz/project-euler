package ProjectEuler;

public class SmallestMultiple {

    public static void ejercicio() {
        //Declaramos variables
        int[] primos = {2, 3, 5, 7, 11, 13, 17, 19};
        //Un array que almacena la mayor potencia de cada primo
        int[] factorPrimo = new int[primos.length];

        for (int i = 1; i <= 20; i++) {
            int numero = i;
            // Copia de `i` para preservar el valor original
            for (int j = 0; j < primos.length; j++) {
                int contador = 0;// Reiniciar el contador para cada primo

                while (numero % primos[j] == 0) {
                    numero /= primos[j];
                    contador++;
                }

                if (contador > factorPrimo[j]) {
                    factorPrimo[j] = contador;
                }
            }
        }

        long lcm = 1;
        for (int j = 0; j < primos.length; j++) {
            lcm *= Math.pow(primos[j], factorPrimo[j]);
        }

        System.out.println("El menor múltiplo es: " + lcm);
    }
}
