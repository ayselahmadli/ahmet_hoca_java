package src.kendiOrneklerim;

import java.util.Scanner;

public class example1 {

    //Soru 2- Kullanicidan bir double, bir de int sayi alip
    //        bunlarin toplamini ve carpimini yazdirin.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen tam sayi giriniz :");
        int sayi = scanner.nextInt();

        System.out.print("Lutfen ondalik sayi giriniz :");
        double ondalik = scanner.nextDouble();

        System.out.println("Bu sayilarin toplami :" + (sayi + ondalik));
        System.out.println("Bu sayilarin carpimi  :" + (sayi * ondalik));
        scanner.nextLine();


        // Kullanicidan ismini isteyip
       // ismi buyuk harfe cevirip kaydedin
      // sonra kullaniciya yeni halini yazdirin
         System.out.println("Lutfen metin giriniz :");
         String str = scanner.nextLine().toUpperCase();
          System.out.println(str);


        // Soru 3- Kullanicidan ismini, soyismini ve yasini alip,
        //         asagidaki formmatta yazdirin.
        //      Isminiz : John
        //      Soyisminiz : DOE
        //      Yasiniz : 44
        //      Kaydiniz basariyla tamamlanmistir.

        System.out.println("Lutfen isminizi,soyisminizi ve yasinizi giriniz :");
        System.out.print("İsminiz :");
        String isim = scanner.nextLine();
        System.out.print("Soyİsminiz :");
        String soyisim = scanner.nextLine().toUpperCase();
        System.out.print("Yasiniz :");
        int yas = scanner.nextInt();

        System.out.println("Isminiz : " + isim + "\nSoyisminiz : " + soyisim
                +"\nYasiniz : " + yas + "\nKaydiniz basariyla tamamlanmistir.");


       // Soru 7 (Interview)- Kullanicidan iki sayi alip
        //        ikisinin degerlerini degistirin(swap).


        System.out.print("Lutfen birinci tam sayiyi giriniz :");
        int sayi1 = scanner.nextInt();

        System.out.print("Lutfen ikinci tam sayiyi giriniz :");
        int sayi2 = scanner.nextInt();

        int temp = 0;
        temp =sayi2;

        sayi2 = sayi1;
        sayi1 = temp;
        System.out.println("Yerleri degistirildi :" + "sayi1 :" + sayi1 + "sayi2 :" + sayi2);

        //Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin
        //degerlerini degistirin(swap).

        System.out.print("Lutfen birinci tam sayiyi giriniz :");
        int sayi3 = scanner.nextInt();

        System.out.print("Lutfen ikinci tam sayiyi giriniz :");
        int sayi4 = scanner.nextInt();

        sayi4 = sayi4 + sayi3;
        sayi3 = sayi4 - sayi3;
        sayi4 = sayi4 -sayi3;

        System.out.println("Yerleri degistirildi :" + "sayi3 :" + sayi3 + "sayi4 :" + sayi4);

        //Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini
        //yazdirin.
        System.out.println("Lutfen birinci kenari giriniz :");
        double dbl2 = scanner.nextDouble();

        System.out.println("Lutfen ikinci kenari giriniz :");
        double dbl3 = scanner.nextDouble();

        double alan = (dbl2 * dbl3);
        System.out.println("Dikdortgenin alani :" + alan);

        //Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        //girilen bilgiler : J Doe, 44


        System.out.println("Lutfen isminizi,soyisminizi ve yasinizi giriniz :");
        System.out.print("İsminiz :");
        char isim1 = scanner.nextLine().toUpperCase().charAt(0);
        System.out.print("Soyİsminiz :");
        String soyisim1 = scanner.nextLine().toUpperCase();
        System.out.print("Yasiniz :");
        int yas1 = scanner.nextInt();

        System.out.println("Girilen bilgiler :" + isim1 + " " + soyisim1 + " , " + yas1);

        //Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.


        System.out.print("Çemberin yarıçapını girin: ");
        double yaricap = scanner.nextDouble();

        // Çemberin çevresini hesaplama
        double cevre = 2 * Math.PI * yaricap;

        // Çemberin alanını hesaplama
        double alan1 = Math.PI * Math.pow(yaricap, 2);

        // Sonuçları yazdırma
        System.out.println("Çemberin çevresi: " + cevre);
        System.out.println("Çemberin alanı: " + alan1);


    }
}