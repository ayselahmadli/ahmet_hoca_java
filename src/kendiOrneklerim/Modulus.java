package src.kendiOrneklerim;

import java.util.Scanner;

public class Modulus {

    public static void main(String[] args) {

        //3. Soru: Bir döngü kullanarak 1'den 100'e kadar olan
        // sayıların 7'ye bölümünden kalanını yazdıran bir Java programı yazın.
       /* for (int i = 1; i <=100 ; i++) {
            int kalan4 = i % 7;
            System.out.println(i + " : " +  "7ye bolunenden kalan :" + kalan4);

        }
*/
       // 4. Soru: Bir kullanıcının gireceği iki sayının toplamının
        // 10'a bölümünden kalanı bulan bir Java programı yazın.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz :");
        int sayi1 = scanner.nextInt();

        System.out.println("İkinci sayiyi giriniz :");
        int sayi2 = scanner.nextInt();

        int toplam = sayi1 + sayi2;

        int kalan = toplam % 10;
        System.out.println("İki sayinin toplaminin 10'a bolumunden kalan :" + kalan);


    }
}





