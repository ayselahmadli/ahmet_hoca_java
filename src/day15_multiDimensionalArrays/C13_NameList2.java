package src.day15_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class C13_NameList2 {

    //Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
        //liste olarak dondurecek bir method olusturun.
        public static ArrayList<String> isimListesi() {
            ArrayList<String> isimler = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Bir isim girin (Çıkmak için 'q' basın): ");
                //Kullanicinin kaç tane isim girdigini
                //bilmediyimiz icin while kullaniyoruz
                String isim = scanner.nextLine();
                if (isim.equalsIgnoreCase("q")) {
                    break;
                } else {
                    isimler.add(isim);
                }
            }
            return isimler;
        }

        public static void main(String[] args) {
            ArrayList<String> isimler = isimListesi();
            System.out.println("Girilen İsimler: " + isimler);
        }
    }





