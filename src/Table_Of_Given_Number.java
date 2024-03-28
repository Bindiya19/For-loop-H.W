//10.Java Program to Print Multiplication Table for any Number.
import java.util.Scanner;

public class Table_Of_Given_Number {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num =scanner.nextInt();

        for ( int i=1; i<=12;i++){
            //loop for multipication any number.

            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}
