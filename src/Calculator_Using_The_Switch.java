import java.util.Scanner;

//Making Calculator using the switch statement
public class Calculator_Using_The_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre your first number: ");
        int firNum = scanner.nextInt();
        System.out.println("Enter your operator: ");
        char operator=scanner.next().charAt(0);
        System.out.println("Enter your second number: ");
        int secNum = scanner.nextInt();

        double result = 0;

       switch ( operator ) {
           case '+':
               result=firNum+secNum;

                   System.out.println("Addition of "+firNum+operator+secNum+"="+result );
                break;
           case '-':
               result=firNum-secNum;
                   System.out.println("Subtraction of "+firNum+operator+secNum+"="+result);
           break;
           case  '*':
               result=firNum*secNum;
                   System.out.println("Multiplication of "+firNum+operator+secNum+"="+result);
           break;
           default:
               System.out.println("Invalid Entry.");
       }
        //System.out.println(firNum+operator+secNum+result);
    }
}