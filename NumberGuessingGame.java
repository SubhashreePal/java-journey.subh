//Problem - 5 : Number Guessing Game

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random Random = new Random();

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = Random.nextInt(min, max + 1);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d\n" , min, max);
        
        do {
            System.out.print("Enter a guess : ");
            guess = sc.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("Too Low! Try Again!");
            }else if(guess > randomNumber) {
                System.out.println("Too High! Try Again!");
            }else {
                System.out.println("Bravo! The number was " + randomNumber);
                System.out.println("Number of attempts : " + attempts);
            }

        }while(guess != randomNumber);

        System.out.println("You have won!");


        sc.close();

        }

    }






