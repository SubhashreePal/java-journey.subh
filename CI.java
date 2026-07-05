//Practice Problem 1: Write a program to calculate the compound interest.

import java.util.Scanner;
public class CI{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double principle;
        double rate;
        int compound;
        int year;
        double amount;

        System.out.print("Enter the principle amount : ");
        principle = sc.nextDouble();

        System.out.print("Enter the interest rate (in %) : ");
        rate = sc.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year : ");
        compound = sc.nextInt();

        System.out.print("Enter the # of years : ");
        year = sc.nextInt();

        amount = principle * Math.pow(1 +  rate/compound , compound * year);

        System.out.println("The amount after " + year + " is " + "$" + amount);

        sc.close();
    }
}