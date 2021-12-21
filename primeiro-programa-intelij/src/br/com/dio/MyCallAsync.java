package br.com.dio;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.ExecutionException;

public class MyCallAsync {

    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
        final HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();

        final HttpRequest HttpRequest = java.net.http.HttpRequest.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .uri(URI.create("https://www.agristar.com.br"))
                .GET()
                .build();

        httpClient.sendAsync(HttpRequest, HttpResponse.BodyHandlers.ofString())
                .thenApply(stringHttpResponse -> {
                    System.out.println(stringHttpResponse.statusCode());
                    return stringHttpResponse;
                })
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println);

        // Aguarda a requsição assincrona acontecer antes de finalizar o programa
        Thread.sleep(2000);
    }
}
