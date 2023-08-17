package NestedForLoops;

public class carpimTablosu {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 10;

        for (int i = 1; i <= sayi1; i++) {


            for (int j = 1; j <= sayi2; j++) {

                System.out.print(i + "*" + j + "=" + (i * j) + " ");
            }
            System.out.println("");
        }
    }
}
