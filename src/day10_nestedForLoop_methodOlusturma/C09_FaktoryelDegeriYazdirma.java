package src.day10_nestedForLoop_methodOlusturma;

public class C09_FaktoryelDegeriYazdirma {

    public static int faktoryelDegeriYazdirma(int deger){

        int  faktoryelDegeri = 1;
        int i;
        for(i = 1; i <= deger ; i++){
        faktoryelDegeri *=i;
    }
        return faktoryelDegeri;
    }
        public static void main(String[] args) {
            System.out.println(faktoryelDegeriYazdirma(5));
        // verdigimiz bir sayinin faktoryel degerini yazdiran
        // bir method olusturun
    }
}


