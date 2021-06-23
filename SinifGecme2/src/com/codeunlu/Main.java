package com.codeunlu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double toplam = 0;
        Scanner var = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        double matematik = var.nextDouble();

        System.out.print("Fizik notunuz: ");
        double fizik = var.nextDouble();

        System.out.print("Türkçe notunuz: ");
        double turk = var.nextDouble();

        System.out.print("Kimya notunuz: ");
        double kimya = var.nextDouble();

        System.out.print("Müzik notunuz: ");
        double muzik = var.nextDouble();


        if(matematik >= 0 && matematik <= 100){
            toplam += matematik;
        }
        if(fizik >= 0 && fizik <= 100){
            toplam += fizik;
        }
        if(turk >= 0 && turk <= 100){
            toplam += turk;
        }
        if(kimya >= 0 && kimya <= 100){
            toplam += kimya;
        }
        if(muzik >= 0 && muzik <= 100){
            toplam += muzik;
        }

        if(toplam / 5 >= 50){
            System.out.println("Sınıfı geçtiniz. " + toplam);
        }else{
            System.out.println("Sınıfta kaldınız!! " + toplam);
        }
    }
}
