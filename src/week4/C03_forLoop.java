package week4;

import java.util.Scanner;

public class C03_forLoop {

    public static void main(String[] args) {

        /*
           Kullanicidan 150'den küçük pozitif bir sayi alin, 1’den baslayarak tum
           tamsayilari yazdirin, sira
           - 3 ile bolunebilen bir sayiya gelirse, sayi yerine WISE
           - 5 ile bolunebilen bir sayiya gelirse sayi yerine QUARTER
           - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine WISE QUARTER
            yazdirin
      */

        Scanner scan = new Scanner(System.in);
        System.out.println("150 den kucuk Pozitif bir tam sayi giriniz");
        int girilenSayi = scan.nextInt();

        for (int i = 1; i <= girilenSayi; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Wise");
            } else if (i % 5 == 0) {
                System.out.println("Quarter");

            } else if (i % 5 == 0) {
                System.out.println(" Wise Quarter");
            } else {
                System.out.println(i + " ");
            }
        }
    }
}
