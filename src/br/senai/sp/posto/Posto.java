package br.senai.sp.posto;

/**
 * Posto de Combustível
 * Data: 17/08/2023
 * Autor: Guilherme Pereira
 * */

import java.util.Scanner;

public class Posto {
    public static void main(String[] args) {
        /** Declara variaveis */
        float gasolina, alcool, calculo;
        String nome, resposta;
        Boolean continua = true;
        int numCliente = 0;

        /** Instancia Scanner */
        Scanner teclado = new Scanner(System.in);

        while (continua) {

            /** Coleta dados do usuario */
            System.out.println("---------------------------------");
            System.out.println("----- Posto de Combustível ------");
            System.out.println("---------------------------------");
            System.out.print("Insira seu nome: ");
            nome = teclado.next();
            numCliente += 1;
            System.out.printf("Bem vindo, Sr(a) %s! Você é o cliente de número %d\n", nome, numCliente);
            System.out.print("\nQual o valor da gasolina? ");
            gasolina = teclado.nextFloat();
            System.out.print("Qual o valor do álcool? ");
            alcool = teclado.nextFloat();
            System.out.println("---------------------------------");

            /** Utiliza os dados para calcular a variavel */
            calculo = (alcool / gasolina);

            /** Fornece desconto até o décimo cliente */
            if (numCliente<=10){
                System.out.println("Você ganhou 25% de desconto no preço da gasolina!!!!");
                gasolina *= 0.75;
            }

            /** Imprime o resultado */
            System.out.printf("Com a gasolina custanto R$%.2f/L e o álcool R$%.2f/L\n", gasolina, alcool);
            if (calculo >= 0.7) {
                System.out.println("Nesses valores a gasolina é a melhor opção.");
            } else {
                System.out.println("Nesses valores o álcool é a melhor opção.");
            }

            /** Finaliza ou reinicia o sistema */
            System.out.println("---------------------------------");
            System.out.println("Quer continuar?[S/N] ");
            resposta = teclado.next();
            if (resposta.equalsIgnoreCase("n")) {
                continua = false;
            }
        }
    }
}
