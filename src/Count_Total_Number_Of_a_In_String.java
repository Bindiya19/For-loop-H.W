import java.util.Scanner;

    public class Count_Total_Number_Of_a_In_String
    {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write any sentence. ");
        String sentence = scanner.nextLine();

        int count = 0;

        for (int i = 0; i < sentence.length(); i++)

            if (sentence.charAt(i) == 'a')
            {
                count++;
            }

        System.out.println("Total number of 'a' in the string: " + count);
    }
}
