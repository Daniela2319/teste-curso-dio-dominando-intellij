package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

         int a,b;

        System.out.println("Digite primeiro valor:  ");
        a = scan.nextInt();

        System.out.println("Digite segundo valor:  ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        double dividir = dividir(a, b);
        int multiplicar = multiplicar(a, b);

        System.out.println("somar:  " + somar );
        System.out.println("subtrair:  " + subtrair );
        System.out.println("dividir:  " + dividir );
        System.out.println("multiplicar:  " + multiplicar );

    }



    public static int somar (int a,  int b){
        return a + b;
    }
    public static int subtrair (int a,  int b){
        return a - b;
    }
    public static int dividir (int a,  int b){
        return a / b;
    }
    public static int multiplicar (int a,  int b){
        return a * b;
    }
}
