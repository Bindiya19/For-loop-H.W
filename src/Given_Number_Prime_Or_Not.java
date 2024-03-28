//Program to check whether input number is prime or not
import java.util.Scanner;

public class Given_Number_Prime_Or_Not
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number to check, tne number is prime or not? ");
        int givenNumb=scanner.nextInt();
        int rem=0;

        for(int i=2;i<=givenNumb-1;i++)//
        {
            if (givenNumb % i == 0)
            {
                rem = rem + 1;
            }
        }
        if(rem==0){
            System.out.println(givenNumb+" is Prime Number.");
        }
        else {
            System.out.println(givenNumb+" is not a Prime Number.");
        }
    }

}
