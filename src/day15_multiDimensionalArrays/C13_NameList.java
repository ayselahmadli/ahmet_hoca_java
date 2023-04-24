package src.day15_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class C13_NameList {

    //Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
    //liste olarak dondurecek bir method olusturun.

    public static void main(String[] args) {

        ArrayList<String> isimler = new ArrayList<>();
        isimListesi();

    }

    public static void isimListesi(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> isimler = new ArrayList<>();

        while (true){
            System.out.println("Bir isim girin : (Cikmak icin Q basin)" );
            String isim = scanner.nextLine();

            if (isim.equalsIgnoreCase("q")) {
                break;

            }else{
                isimler.add(isim);
            }

        }
        System.out.println(isimler);

}
}