package class6;

import java.util.Scanner;

public class E3Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your height in inches");
        int height = scanner.nextInt();
        System.out.println(height);
        if (height < 60) {
            System.out.println("Short");
        } else if (height >= 60 && height <= 72) {
            System.out.println("Medium");

        }else {
            System.out.println("Tall");

        }
    }
}





