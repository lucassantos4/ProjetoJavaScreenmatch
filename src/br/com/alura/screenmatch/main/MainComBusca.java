package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Locale;
import java.util.Scanner;

public class MainComBusca {
    private static String TituloOmdb;

    static void main(String[] args) throws IOException, InterruptedException {

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um filme para busca: ");
        var busca = scanner.nextLine().replace(" ", "+");

        String enderecoUrl = "https://www.omdbapi.com/?t=" + busca + "&apikey=29b58849";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(enderecoUrl))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);


        TituloOmdb tituloOmdb = gson.fromJson(json,TituloOmdb.class);
        System.out.println(tituloOmdb);

        Titulo titulo = new Titulo(tituloOmdb);
        System.out.println("Titulo convertido");
        System.out.println(titulo);
        System.out.println();
        scanner.close();
    }

}
