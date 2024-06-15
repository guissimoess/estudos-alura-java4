package br.com.alura.screenmatch.exercicios;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Titulo {
    public static void main(String[] args) {
        Titulo titulo = new Titulo();
        Gson gson = new Gson();

        String json = gson.toJson(titulo);
        System.out.println(json);

        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gsonBuilder.toJson(titulo));



    }
}
