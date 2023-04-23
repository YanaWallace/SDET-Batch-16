package class4;

import java.util.Scanner;

public class HW2Loan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hello, it's your Loan Specialist. What is your name?");
        String name= scanner.next();
        System.out.println("Hello, "+name+"! How much loan would you like to get?");
        int loan=scanner.nextInt();
        if (loan<=200000) {
            System.out.println("Loan is approved");
        } else if (loan<200000) {
            System.out.println("Sorry, your loan is denied");

        }
    }
}
