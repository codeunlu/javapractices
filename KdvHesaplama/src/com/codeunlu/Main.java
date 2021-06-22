package com.codeunlu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner moneyScanner = new Scanner(System.in);
        System.out.println("Para tutarını giriniz: ");
        double money = moneyScanner.nextDouble();
        double kdv = 0.18;

        System.out.println("Kdv'siz Fiyat: " + money);
        System.out.println("Kdv'li Fiyat: " + (money * kdv + money));
        System.out.println("Kdv tutarı: " + kdv * 100);
    }
}
