package com.codeunlu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner variable = new Scanner(System.in);
        System.out.print("Yarı çap giriniz: ");
        int yaricap = variable.nextInt();
        System.out.print("Merkez açıyı giriniz: ");
        int merkezAci = variable.nextInt();

        double pi = 3.14;

        System.out.println("Dairenin alanı: " + (pi * (yaricap * yaricap) * merkezAci) / 360);

    }
}
