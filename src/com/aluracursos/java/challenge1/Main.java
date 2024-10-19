package com.aluracursos.java.challenge1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> options = new ArrayList<>(List.of(0,1,2,3,4,5,6));
        int option;
        do {
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
            if (option == 0) {
                break;
            }
            if (!options.contains(option)) {
                continue;
            }
            System.out.println("Ingrese el valor que desea convertir: ");
            double originalValue = scanner.nextDouble();
            switch (option) {
                case 1:

            }
            //El valor *originalValue* [monedaBase] corresponde al valor final de => *convertedValur* [monedaConvertida]
        }while (option != 0);

        System.out.println("Gracias por su visita, vuelva pronto");
    }
}