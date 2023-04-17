package week8;

public class C04_Arrays {

    public static void main(String[] args) {


        /*
         Verilen bir array'de istenen bir elemanin var olup olmadigini ve varsa kac kere
         kullanildigini yazdiran bir method olusturun.

         */

        int arr[];
        arr = new int[]{2, 5, 4, 7, 3, 2, 1, 2};
        istenenElemaniAra(arr, 2);
    }

    public static void istenenElemaniAra(int[] arr, int aranan) {

        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == aranan) {
                sayac++;
            }

        }
        if (sayac != 0) {
            System.out.println("Array de aradiginiz " + aranan + " elemanından " + sayac + " vardır");
        } else {
            System.out.println("Aradiginiz  eleman array'de bulunmamaktadir");
        }
    }
}


