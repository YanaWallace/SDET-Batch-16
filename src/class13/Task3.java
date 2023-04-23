package class13;

public class Task3 {
    public static void main(String[] args) {
        String str="demoYAYABRANDON999999$$$$$!!!!";
        //String str1=str.replaceAll("[^A-z]","");
        //System.out.println(str1);
       // System.out.println(str1.length());
        System.out.println(str.replaceAll("[A-z]","").length());

        }
    }

