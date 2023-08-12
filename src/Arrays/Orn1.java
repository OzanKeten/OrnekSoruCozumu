package Arrays;

public class Orn1 {
    /*
    1-Problem: Dizi Elemanlarının Toplamını Hesaplayan Metot
    Verilen bir int türünden oluşan bir dizinin elemanlarının toplamını hesaplayan bir metot oluşturun.
     */
    public static void main(String[] args) {
        int [] mahmut={1,2,3,4,5,6,7,8,9,10};
        arrToplam(mahmut);
    }
    public static void arrToplam(int[]arr){

        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {
            toplam+=arr[i];
        }
        System.out.println(toplam);
    }
}
