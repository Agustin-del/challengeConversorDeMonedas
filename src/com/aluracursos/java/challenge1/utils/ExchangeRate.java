package com.aluracursos.java.challenge1.utils;

import com.aluracursos.java.challenge1.modelos.RespuestaPairAmount;
import com.aluracursos.java.challenge1.modelos.Currency;
import com.google.gson.Gson;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRate {
    private static final String apiKey = System.getenv("EXCHANGE_RATE_API_KEY");
    private static final Gson gson = new Gson();
    private static final HttpClient client = HttpClient.newHttpClient();

    public static String convertirEntreMonedas(Currency monedaBase, Currency monedaDestino, BigDecimal amount) {
        String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + monedaBase + "/" + monedaDestino + "/" + amount;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return gson.fromJson(response.body(), RespuestaPairAmount.class).conversion_result();
        } catch(IOException | InterruptedException e) {
            return e.getMessage();
        }
    }
}
