package com.company;

import java.util.Scanner;

public class Exercicio2 {

    /* 02 - Faça um algoritmo que leia três valores inteiros e mostre no navegador:
        V1 + V2;
        V2 - V1;
        V3 * V1;
        V3 + V2;
        V3 - V2;
        V1 + V2 + V3.
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Insira o primeiro numero");
            int valor1 = scanner.nextInt();

            System.out.println("Insira o segundo numero");
            int valor2 = scanner.nextInt();

            System.out.println("Insira o terceiro numero");
            int valor3 = scanner.nextInt();

            int[] funcoes = {
                    (valor1 + valor2),
                    (valor2 - valor1),
                    (valor3 * valor1),
                    (valor3 + valor2),
                    (valor3 - valor2),
                    (valor1 + valor2 + valor3)
            };

            for (int i = 0; i < funcoes.length; i++) {

                int count = i + 1;

                System.out.println("O valor total do calculo " + count + " é igual a: " + funcoes[i]);
            }
        } catch (Exception e) {

            System.err.println("Porfavor insira apenas numeros inteiros");
        }
    }
}
