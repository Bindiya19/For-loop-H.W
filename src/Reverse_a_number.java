//Reverse a number using for Loop
import java.util.Scanner;

import static java.lang.Integer.reverse;

public class Reverse_a_number
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your numbers: ");
        int num = scanner.nextInt();

        int reverseNumber = 0 ;

        // Loop to reverse the number
        for (; num != 0; num /= 10) {
            int remindre = num % 10;
            reverseNumber = reverseNumber * 10 + remindre;
        }

        System.out.println("Original number: " + num);
        System.out.println("Reversed number: " + reverseNumber);
    }
}
