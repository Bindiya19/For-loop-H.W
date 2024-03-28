//Print any 10 numbers between given/user input range. For eg. Print numbers
//between 23-33
import java.util.Scanner;

public class Print_10num_Betw_Given_Range
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your start numbers :");
        int startNum = scanner.nextInt();

        System.out.println("Enter your end number ( end number must be > start number :");
        int endNum = scanner.nextInt();
        //Initialize start and end numbers to find out 10 num in between.

        int count = 0;
        {
            System.out.println("10 numbers between "+startNum+" and "+endNum+":");
        }
        // loop to find out numbers in between.

        for (int i = startNum; i<=endNum; i++)
        {

          if(count == 10)
              //if condition to find count numbers between given range.
             break;
          //break the condition until count
            count++;

        System.out.println(i);
        }
    }
}