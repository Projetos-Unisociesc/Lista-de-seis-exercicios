package com.company;

import java.util.Scanner;

public class Exercicio6 {

    /*
        06 - Uma empresa tem uma ficha de um determinado funcionário com as informações:
        1- o nome do funcionário;
        2- o número de horas trabalhadas por este funcionário;
        3- e o número de dependentes deste funcionário.
        Considerando que:
        A. A empresa paga fixo R$32.00 por hora;
        B. A empresa paga fixo R$40.00 por dependente;
        C. Sobre o salário bruto são feitos descontos fixos de 8.5% para o INSS
        D. Sobre o salário bruto são feitos descontos fixos de 5% para o IR;
        Faça um algoritmo que leia os dados da ficha do funcionário, calcule:
        1- O salário bruto (hora * valorhora + dependente * valordependente)
        2- Valor do desconto de INSS (percentual sobre o salario bruto);
        3- Valor de desconto de IR (percentual sobre o salario bruto);
        4- Valor liquido do salário deste funcionário (Salario Bruto - INSS - IR).
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Properties
        final double VALOR_HORA = 32;
        final double VALOR_DEPENDENTE = 40;

        try {

            System.out.println("Qual é seu nome?");
            String nome = scanner.next();

            System.out.println("Quantas horas você trabalhou neste mês?");
            double horasTrabalhadas = scanner.nextDouble();

            System.out.println("Quantos dependentes você tem?");
            double dependentes = scanner.nextDouble();

            double salario = (horasTrabalhadas * VALOR_HORA) + (dependentes * VALOR_DEPENDENTE);

            double descontoInss = salario * (8.5 / 100);
            double descontoIr = salario * (5 / 100);
            double pagamentoReal = salario - descontoInss - descontoIr;

            // Exibir informações

            System.out.println("Seu salario bruto é de: " + salario);

            System.out.println("O desconto do INSS é de: " + descontoInss);

            System.out.println("O desconto do IR é de: " + descontoIr);

            System.out.println("O pagamento do " + nome + " é um total de: " + pagamentoReal);
        } catch (Exception e) {

            System.err.println("Você inseriu uma informação incorretamente");
        }
    }
}
