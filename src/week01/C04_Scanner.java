package week01;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);                     // kullanıcıdan veri almaya basladik



        /*

        1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirni alıp
    sisteme kaydedildiğini aşağıdaki formatta yazdırın.
    *****       KAYIT BAŞARILI      *****
        Adınız: Tarık
        Soyadınız: Yiğit
        Yaşınız:42
        Mail Adresiniz:tarik@yigit.com.tr
        Şifreniz: A2e365
        şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.


         */


        System.out.println("Lutfen adinizi giriniz");

        String name = scan.next();
        System.out.println("lutfen soyisminizi giriniz");
        String surname = scan.next();
        System.out.println("Lutfen yasinizi giriniz");
        int age = scan.nextInt();
        System.out.println("Lutfen mail adresinizi giriniz");
        String email = scan.next();
        System.out.println("Lutfen sifrenizi giriniz");
        String password= scan.next();

        Scanner scanner = new Scanner(System.in);

        System.out.println("isminiz ?\n"+
                "soyadiniz?\n"+
                "yasiniz?\n"+
                "mail adresiniz?\n"+
                "sifre bilgileriniz\n");



        System.out.println("******\t"+name.toUpperCase()+"\t******\n"+
                "\tAdiniz: "+name+"\n"+
                "\tSoyadiniz: "+surname+"\n"+
                "\tYasiniz:"+age+"\n"+
                "\tMail Adresiniz:"+email+"\n"+
                "\tSifreniz: "+password+"\n"+
                "seklinde sistemimize kaydiniz basariyla tamamlanmistir!");
    }
}
