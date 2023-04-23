package class13;

public class E3StringDemo {
    public static void main(String[] args) {
        String str="demodemo YAYA BRANDON 99999999999999 $%#*@";
        System.out.println(str.replaceAll("[^a-z]",""));
        System.out.println(str.replaceAll("[^a-z0-9A-Z]",""));
        System.out.println(str.replaceAll("[AeN]",""));
        System.out.println(str.replaceAll("[a-z]","\\$"));
        System.out.println(str.replaceAll(" ","\\$"));
    }
}
