package src.day14_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C12_ArraydaPozitifSayilariToplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen array boyutunu giriniz");
        int arrayBoyut = scanner.nextInt();
        int [] arr = new int[arrayBoyut];
        int arrayElementi=0;
        // arrayin boyutu kadar loop ile, arrayin elemanlarını kullanıcıdan alıyoruz
        for (int i = 0; i < arrayBoyut; i++) {
            System.out.println("lütfen arrayin "+i+"ci elemanini giriniz");
            arrayElementi= scanner.nextInt();
            arr[i]=arrayElementi;
        }
        System.out.println(Arrays.toString(arr));
        ArraydaPozitifSayilariToplama(arr);

    }

        // Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        //method yaziniz.
         public static void ArraydaPozitifSayilariToplama(int[] arr){

           int toplam=0;
           for (int i = 0; i < arr.length ; i++) {
               if (arr[i] > 0){
               toplam += arr[i];
           }
           }
            System.out.println("Array'deki pozitif sayilarin toplami :" + toplam );
        }


       }

