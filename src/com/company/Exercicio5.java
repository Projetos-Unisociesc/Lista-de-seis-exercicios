package com.company;

import java.util.Scanner;

public class Exercicio5 {

    /*
        05 - Faça um algoritmo que o valor de base e o valor da altura de um triangulo. Calcule e mostre a área deste triângulo.
        Observação: Area = (Base * Altura) / 2;
     */

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Insira a base");
            double base = scanner.nextDouble();

            System.out.println("Insira a altura");
            double altura = scanner.nextDouble();

            System.out.println("A área do triangulo é de " + ((base * altura) / 2));
        } catch (Exception e) {

            System.err.println("Porfavor insira um numero com o formato 125.54");
        }
    }
}
