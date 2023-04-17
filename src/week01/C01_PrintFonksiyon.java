package week01;

public class C01_PrintFonksiyon {

    public static void main(String[] args) {

        System.out.println("Hello World");

        System.out.println("\"Hello World\"");

        /*
        Soru 2- Konsola "Hello World" yazdiriniz

         Konsola
         "Hello	\
        'World'	\/ seklinde yazdiriniz

         */
        /*
        \n : bir alt satirdan yazmaya baslar
        \t : 1 TAB bosluk birakir
        \": " yazar
        \' : ' yazar
        \\: \ yazar
        \/: / yazar

         */

        System.out.println("\"Hello\t\\\n'World'\t\\/");

        /*
        S0RU 3 - Deger atayarak
        Tarık Yigit- QA Test Enngineer

         */

        String name = "Tarık";
        String surname = "Yigit";
        String job = "QA Software Test Engineer";

        System.out.println(name+" "+surname+"-"+ job);
        System.out.println("======= KOD  BASARIYLA TAMAMLANDI ==========");

        // println alt alta yazdirir
        // print yanyana yazdirir

        //name+" "+surname name yanına "" koymak bosluk koymak anlamına gelir


        System.out.println("********** WİSE BANK **********");
        System.out.println("1- Bakiye Sorgulama\n" +
                "2-Para Yatırma\n" +
                "3-Para Çekme\n" +
                "4-Bilgi Güncelleme\n" +
                "5-Kart İade");




    }
}
