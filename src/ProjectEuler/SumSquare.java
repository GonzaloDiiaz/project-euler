package ProjectEuler;

public class SumSquare {
    public static void ejercicio(){
        //Declaracion de variables
        int suma = 0;
        int sumaNat = 0;
        int diferrence = 0;

        //Un bucle que recorre del 1 al 100
        for (int i = 1; i <= 100; i++){
            //Se le suma i y se lo eleva al cuadrado
            suma = (int) (suma + Math.pow(i,2));
            //Se suma del 1 al 10
            sumaNat = sumaNat + i;
        }
        //El resultado se lo eleva al cuadrado
        sumaNat = (int) Math.pow(sumaNat,2);
        //Es la diferencia entre uno y el otro
        diferrence = sumaNat - suma;
        System.out.println("Diferencia: " + diferrence);
    }
}
