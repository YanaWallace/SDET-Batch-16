package class4;

import java.util.Scanner;

public class HW4Temperature {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What city are you in?");
        String city= scanner.nextLine();
        System.out.println("What is the temperature in your city in F?");
        double temperatureF= scanner.nextDouble();
        double temperatureC= ((temperatureF-32.0)/1.8);
        System.out.println("The temperature in "+city+" is "+temperatureC+" C");
    }
}
