package com.aluracursos.java.challenge1.utils;

import com.aluracursos.java.challenge1.modelos.Currency;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class APICaller {

    public static Currency convertir(Currency monedaBase, Currency monedaDestino) {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri()
                .build();
    }

}
