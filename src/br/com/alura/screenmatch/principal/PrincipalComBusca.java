package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.exceptions.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        String titulo = " ";
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        while (!titulo.equalsIgnoreCase("sair")) {
            System.out.println("Digite o título que você deseja buscar: ");
            titulo = sc.nextLine();

            if (titulo.equalsIgnoreCase("sair")) {
                break;
            }

            String endereco = "https://www.omdbapi.com/?t=" + titulo.replace(" ", "+") + "&apikey=adbe8a43";

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);


                TituloOmdb meutituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meutituloOmdb);


                Titulo meutitulo = new Titulo(meutituloOmdb);
                System.out.println("Titulo convertido");
                titulos.add(meutitulo);
                System.out.println(titulos);

                FileWriter escrita = new FileWriter("filmes.json");
                escrita.write(gson.toJson(titulos));
                escrita.close();


            } catch (NumberFormatException e) {
                System.out.println("Erro ao converter o título");
                System.out.println(e.getMessage());
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Fim do programa");
            }
        }
    }
}
