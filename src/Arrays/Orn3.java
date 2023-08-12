package Arrays;

import java.util.List;

public class Orn3 {
    /*
    3-Problem: En Küçük ve En Büyük Elemanları Bulan Metot
    Verilen bir int türünden oluşan bir dizinin en küçük ve en büyük elemanlarını bulan bir metot oluşturun.
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        enBuyukEnKucuk(arr);
    }

    public static void enBuyukEnKucuk(int[] arr) {
        int enKucuk = arr[0];
        int enBuyyuk = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (enBuyyuk < arr[i]) {
                enBuyyuk = arr[i];
            }
            if (enKucuk > arr[i]) {
                enKucuk = arr[i];
            }
        }
        System.out.println("En küçük : " + enKucuk);
        System.out.println("En büyük : " + enBuyyuk);


    }
}
