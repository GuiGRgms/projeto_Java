package com.mycompany.exercicio38;
/*
Exercício 38: Cálculo do Custo de Combustível para Viagem
Peça ao usuário que insira a distância da viagem (em km), 
o consumo do carro (km por litro) e o preço do combustível 
(por litro). Calcule o custo total da viagem e informe se o valor é superior a R$ 300.

*/

import java.util.Scanner;

/*
 ****************** @author GuiGRgms ******************
 */
public class Exercicio38 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        Double distanciadaViagem = 3.0;
        Double valorkm = 90.00;
        Double valorcombustivel = 6.70;
        Double combustivel = 6.0;
        Double total = 0.0;
        total = total + ((distanciadaViagem * valorkm) + (combustivel * valorcombustivel));
        System.out.println("distancia da viagem: ");
        distanciadaViagem = scanner.nextDouble();
        System.out.println("Quantos litros de combustivel: ");
        combustivel = scanner.nextDouble();
         if (total >= 300) {
            System.out.println("custo total da viagem foi superior a R$ 300 ");
        } else {
            System.out.println("custo total da viagem foi menor a R$ 300 ");
        }
    System.out.printf("total da viagem foi %.1f%n", total);     
    }
}
