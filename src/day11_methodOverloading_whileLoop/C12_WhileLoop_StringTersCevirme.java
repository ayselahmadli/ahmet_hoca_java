package src.day11_methodOverloading_whileLoop;
public class C12_WhileLoop_StringTersCevirme {

    public static void main(String[] args) {

        /*While loop kullanarak verilen bir String'i terse cevirip, bu halini bize
        donduren bir method olusturun*/

        String metin = "Java cooook guzel";
        String deyisdir  = deyisdirString(metin);

        System.out.println("Orijinal Metin: " + metin);
        System.out.println("Ters Cevrilmis: " + deyisdir);

    }

    public static String deyisdirString(String metin) {
        String deyisdir = "";
        int i = metin.length() - 1;

        while (i >= 0) {
            deyisdir += metin.charAt(i);
            i--;
        }

        return deyisdir;
    }
}

