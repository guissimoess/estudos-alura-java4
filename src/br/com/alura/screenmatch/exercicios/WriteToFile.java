package br.com.alura.screenmatch.exercicios;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        String texto = "Conteúdo a ser gravado no arquivo.";

        try {
            FileWriter fileWriter = new FileWriter("arquivo.txt");
            fileWriter.write(texto);
            System.out.println("Dados gravados.");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
