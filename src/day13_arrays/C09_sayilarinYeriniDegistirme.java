package src.day13_arrays;
import java.util.Arrays;
public class C09_sayilarinYeriniDegistirme {

    public static void enSonuOneGetir(int[] array) {
        int n = array.length;
        int temp = array[n-1]; // Sondaki elemanı geçici bir değişkene kopyala

        // Tüm elemanları bir sola kaydır
        for (int i = n-1; i > 0; i--) {
            array[i] = array[i-1];
        }

        array[0] = temp; // Geçici değişkendeki değeri başa taşı
    }
       public static void main(String[] args) {
        // Örnek bir array
        int[] arr = {4,5,6,7};

        System.out.println("Önceki Array: " + Arrays.toString(arr));
        enSonuOneGetir(arr);
        System.out.println("Yeni Array: " + Arrays.toString(arr));
    }
}



