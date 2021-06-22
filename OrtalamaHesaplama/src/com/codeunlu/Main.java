package com.codeunlu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mat;
        int fizik;
        int kimya;
        int turkce;
        int tarih;
        int muzik;

        Scanner not = new Scanner(System.in);

        System.out.println("Matematik not: ");
        mat = not.nextInt();
        System.out.println("Fizik not: ");
        fizik = not.nextInt();
        System.out.println("Kimya not: ");
        kimya = not.nextInt();
        System.out.println("Türkçe not: ");
        turkce = not.nextInt();
        System.out.println("Tarih not: ");
        tarih = not.nextInt();
        System.out.println("Müzik not: ");
        muzik = not.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        System.out.println("Ortalamanız: " + (double)(toplam / 6) );
        System.out.println((double)(toplam / 6) >= 60 ? "Geçti" : "Kaldı");

    }
}
