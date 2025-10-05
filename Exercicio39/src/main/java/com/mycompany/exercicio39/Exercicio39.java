package com.mycompany.exercicio39;

import java.util.Scanner;

/*
Verificação de Raiz Quadrada Exata
Crie um programa que solicite ao usuário um número e verifique 
se ele possui uma raiz quadrada exata 
(ou seja, se o resultado da raiz quadrada é um número inteiro). 
Exiba a mensagem correspondente
*/
public class Exercicio39 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe o numero 1: ");
        double numero1 = scanner.nextInt();
        double raiz =Math.sqrt(numero1);
        if (raiz == (int) raiz) {
            System.out.println("O numero " + numero1 + " possui uma raiz quadrada exata: " + (int) raiz);
        } else {
            System.out.println("O numero " + numero1 + " nao possui uma raiz quadrada exata");
        }
        
    }
}
