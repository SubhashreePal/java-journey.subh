//Practice-2 : Program to convert weight from lbs to kgs and vice versa

import java.util.Scanner;
public class WC{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double weight;
        int option;
        double newWeight;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        System.out.print("Choose an option : " );
        option = sc.nextInt();

        if(option==1){
            System.out.print("Enter weight in lbs : ");
            weight = sc.nextDouble();

            newWeight = weight * 0.4535924;
            System.out.printf("The new weight in kgs is : %.2f" , newWeight);
        }
        else if(option==2){
            System.out.print("Enter weight in kgs : ");
            weight = sc.nextDouble();

            newWeight = weight * 2.204623;
            System.out.printf("The new weight in lbs is : %.2f" , newWeight);
        }
        else{
            System.out.println("That is not a valid option");
        }

        sc.close();
    }
}