import ProjectEuler.*;

import java.net.MalformedURLException;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
//        Ejercicio02 ejercicio02 = new Ejercicio02();
//
//        ejercicio02.dificultad("Primero","Segunda");
//        //Ejercicio03.arrayList();
//        Ejercicio04.isPalindromo();
//        Ejercicio04.isIsograma("murcielagoooo");
//        UaiEjercicio15.ejercicio(10);
//        UaiEjercicio16.ejercicio(10);
//        UaiEjercicio17.ejercicio(150000,1520,1420);
//        UaiEjercicio18.ejercicio(10000);
//        UaiEjercicio19.ejercicio(50000);
//        UaiEjercicio20.ejercicio(100000);
//        UaiEjercicio22.ejercicio(3,4,2,1,5,0,2,1);
//        UaiEjercicio23.ejercicio(10,15);
//        UaiEjercicio24.ejercicio(10,15);
//        UaiEjercicio27.ejercicio(10,10);
//        UaiEjercicio1.funcion1(4);
//        UaiEjercicio1.funcion1(20);
//        UaiEjercicio2.dibujarRectangulo(5,10);
        Multiples_Of_3_Or_5.ejercicio();
        Fibonacci.ejercicio();
        NumeroPrimo.mostrar(7000);
        NumeroPrimo.factorizar(600851475143L);
        PalindromeProduct.ejercicio();
        SmallestMultiple.ejercicio();
        SumSquare.ejercicio();
        stPrime.llenarArray();
        stPrime.mostrar(10001);
        LargestProduct.ejercicio();
        PythagoreanTriplet.ejercicio();
        SumationOfPrimes.llenarArray();
        SumationOfPrimes.sumar();
    }

    public static double prestamo(double saldo,double tasaInteres, double tiempo){
        return saldo * tasaInteres * tiempo;
    }
}

