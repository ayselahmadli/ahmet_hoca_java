package src.kendiOrneklerim;
import java.util.Scanner;
public class example3 {
    public static void main(String[] args) {

        //  Bir kullanıcıdan alınan bir sayının 5'e bölümünden kalanı Java'da nasıl hesaplarız?

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        int kalan = sayi % 5;

        System.out.println("Sayının 5'e bölümünden kalan: " + kalan);

        //15 sayısının 4'e bölümünden kalanı Java'da nasıl hesaplarız ve sonuç ne olur?
        int sayi1 = 15;

        int kalan1 = 15 % 4;

        System.out.println("kalan " + kalan1);

       //1. Soru: Kullanıcıdan alınan bir sayının 2'ye bölümünden
        // kalanı hesaplayan bir Java programı yazın.

        System.out.print("Bir sayı girin: ");
        int sayi2 = scanner.nextInt();

        int kalan2 = sayi2 % 2;

        System.out.println("Sayının 2'e bölümünden kalan: " + kalan2);

           //2. Soru: Bir dizideki tüm elemanların 3'e bölümünden
          // kalanı bulan bir Java fonksiyonu nasıl yazılır?

        int[] dizi = {5, 10, 15, 20, 25};
        int[] kalanlar = modBolumundenKalanlariBul(dizi);

        System.out.println("Dizideki elemanların 3'e bölümünden kalanlar:");
        for (int kalan3 : kalanlar) {
            System.out.println(kalan3);
        }
    }
    public static int[] modBolumundenKalanlariBul(int[] dizi) {
        int[] kalanlar = new int[dizi.length];

        for (int i = 0; i < dizi.length; i++) {
            kalanlar[i] = dizi[i] % 3;
        }

        return kalanlar;
    }

}
















       /*





        7. Soru: Bir kullanıcının gireceği bir sayının faktöriyelini hesapladıktan sonra 7'ye bölümünden kalanını bulan bir Java programı yazın.
        8. Soru: Kullanıcıdan alınan bir sayının 2'ye, 3'e ve 5'e bölümünden kalanları ekrana yazdıran bir Java programı yazın.
        9. Soru: Java'da bir sayının palindromik olup olmadığını kontrol eden bir fonksiyon nasıl yazılır? Sonucu 2'ye bölümünden kalanı döndürsün.
        10. Soru: Bir dizideki çift sayıların toplamının 9'a bölümünden kalanını bulan bir Java programı yazın.

        */

