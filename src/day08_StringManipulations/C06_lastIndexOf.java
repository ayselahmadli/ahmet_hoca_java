package src.day08_StringManipulations;

public class C06_lastIndexOf {

    public static void main(String[] args) {
        String str = "Java cok faydali";
        System.out.println(str.lastIndexOf("a")); //13
        System.out.println(str.lastIndexOf("a", 10)); //10
        System.out.println(str.lastIndexOf("a", 12)); //10
    }
}
