package week5;

import java.util.Scanner;

public class C05_MethodCreation {

    /*
    Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
    bolenleri toplamını bulup bize donduren bir method olusturun.
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen pozitif bir tamsayi giriniz");
        int sayi1 = scan.nextInt();


        System.out.println(PozitifBolenToplami(sayi1));
    }

    public static int PozitifBolenToplami(int sayi1) {
        int toplam = 0;
        for (int i = 1; i <=sayi1 ; i++) {
            if (sayi1%i ==0){
                toplam+=i;
            }

        }

        return toplam;
    }
}
