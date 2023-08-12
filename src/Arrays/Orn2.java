package Arrays;

public class Orn2 {
    /*
    2-Problem: Dizi Elemanlarının Ortalamasını Hesaplayan Metot
    Verilen bir double türünden oluşan bir dizinin elemanlarının ortalamasını hesaplayan bir metot oluşturun.
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        arrayOrtalama(arr);
    }

    public static void arrayOrtalama(int[] arr) {
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];

        }
        float ortalama = (float) toplam / arr.length;
        System.out.println(ortalama);
    }
}
