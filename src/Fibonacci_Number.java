//Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number) – limitation is n.
import java.util.Scanner;

public class Fibonacci_Number {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit (n): ");
        int n = scanner.nextInt();


        // Initialize the first two Fibonacci numbers
        int firFiboNum = 0;
        int secFiboNum = 1;

        // Print the first two Fibonacci numbers
        System.out.println(firFiboNum + " " + secFiboNum );

        // Calculate and print the subsequent Fibonacci numbers until the limit 'n'
        for (int i = 0; ; i++) {

             int next = firFiboNum + secFiboNum;
                if (next > n) {
                    break; // Break the loop if the next Fibonacci number exceeds the limit
                }
                firFiboNum = secFiboNum;
                secFiboNum = next;
                System.out.print(next +" ");

            }
        }
    }







