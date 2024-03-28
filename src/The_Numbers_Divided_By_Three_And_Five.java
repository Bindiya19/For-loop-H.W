import java.util.Scanner;

//WAP to print the numbers between 1 to 100 which can be divided by 3 and 5
//separately
public class The_Numbers_Divided_By_Three_And_Five
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number between 1 to 100, to print thr divide by 3 and 5. ");
        int number =scanner.nextInt();

        for (int i = 1; i <+number; i++)//

            if(i % 3 == 0 && i % 5==0)
        {
            System.out.println(i);
        }

    }
}
