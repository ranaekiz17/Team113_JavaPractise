package week02;

import java.util.Scanner;

public class CO1_scanner {
    public static void main(String[] args) {


        /*
          1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
          sisteme kaydedildiğini aşağıdaki formatta yazdırın.
          *****       KAYIT BAŞARILI      *****
          Adınız: Tarık
          Soyadınız: Yiğit
          Yaşınız:42
          Mail Adresiniz:tarik@yigit.com
          Şifreniz: A2e365
          seklinde sistemimize kaydınız başarıyla tamamlanmıştır.
       */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen adinizi yaziniz");

        String name = scan.nextLine();

        System.out.println("Lutfen soyadinizi giriniz");

        String surname = scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");

        int yas =scan.nextInt();

        System.out.println("Lutfen e posta adresinizi giriniz");

        String email = scan.nextLine();

        System.out.println("Lutfen bir sifre belirleyiniz");

        String password= scan.next();

        System.out.println("******     KAYIT BASARIİLİ    ******   ");

        System.out.println("Adiniz: " +name);

        System.out.println("Soyadiniz: "+surname);

        System.out.println("Yasiniz:"  + yas);

        System.out.println("E posta adresiniz:" + email);

        System.out.println("Sifreniz:" + password);

        System.out.println("seklinde sistemimize kaydınız başarıyla tamamlanmıştır.");

        System.out.println("========== SORU BITTI  ===========");



    }
}
