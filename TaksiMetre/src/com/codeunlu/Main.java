package com.codeunlu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner aracKM = new Scanner(System.in);

        System.out.print("Mesafeyi km cinsinden giriniz:");
        int kilometre = aracKM.nextInt();

        double sabitTutar = 10;
        double artisMiktari = 2.20;
        if((kilometre * artisMiktari) < 20){
            System.out.println("Ücretiniz: " + sabitTutar * 2);
        }else{
            System.out.println("Ücretiniz: " + kilometre * artisMiktari);
        }
    }
}
