/*Exercício 1: Cálculo de IMC
Peça ao usuário para inserir o peso 
(em kg) e a altura (em metros), e calcule o 
Índice de Massa Corporal (IMC) usando a fórmula:

O programa deve informar se o usuário 
está "abaixo do peso" (IMC < 18.5), "peso normal" 
(IMC entre 18.5 e 24.9), "sobrepeso" (IMC entre 25 e 29.9) ou "obesidade" (IMC >= 30).

*/
package com.mycompany.exercicio01;

import java.util.Scanner;

/**
 *
 * @author GuiGRgms
 */
public class Exercicio01 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double peso = 1 ;
    double altura = 1 ;
    String classificacao;
    System.out.println(" Calculadora de indice de Massa Corporal (IMC) ");
    System.out.println("Por favor, insira o seu peso (em kg)? ");
    peso = scanner.nextDouble();
    System.out.println("Por favor, insira a sua altura (em metros)? ");
    altura = scanner.nextDouble();
    double imc = peso / Math.pow(altura, 2);
        if (imc <18.5 ){
            System.out.printf("sua classificacao e abaixo do peso: %.2f\n" , imc);
            }else
            if(imc >=18.5 && imc <=24.9){
                System.out.printf("sua classificacao e peso normal: %.2f\n", imc);
                }else
                if(imc >=25 && imc <= 29.9){
                System.out.printf("sua classificacao e sobre peso: %.2f\n" , imc);
                } else 
                 if(imc >= 30){
                 System.out.printf("sua classificacao e Obesidade: %.2f\n" , imc);
                 }                 
       }
}
