package com.company;

import java.util.Scanner;

public class Excercio1 {

    //01 - Faça um algoritmo que leia dois números inteiros, execute e mostre as quatro operações aritméticas básicas.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] cars = {"*", "/", "+", "-"};

        try {

            System.out.println("Digite o primeiro numero");
            int numero1 = scanner.nextInt();

            System.out.println("Digite o segundo numero");
            int numero2 = scanner.nextInt();

            for (String c :
                    cars) {

                switch (c) {
                    case "*":
                        System.out.println("Resultado de uma multiplcação: " + (numero1 * numero2));
                        break;
                    case "/":
                        System.out.println("Resultado de uma divisão: " + ((double) numero1 / (double) numero2));
                        break;
                    case "-":
                        System.out.println("Resultado de uma subtração: " + (numero1 - numero2));
                        break;
                    case "+":
                        System.out.println("Resultado de uma adição: " + (numero1 + numero2));
                }
            }
        } catch (Exception e) {

            System.err.println("Porfavor insira apenas numeros inteiros");
        }
    }
}
