package src.day11_methodOverloading_whileLoop;
import java.util.Scanner;
public class C11_isimveSoyisim {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Lutfen adınızı giriniz: ");
            String isim = scanner.next();

            System.out.print("Lutfen soyadınızı giriniz: ");
            String soyİsim = scanner.next();

            String fullName = formatName(isim, soyİsim);

            System.out.println(fullName);
        }

        public static String formatName(String isim, String soyİsim) {
            String formattedisim = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
            String formattedsoyİsim = soyİsim.substring(0, 1).toUpperCase() + soyİsim.substring(1).toLowerCase();

            return formattedisim + " " + formattedsoyİsim;
        }
    }


