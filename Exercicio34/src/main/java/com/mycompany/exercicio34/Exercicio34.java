
package com.mycompany.exercicio34;
/*
Verificação de Maior Valor em uma Matriz e sua Posição
Crie um programa que receba uma matriz 3x3 de números inteiros. 
Percorra a matriz utilizando laços de repetição e determine o maior valor. 
Exiba o maior valor e sua posição (linha e coluna) na matriz.
*/
import java.util.Scanner;
/*
****************** @author Guilherme Alves Silva e Santos ******************
*/
public class Exercicio34 {

    public static void main(String[] args) {    
    Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        System.out.println("Digite os valores para a matriz 3x3:");
        for (int l = 0; l < 3; l++) {
        for (int c = 0; c < 3; c++) {
        System.out.println("Posicao [" + l + "][" + c + "]: ");
        matriz[l][c] = scanner.nextInt();
        }
        }
        int maiorValor = matriz[0][0];
        int linhaMaior = 0;
        int colunaMaior = 0;
        for (int l = 0; l < 3; l++) {
        for (int c = 0; c < 3; c++) {
            if (matriz[l][c] > maiorValor) {
                maiorValor = matriz[l][c];
                linhaMaior = l;
                colunaMaior = c;
                }
            }
        }
    System.out.println("\nO maior valor na matriz e: " + maiorValor);
    System.out.println("Ele esta na posicao: [" + linhaMaior + "][" + colunaMaior + "]");
    }
}