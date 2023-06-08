package src.kendiOrneklerim;

public class Main {
    public static void main(String[] args) {

        //5. Soru: Bir dizideki en büyük ve en küçük sayıların farkının
        //4'e bölümünden kalanı hesaplayan bir Java programı yazın.

        int[] dizi = {5, 10, 15, 20, 25};

        int enBuyuk = dizi[0]; // En büyük sayıyı dizinin ilk elemanıyla başlat
        int enKucuk = dizi[0]; // En küçük sayıyı dizinin ilk elemanıyla başlat

        for (int i = 0; i < dizi.length; i++) {
            if(dizi [i] > enBuyuk){
                enBuyuk = dizi[i];
            }
            if (dizi [i] < enKucuk){
                enKucuk = dizi [i];
            }

        }
        int fark = enBuyuk - enKucuk;
        int kalan1 = fark % 4;

        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
        System.out.println("Farkın 4'e bölümünden kalan: " + kalan1);


        //  6. Soru: Java'da bir sayının rakamlarının toplamının 5'e
    //  bölümünden kalanını hesaplayan bir fonksiyon nasıl yazılır?

    int sayi = 12347;
    int kalan = rakamlarToplamiModulus(sayi);
        System.out.println("Rakamların toplamının 5'e bölümünden kalan : " + kalan);
    }

    public static int rakamlarToplamiModulus(int sayi) {
        int toplam = 0;

        // Sayının rakamlarının toplamını hesapla
        while (sayi != 0) {
            int rakam = sayi % 10;
            toplam += rakam;
            sayi /= 10;
        }

        // Toplamın 5'e bölümünden kalanı hesapla
        int kalan = toplam % 5;

        return kalan;



        }

    }









