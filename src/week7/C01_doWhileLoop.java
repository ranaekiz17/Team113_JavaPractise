package week7;

public class C01_doWhileLoop {

    //'k' harfinden 't' harfine kadar harfleri yazdirin.

    public static void main(String[] args) {
        char ilkHarf = 'k';
        do {
            System.out.print(ilkHarf+"-");
            ilkHarf++;
        } while (ilkHarf<= 't');
    }
}
