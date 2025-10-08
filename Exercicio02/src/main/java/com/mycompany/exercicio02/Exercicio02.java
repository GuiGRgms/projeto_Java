/*
Exercício 2: Cálculo de Média Aritmética
Crie um programa que peça ao usuário três notas de um aluno e calcule a média aritmética.
O programa deve informar se o aluno foi "aprovado" (média >= 7), "em recuperação" 
(média entre 5 e 6.9) ou "reprovado" (média < 5).

*/

package com.mycompany.exercicio02;

import java.util.Scanner;

/**
 *
 * @author GuiGRgms
 */
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Calculo de Media Aritmetica ");
        double nota1 = 0;
        double nota2 = 0;
        double nota3 = 0;
        
        System.out.println("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        nota3 = scanner.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3.0;
        System.out.printf("A Media Aritmetica do aluno e: %.2f\n", media);
        System.out.println("Situação: ");
        if (media >= 7.0) {
            System.out.println("Aprovado!");
            
        } else 
            if (media >= 5.0 && media < 7.0) {
            System.out.println("Em Recuperacao.");
            
        } else {
            System.out.println("Reprovado.");
        }
    }
}
