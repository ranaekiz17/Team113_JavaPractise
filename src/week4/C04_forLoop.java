package week4;

import java.util.Scanner;

public class C04_forLoop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("150 den kucuk Pozitif bir tam sayi giriniz");
        int girilenSayi = scan.nextInt();

        for (int i = 1; i <= girilenSayi; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(" Wise ");
            } if (i % 5 == 0) {
                System.out.print(" Quarter ");

            } if (i % 5 == 0) {
                System.out.println(" Wise Quarter");
            } else {
                System.out.println(i + " ");
            }
        }
    }
}