package com.codeunlu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);

        System.out.print("Boyunuz: ");
        double boy = variable.nextDouble();
        System.out.print("Kilonuz: ");
        double kilo = variable.nextDouble();

        System.out.println("Kütle indeksiniz: " + (kilo / boy) * boy);
    }
}
