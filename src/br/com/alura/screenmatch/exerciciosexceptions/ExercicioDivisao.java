package br.com.alura.screenmatch.exerciciosexceptions;

import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class ExercicioDivisao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um númerador");
        int numerador = sc.nextInt();

        System.out.println("Informe um denominador");
        int denominador = sc.nextInt();

        try
        {
            int resultado = numerador /denominador;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero");
        }
    }
}
