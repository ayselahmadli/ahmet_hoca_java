package src.day15_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class C14_ArrayTamBolenler {
    public static ArrayList<Integer> tamBolenleriBul(int sayi) {
            ArrayList<Integer> tamBolenler = new ArrayList<>();
            for (int i = 1; i <= sayi; i++) {
                if (sayi % i == 0) {
                    tamBolenler.add(i);
                }
            }
            return tamBolenler;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bir pozitif tam sayı girin: ");
            int sayi = scanner.nextInt();
            ArrayList<Integer> tamBolenler = tamBolenleriBul(sayi);
            System.out.println(sayi + " sayısının tam bölenleri: " + tamBolenler);
        }
    }



