package com.codeunlu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ucgen = new Scanner(System.in);

        System.out.println("Üçgenin dik kenarını girin: ");
        int a = ucgen.nextInt();
        System.out.println("Üçgenin dik kenarını girin: ");
        int b = ucgen.nextInt();
        System.out.println("Üçgenin hipotenüsünü girin: ");
        int c = ucgen.nextInt();

        int alan = (a * b + b * c) / 2;

        System.out.println("Üçgenin alanı: " + alan);
    }
}
