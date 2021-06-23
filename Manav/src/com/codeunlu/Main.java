package com.codeunlu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;

        System.out.print("Armut kaç kilo?");
        double armutKilo = variable.nextDouble();
        System.out.print("Elma kaç kilo?");
        double elmaKilo = variable.nextDouble();
        System.out.print("Domates kaç kilo?");
        double domatestKilo = variable.nextDouble();
        System.out.print("Muz kaç kilo?");
        double muzKilo = variable.nextDouble();
        System.out.print("Patlıcan kaç kilo?");
        double patlicanKilo = variable.nextDouble();

        System.out.println("Toplam tutar: " +
                (armutKilo * armut) +
                (elmaKilo * elma) +
                (domatestKilo * domates) +
                (muzKilo * muz) +
                (patlicanKilo * patlican));

    }
}
