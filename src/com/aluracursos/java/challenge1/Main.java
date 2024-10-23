package com.aluracursos.java.challenge1;

import java.math.BigDecimal;
import java.util.*;
import com.aluracursos.java.challenge1.modelos.Currency;
import com.aluracursos.java.challenge1.utils.ExchangeRate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> options = new ArrayList<>(List.of(0,1,2,3,4,5,6));

        while(true) {
            int option;
            while (true) {
                try {
                    System.out.println("********************************\n" +
                            "Sea bienvenido/a al conversor de moneda\n" +
                            "1) Dólar => Peso Argentino\n" +
                            "2) Peso Argentino => Dólar\n" +
                            "3) Dólar => Real Brasileño\n"+
                            "4) Real Brasileño => Dólar\n"+
                            "5) Dólar => Peso Colombiano\n" +
                            "6) Peso Colombiano => Dólar\n" +
                            "0) Salir\n" +
                            "Elija una opción válida: \n"+
                            "********************************");
                    option = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor ingrese una opción válida");
                    scanner.next();
                }
            }

            if (option == 0) {
                break;
            }
            if (!options.contains(option)) {
                continue;
            }

            BigDecimal originalValue;
            while (true) {
                try {
                    System.out.println("Ingrese el valor que desea convertir: ");
                    originalValue = new BigDecimal(scanner.next());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Ingrese un valor numérico");
                    scanner.next();
                }
            }

            switch (option) {
                case 1:
                    Currency monedaBase = Currency.USD;
                    Currency monedaDestino = Currency.ARS;
                    BigDecimal convertedValue = new BigDecimal(ExchangeRate.convertirEntreMonedas(monedaBase, monedaDestino, originalValue));
                    System.out.println(originalValue + " USD = " + convertedValue + " ARS");
                    break;
                case 2:
                    monedaBase = Currency.ARS;
                    monedaDestino = Currency.USD;
                    convertedValue = new BigDecimal(ExchangeRate.convertirEntreMonedas(monedaBase, monedaDestino, originalValue));
                    System.out.println(originalValue + " ARS = " + convertedValue + " USD");
                    break;
                case 3:
                    monedaBase = Currency.USD;
                    monedaDestino = Currency.BRL;
                    convertedValue = new BigDecimal(ExchangeRate.convertirEntreMonedas(monedaBase, monedaDestino, originalValue));
                    System.out.println(originalValue + " USD = " + convertedValue + " BRL");
                    break;
                case 4:
                    monedaBase = Currency.BRL;
                    monedaDestino = Currency.USD;
                    convertedValue = new BigDecimal(ExchangeRate.convertirEntreMonedas(monedaBase, monedaDestino, originalValue));
                    System.out.println(originalValue + " BRL = " + convertedValue + " USD");
                    break;
                case 5:
                    monedaBase = Currency.USD;
                    monedaDestino = Currency.COP;
                    convertedValue = new BigDecimal(ExchangeRate.convertirEntreMonedas(monedaBase, monedaDestino, originalValue));
                    System.out.println(originalValue + " USD = " + originalValue.multiply(convertedValue) + " COP");
                    break;
                case 6:
                    monedaBase = Currency.COP;
                    monedaDestino = Currency.USD;
                    convertedValue = new BigDecimal(ExchangeRate.convertirEntreMonedas(monedaBase, monedaDestino, originalValue));
                    System.out.println(originalValue + " COP = " + convertedValue + " USD");
                    break;
            }
        };

        System.out.println("Gracias por su visita, vuelva pronto");
    }
}