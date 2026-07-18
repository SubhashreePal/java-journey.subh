//Problem=5 : Program to reverse a number
import java.util.Scanner;

public class Day38 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num;
        int rev=0;

        System.out.print("Enter a number : ");
        num = sc.nextInt();

        while(num!=0){
            int digit = num%10;
            rev = rev*10 + digit;
            num/=10;
        }
        System.out.println("Reversed number : " + rev);
        sc.close();

        }

    }
