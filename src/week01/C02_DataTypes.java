package week01;

public class C02_DataTypes {

    public static void main(String[] args) {

        System.out.println("Merhaba Java");

        /*
        byte   : sadece tam sayi degeri alir  , 8 bit
        short  : sadece tam sayi degeri alir  , 16 bit
        int    : sadece tam sayi degeri alir  , 32 bit
        long   : sadece tam sayi degeri alir  , 64 bit


        float  : ondalikli sayi degerleri alir - sonuna f konulur, zorunludur
        double : ondalikli sayi degerleri alir - sonunda d konulabilir

        double > float > int >  short >  byte

        boolean : true ya da false verir
        char    : tek tirnak icinde tek karakter olarak - tırnak icinde olmadan sayi(ASCII Tablosu)


         */

        byte b1 = Byte.MAX_VALUE ;

        System.out.println("b1=" + b1); // b1=127

        long l1= Long.MIN_VALUE ;

        System.out.println("l1=" +l1); //-9223372036854775808

        // soutv kisa komutu degerle yazdirir

    }
}
