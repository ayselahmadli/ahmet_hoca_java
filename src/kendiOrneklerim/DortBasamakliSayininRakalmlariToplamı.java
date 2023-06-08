package src.kendiOrneklerim;

import java.util.Scanner;

public class DortBasamakliSayininRakalmlariToplamı {
    public static void main(String[] args) {
       // Kullanicidan 4 basamakli pozitif bir tamsayi alip rakamlar toplamini bulalim

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz :");

        int sayi = scanner.nextInt();
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        birlerBasamagi = sayi % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;

        sayi = sayi / 10;
        birlerBasamagi = sayi % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;

        sayi = sayi / 10;
        birlerBasamagi = sayi % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;

        sayi = sayi / 10;
        birlerBasamagi = sayi % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;


        System.out.println("Girilen sayinin rakamlar toplami :" + rakamlarToplami);

        scanner.next();








    }
}
