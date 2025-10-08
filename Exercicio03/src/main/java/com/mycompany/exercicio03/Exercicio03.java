/*Exercício 4: Classificação de Triângulos
O programa deve solicitar ao usuário que insira três números que 
representem os lados de um triângulo. Verifique se os valores formam
um triângulo e, se sim, classifique-o como "equilátero", "isósceles" ou "escaleno".
A condição para formar um triângulo é que a soma de dois lados 
deve ser sempre maior que o terceiro.
*/
package com.mycompany.exercicio03;

import java.util.Scanner;

/**
 *
 * @author GuiGRgms
 */
public class Exercicio03 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double ladoA = 0;
    double ladoB = 0;
    double ladoC = 0;
    
        System.out.println(" Classificacao de Triangulos ");
        System.out.print("Digite o comprimento do primeiro lado (A): ");
        ladoA = scanner.nextDouble();

        System.out.print("Digite o comprimento do segundo lado (B): ");
        ladoB = scanner.nextDouble();

        System.out.print("Digite o comprimento do terceiro lado (C): ");
        ladoC = scanner.nextDouble();
        
        System.out.println("Resultado:");
        boolean eTriangulo = (ladoA + ladoB > ladoC) && 
                             (ladoA + ladoC > ladoB) && 
                             (ladoB + ladoC > ladoA);
        if (eTriangulo) {
            System.out.print("Os lados formam um triangulo. Classificacao: ");
            
            if (ladoA == ladoB && ladoB == ladoC) {
                
                System.out.println("Equilatero");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {                
                System.out.println("Isosceles");
                
            } else {
                System.out.println("Escaleno");
            }
        } else {
                System.out.println("Os valores informados NAO formam um triangulo.");    
        }    
    }
}
