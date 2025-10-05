/*
Conversão de Temperaturas em Vetores
Receba 5 temperaturas em Celsius e armazene-as em um vetor. 
Converta cada temperatura para Fahrenheit utilizando a fórmula F = C * 9/5 + 32. 
uma condicional para exibir uma mensagem se alguma das temperaturas 
convertidas for superior a 100°F.
 */

package com.mycompany.exercicio36;

import java.util.Scanner;

/*
****************** @author Guilherme Alves Silva e Santos ******************
 */
public class Exercicio36 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Conversor de Temperaturas Celsius para Fahrenheit");
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a temperatura " + (i + 1) + " em Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsius * 9 / 5 + 32;
            System.out.println(celsius + "*C = " + fahrenheit + "*F");
            if (fahrenheit > 100) {
                System.out.println("!!!!!!!ALERTA CRITICO: TEMPERATURA ACIMA DE 100*F!!!!!!!");
            }
        }
    }
}