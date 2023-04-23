package class4;

import java.util.Scanner;

public class HW3DMV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, what is your age?");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Your DL will be issued!");
        } else if (age<18) {
            System.out.println("You are eligible for a Learner's Permit.");

        }
    }
}
