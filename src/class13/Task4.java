package class13;

public class Task4 {
    public static void main(String[] args) {
        String a="Is it Saturday? Is it raining? Do we have a Java Class today?";
        String[] strArr=a.split("[.!?]");
        System.out.println(strArr.length);
    }
}
