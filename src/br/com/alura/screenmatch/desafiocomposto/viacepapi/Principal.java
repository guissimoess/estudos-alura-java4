package br.com.alura.screenmatch.desafiocomposto.viacepapi;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();


        System.out.print("Digite o cep que deseja buscar: ");
        String cep = sc.nextLine();
        try {
            Endereco endereco = consultaCep.buscaEndereco(cep);
            GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
            System.out.println(endereco);
            geradorDeArquivo.salvaJson(endereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Finalizando aplicação");

    }
}
