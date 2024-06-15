package br.com.alura.screenmatch.exerciciosexceptions;

import java.util.Scanner;

public class ExercicioSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a senha");
        String senha = sc.nextLine();

        try {
            validarSenha(senha);
            System.out.println("Senha válida");
        } catch (SenhaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void validarSenha (String senha){
        if (senha.length() < 8) {
            throw new SenhaInvalidaException("A senha deve ter mais que 8 caracteres");
        }
    }
}

