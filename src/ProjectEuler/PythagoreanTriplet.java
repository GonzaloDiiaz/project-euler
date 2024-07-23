package ProjectEuler;

public class PythagoreanTriplet {
    public static void ejercicio(){
        int a = 0;
        int b = 0;
        int c = 0;

        for (a = 1; a < 1000; a++) {
            for (b = a + 1; b < 1000; b++) {
                c = 1000 - a - b;

                if (a * a + b * b == c * c) {
                    System.out.println("El producto de los tres números es: " + a * b * c);
                    return;
                }
            }
        }
    }
}
