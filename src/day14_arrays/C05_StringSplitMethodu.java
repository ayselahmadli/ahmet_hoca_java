package src.day14_arrays;

import java.util.Arrays;
public class C05_StringSplitMethodu {

    public static void main(String[] args) {
        // split methodu : istediğimiz yerden bir yaziyi bolerek, parcaciklari array'a atar
        String str = "Java gercekten cok guzel";
        // kac tane "e" harfi var
        //1) tane tane ayiralim
        String[] tanetane = str.split("");
        System.out.println(Arrays.toString(tanetane));  // [J, a, v, a,  , g, e, r, c, e, k, t, e, n,  , c, o, k,  , g, u, z, e, l]
        int sayac = 0;
        for (int i = 0; i < tanetane.length; i++) {
            if (tanetane[i].equals("e")) {
                //3) kac tane var
                sayac++;
            }
        }
        System.out.println("Aradigimiz e harfi arrayin icinde "+sayac+" tane var");
    }
}

