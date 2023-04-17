package week4;

import java.util.Scanner;

public class CO1_forLoop {

    public static void main(String[] args) {

        /*
        Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
        dahil) 7 ila bolunebilen sayilari yazdirin.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir tam sayi giriniz");

        int girilenSayi = scan.nextInt();
        for (int i = 1; i <= girilenSayi; i++) {
            if( i%7 == 0){
                System.out.print(i+"-");


            }

        }
        System.out.println("");
        System.err.println("=================== islem tamamlandi ================");

        //  50
        //7-14-21-28-35-42-49-
        //=================== islem tamamlandi ================
    }
}
