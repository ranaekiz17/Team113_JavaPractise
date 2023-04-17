package week4;

import java.util.Scanner;

public class C02_forLoop {

    public static void main(String[] args) {


        /*
         Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
         dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
         baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
       */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir baslangıc degeri girin :");
        int baslangicDegeri = scan.nextInt();

        System.out.println("Bir bitis degeri giriniz");
        int bitisDegeri = scan.nextInt();
        int toplam =0 ;

        if (bitisDegeri < baslangicDegeri){
            System.err.println("========= Baslangıc degeri bitis degerinden kucuk olmalidir  ======");
        } else{
            for (int i = baslangicDegeri; i <= bitisDegeri ; i++) {
                toplam +=i;

            }
        } System.out.println("Girilen degerler arasindaki sayilar toplami :" + toplam);

    }
}
