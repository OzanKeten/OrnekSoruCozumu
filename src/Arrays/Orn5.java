package Arrays;

import java.util.Arrays;

public class Orn5 {
    /*
    Dizi Elemanlarını Tersine Çeviren Metot
    Verilen bir String türünden oluşan bir dizinin elemanlarını tersine çeviren bir metot oluşturun.
     */

    public static void main(String[] args) {
        String[] arr = {"ozan", "ali", "mehmet"};
        System.out.println(Arrays.toString(terseCevirme(arr)));
    }

    private static String[] terseCevirme(String[] arr) {
        String[] arr2 = new String[arr.length];
        int sayac = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[sayac] = arr[i];
            sayac++;
        }
        return arr2;
    }
}
