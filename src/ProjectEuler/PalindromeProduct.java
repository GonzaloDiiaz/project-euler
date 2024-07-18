package ProjectEuler;

public class PalindromeProduct {
    public static void ejercicio() {
        int producto = 0;
        int maxPalindromo = 0;
        String cadena;
        String cadenaInvertida = "";

        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {
                producto = i * j;
                cadena = String.valueOf(producto);
                cadenaInvertida = "";

                for (int y = cadena.length() - 1; y >= 0; y--){
                    cadenaInvertida = cadenaInvertida + cadena.charAt(y);
                }

                if (cadena.equals(cadenaInvertida) && producto > maxPalindromo){
                    maxPalindromo = producto;
                }
            }
        }
        System.out.println("El mayor palindromo es: " + maxPalindromo);
    }
}
