package week4;

import java.util.Scanner;

public class C05_forLoop {

    public static void main(String[] args) {

        /*
          Kullanicidan bir String isteyin ve String'i tersine cevirip
          kaydedin.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String str  = scan.next();
        String tersStr= " " ;                                       // kelime istedigimiz icin scan next deriz

        for (int i = str.length(); i >= 1 ; i--) {
             tersStr+= tersStr.substring(i-1,i);


        }

         str= tersStr;
       // System.out.println(tersStr;  ?

    }
}
