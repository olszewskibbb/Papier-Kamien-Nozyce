package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        wyswietlMenu();

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Random random = new Random();

        int odpowiedz;
        int odpowiedz2;
        String n_1;

        odpowiedz = scanner.nextInt();

        switch(odpowiedz) {
            case 1:
                firstResponse();

                odpowiedz2 = scanner2.nextInt();
                int n1 = random.nextInt(3);

                if (n1 == 0) {
                    n_1 = "Papier";
                } else if (n1 == 1) {
                    n_1 = "Kamien";
                } else {
                    n_1 = "Nozyce";
                }

                if (odpowiedz2 == 0) {
                    System.out.println("Wybrales Papier");
                } else if (odpowiedz2 == 1) {
                    System.out.println("Wybrales Kamien");
                } else {
                    System.out.println("Wybrales Nozyce");
                }

                System.out.println("Komputer wybral: " + n_1);

                if ((odpowiedz2 == 0 && n1 == 0) || (odpowiedz2 == 1 && n1 ==1) || (odpowiedz2 == 2 && n1 == 2)) {
                    System.out.println("Wynik: REMIS!");
                } else if (odpowiedz2 == 0 && n1 == 1) {
                    System.out.println("Wynik: WYGRYWASZ");
                } else if (odpowiedz2 == 0 && n1 == 2) {
                    System.out.println("Wynik: PRZEGRYWASZ");
                } else if (odpowiedz2 == 1 && n1 == 0) {
                    System.out.println("Wynik: PRZEGRYWASZ");
                } else if (odpowiedz2 == 1 && n1 == 2) {
                    System.out.println("Wynik: WYGRYWASZ");
                } else if (odpowiedz2 == 2 && n1 == 0) {
                    System.out.println("Wynik: WYGRYWASZ");
                } else if (odpowiedz2 == 2 && n1 == 1) {
                    System.out.println("Wynik: PRZEGRYWASZ");
                }
                break;
            case 0:
                System.out.println("Wylaczanie programu...");
                break;
            default:
                System.out.println("Zla odpowiedz. Baj Baj...");
        }
    }

    public static void wyswietlMenu() {
        System.out.println();
        System.out.println("Witaj w grze Papier, Kamien, Nozyce!");
        System.out.println("------------------------------------");
        System.out.println("W tej grze, bedziesz konkurowac z komputerem");
        System.out.println("Bedziesz miec do wyboru: Papier, Kamien lub Nozyce");
        System.out.println("------------------------------------");
        System.out.println("Oto zasady, kto kiedy wygrywa:");
        System.out.println("1. Papier bije Kamien");
        System.out.println("2. Kamien bije Nozyce");
        System.out.println("3. Nozyce bija Papier");
        System.out.println("Czy jestes gotow do gry? c:");
        System.out.println("Odpowiedzi: 1. - Jestem gotow, 2. Wyjdz z gry");
    }

    public static void firstResponse() {
        System.out.println("Essa. Zaczynamy :)");
        System.out.println("------------------------------------");
        System.out.println("W takim razie przjedzmy do wyboru.");
        System.out.println("------------------------------------");
        System.out.println("Zdecyduj teraz i wybierz jedna z trzech opcji,");
        System.out.println("Papier (0), Kamien(1) lub Norzyce(2),");
        System.out.println("A komputer Ci odpowie i poda wynik tej rundy");
    }
}