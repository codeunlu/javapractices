package com.codeunlu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String baseUser = "kullanici";
        String basePass = "12345";

        Scanner variable = new Scanner(System.in);
        System.out.print("Kullanıcı adınız: ");
        String username = variable.nextLine();
        System.out.print("Şifreniz: ");
        String password = variable.nextLine();

        if(!basePass.equals(password)){
            System.out.println("Şifreniz hatalıdır.");
            System.out.println("Şifrenizi sıfırlamak ister misiniz?");
            String response = variable.nextLine();
            if(response.equals("evet")){
                System.out.print("Yeni şifrenizi giriniz: ");
                String newPass = variable.nextLine();
                if(newPass.equals(basePass)){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    newPass = variable.nextLine();
                }else{
                    System.out.println("Şifre oluşturuldu");
                    password = newPass;
                }
            }else{
                System.out.println(response);
            }
        }
    }
}
