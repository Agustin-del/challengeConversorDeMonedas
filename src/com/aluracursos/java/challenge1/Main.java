package com.aluracursos.java.challenge1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        int option = scanner.nextInt();

    }
}