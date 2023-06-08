package src.kendiOrneklerim;

import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
       // Bir tam sayıyı ondalıklı bir sayıya dönüştürmek için nasıl kod yazarım?

        int in1 = 10;
        double dbl = (double) in1;
        System.out.println(dbl);

      //  Bir ondalıklı sayıyı tam sayıya dönüştürmek için nasıl kod yazarım?

        double dbl1 = 2.5;
        int in2 = (int) dbl1;
        System.out.println(in2);

        //Büyük bir sayıyı küçük bir veri türüne dönüştürürken nasıl bir sonuç alırım?

        int in3 = 45;
        byte byt = (byte) in3;
        System.out.println(byt);

        //Bir karakteri tam sayıya dönüştürmek için nasıl bir kod yazarım?

        char ch = '*';
        int in4 = (int) ch;
        System.out.println(in4);

        //Bir tam sayıyı karaktere dönüştürmek için nasıl bir kod yazarım?

        int in5 = 56;
        char ch1 = (char) in5;
        System.out.println(ch1);

       // Bir boolean değeri tam sayıya dönüştürmek için nasıl bir kod yazarım?

        boolean bl = true;
        int in6 = bl ? 1 : 0;
        System.out.println(in6);

        // Bir boolean değeri ondalik sayıya dönüştürmek için nasıl bir kod yazarım?

        boolean bl1 = true;
        double dbl2 = bl1 ? 1 : 0;
        System.out.println(dbl2);

       // Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod yazin

        int sayi1 = 5;
        int sayi2 = 6;
        int sayi3 = 8;

        double ortalama = ((sayi1 + sayi2 + sayi3)/3);
        System.out.println(ortalama);

      // Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz :");

        char harf = scanner.next().charAt(0);

        for (int i = 1; i <=3 ; i++) {
            char nextHarf = (char) (harf + i);
            System.out.println(nextHarf + " ");


            
        }
        //Wrapper class ornekler

        int sayi = 50;
        Integer sayiW = 100;
        System.out.println(sayiW);

        System.out.println("Max" + Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        boolean kontrol = true;
        Boolean kont = false;
        String knt = "false";

        boolean sonuc = Boolean.valueOf(knt);
        System.out.println(sonuc);

        char chr = 'm';
        System.out.println(Character.toUpperCase(chr));
        System.out.println(Character.isAlphabetic(chr));
        System.out.println(Character.isDigit(chr));

      //  Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
      //  ile 127 arasindaki bir sayiya donusturup yazdirin.

        System.out.println("Lutfen bir sayi giriniz :");

        int sayilar = scanner.nextInt();
         sayilar = Math.max(sayilar ,-128);
        sayilar = Math.min(sayilar ,127);

        System.out.println("Donusturulen sayi : " + sayilar);

        //Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
        //isleminin sonucununun tamsayi kismini yazdirin.

        System.out.println("Ondalik birinci sayi giriniz :");
        double dobl = scanner.nextDouble();

        System.out.println("Ondalik ikinci sayi giriniz :");
        double dobl2 = scanner.nextDouble();

        //double bolum = (dobl/dobl2);
        int bolum = (int) (dobl/dobl2);
        System.out.println("Sonuc" + bolum);

       // Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
       // ve bolum isleminin sonucununun tamsayi kismini yazdirin.

        System.out.println("Ondalik birinci sayi giriniz :");
        double doblu = scanner.nextDouble();

        System.out.println("Tam sayi giriniz :");
        int sayil = scanner.nextInt();

        int sonuclar = (int)(doblu/sayil);
        System.out.println("Sonuc" + sonuclar);


    }
}
