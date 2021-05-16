package com.company;

import java.util.Scanner;

public class Exercicio4 {

    /*  04 - Faça um algoritmo que leia um determinado valor real, calcule e mostre este valor acrescido de 15,8%.
        Observação 1: Acrescido = Valor + (Valor * (15.8/100));
        Observação 2: Caso de teste 1486,45 deve gerar como resultado 1721,3091.
        Observação 3: Necessário pesquisar como tratar um float utilizando vírgula.
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Insira um valor");

            String valorInserido = scanner.next();

            float valorFomatado = formatarValor(valorInserido);

            System.out.println("O acressimo foi de: " + (valorFomatado + (valorFomatado * (15.8 * 100))));

        } catch (Exception e) {

            System.err.println(e.getMessage());
        }
    }

    private static float formatarValor(String valorInserido) {

        try {
            if (valorInserido.matches("[^0-9,.]")) {

                throw new IllegalArgumentException("O sistema não permite inserir caracteres especiais");
            } else {

                valorInserido = valorInserido.replaceAll(",", ".");

                return Float.parseFloat(valorInserido);
            }
        } catch (IllegalArgumentException e) {

            throw new IllegalArgumentException("Porfavor insira apenas valores com o seguinte formato 1568,64");
        }
    }
}
