package com.mycompany.exercicio37;
/*
Cálculo de Média Geométrica

*/

import java.util.Scanner;

public class Exercicio37 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double numeiro1 = 0.0 ;
        Double numeiro2 = 0.0 ;
        Double numeiro3 = 0.0 ;
        Double mediaGeometrica = 0.0;
        System.out.println("informe o numero 1: ");
        numeiro1 = scanner.nextDouble();
        System.out.println("informe o numero 2: ");
        numeiro2 = scanner.nextDouble();
        System.out.println("informe o numero 3: ");
        numeiro3 = scanner.nextDouble();
        mediaGeometrica =(numeiro1 + numeiro2 + numeiro3)/3;
        if (mediaGeometrica >= 15) {
            System.out.println("A media geometrica e maior que 15.");
        } else {
            System.out.println("A media geometrica e menor que 15.");
        }
    System.out.printf("A media geometrica e: %.1f%n", mediaGeometrica);    
    }
}
