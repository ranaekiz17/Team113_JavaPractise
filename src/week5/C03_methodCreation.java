package week5;

import java.util.Scanner;

public class C03_methodCreation {
    /*
    Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
    olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
    sonuclarini donduren bir method olusturun.

    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();
        System.out.println(asalSayiKontrolEt(sayi));

    }

    public static String asalSayiKontrolEt(int sayi) {
        String sonuc = "sayi asal sayidir";
        for (int i = 2; i < sayi; i++) {

            if (sayi % i == 0) {
                sonuc = "asal sayi degildir";
            }

        }


        return sonuc;
    }
}