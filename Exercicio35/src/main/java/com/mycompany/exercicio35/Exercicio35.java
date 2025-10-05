/*
 Cálculo de Soma e Produto de Vetores com Valores Alternados
Solicite ao usuário dois vetores de 5 números inteiros. 
Percorra os vetores e, para cada posição, 
some os valores se a posição for par e multiplique se a posição for ímpar.
Exiba os resultados em um terceiro vetor.
 */

package com.mycompany.exercicio35;

import java.util.Scanner;

/*
 ****************** @author Guilherme Alves Silva e Santos ******************
 */
public class Exercicio35 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int[] vetor1 = new int[5]; 
        int[] vetor2 = new int[5]; 
        int[] Resultado = new int[5];
        System.out.println("Digite os numeros para o Primeiro Vetor ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            vetor1[i] = scanner.nextInt(); 
            }
            System.out.println("Digite os numeros para o Segundo Vetor");
            for (int i = 0; i < 5; i++) {
                System.out.print("Numero " + (i + 1) + ": ");
                vetor2[i] = scanner.nextInt(); 
                }
                for (int i = 0; i < 5; i++) {
                    if (i % 2 == 0) { 
                    Resultado[i] = vetor1[i] + vetor2[i]; 
                    } else { 
                    Resultado[i] = vetor1[i] * vetor2[i]; 
                    }
                }
                System.out.print("Resultados dos Vetores : ");
                for (int i = 0; i < 5; i++) {
                System.out.print(Resultado[i]);
                    if (i < 4) { 
                System.out.print(", ");
            }
        }
    }
}
    