package week4;

public class C06_forLoop {

    public static void main(String[] args) {

          /*
          //verilen String'deki kullalanilan harfleri
             // kelimeyi ve tekrarsiz halini yazdirip
           // kelimede kullanilan farkli harf sayisini yazdırın
          */

        String input = "Hava a nice day";
        String tekrarsizInput = " ";
        String islenecekKelime = input.replaceAll("\\W", ""); //

        System.out.println(input.substring(0, 1)); //
        tekrarsizInput = islenecekKelime.substring(0, 1);

        for (int i = 1; i < islenecekKelime.length(); i++) {
            if (!tekrarsizInput.contains(islenecekKelime.substring(i, i + 1))) {
                System.out.print(","+ islenecekKelime.substring(i,i+1));
                tekrarsizInput += islenecekKelime.substring(i,i+1);

            }
        }
        System.out.println("input:" + input );
        System.out.println("tekrarsiz input:" +tekrarsizInput );
        System.out.println("tekrarsiz harf sayisi:" +tekrarsizInput.length());

        // H
        //,a,v,n,i,c,e,d,yinput:Hava a nice day
        //tekrarsiz input:Havnicedy
        //tekrarsiz harf sayisi:9
    }
}
