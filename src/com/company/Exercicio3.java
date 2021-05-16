package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exercicio3 {

    //  03 - Faça um algoritmo que leia o ano de nascimento de uma pessoa, calcule e mostre sua idade aproximada.
    //  Buscar no Google uma função que retorne a data atual (do momento).

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Que dia você nasceu?");

        try {
            System.out.println("Insira o dia");
            int birthDay = scanner.nextInt();

            System.out.println("Insira o mês");
            int birthMonth = scanner.nextInt();

            System.out.println("Insira o ano");
            int birthYear = scanner.nextInt();

            GregorianCalendar dataAtual = new GregorianCalendar();
            GregorianCalendar dataNascimento = new GregorianCalendar(birthYear, birthMonth, birthDay);

            System.out.println("A sua idade aproximada é de: " + (dataAtual.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR)) + " anos");
        } catch (Exception e) {

            System.err.println("Porfavor insira apenas numeros inteiros");
        }
    }
}
