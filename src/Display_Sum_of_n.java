//Display Sum of n Natural Number
import java.util.Scanner;

public class Display_Sum_of_n
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you number to find sum.");
        int num = scanner.nextInt();
        int sum = 0;

        for ( int i= 0; i <= num; i++)
        {
           sum = sum + i;
        }
            {
                System.out.println("Sum of given number is :"+ sum);
            }
    }
}