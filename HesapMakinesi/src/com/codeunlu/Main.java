package com.codeunlu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int var = variable.nextInt();
        System.out.print("Sayı giriniz: ");
        int var2 = variable.nextInt();

        variable.nextLine();
        System.out.print("İşlem giriniz: ");
        String islem = variable.nextLine();

        switch (islem){
            case "+":
                System.out.println("Toplam: " + var + var2);
                break;
            case "-":
                System.out.println("Çıkarma: " + (var - var2));
                break;
            case "*":
                System.out.println("Çarpma: " + var * var2);
                break;
            case "/":
                System.out.println("Bölme: " + (var / var2));
                break;
        }
    }
}
