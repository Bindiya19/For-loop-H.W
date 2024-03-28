//Finding factorial of a number entered by user
import java.util.Scanner;

public class Finding_Factorial_Of_Number
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entrt the number.  ");
        int givenNum= scanner.nextInt();
        int factorial = 1;

        for(int i=1; i<=givenNum; i++)
        {
            factorial = factorial * i;
        }
        System.out.println("Factorial of "+givenNum+" is "+ factorial);
    }
}
