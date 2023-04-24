package src.day09_stringManipulation_forLoop;
import java.util.Scanner;
public class C16_CumleyiTersineCevirme_interviewSorusu {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Lütfen bir metin girin: ");
            String inputStr = scanner.nextLine();

            String reversedStr = new StringBuilder(inputStr).reverse().toString();

            System.out.println("Metnin ters çevrilmiş hali: " + reversedStr);
        }
    }

