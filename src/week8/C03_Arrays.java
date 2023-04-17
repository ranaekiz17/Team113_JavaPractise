package week8;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Arrays {

    public static void main(String[] args) {
        //Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
        //donduren bir method olusturun.

        System.out.println(Arrays.toString(kullaniciyaArrayYaptir()));
    }

    private static int []kullaniciyaArrayYaptir() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen olusturmak istediginiz Array'ın boyutunu giriniz: ");
        int length = scan.nextInt();
        int [] arr  = new  int [length];
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Array'e eklemek istediginiz sayiyi giriniz");
            arr[i] = scan.nextInt();

        }
        return arr;
    }
}