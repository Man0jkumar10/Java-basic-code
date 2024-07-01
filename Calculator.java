//Basic calculator
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("--===Calculator===--\n (press x or X in operator to Exit the Mode)");
        Scanner next = new Scanner(System.in);

       while (true)
       {
           System.out.print("Enter the Operator: ");
           char op = next.next().charAt(0);

           if (op == 'x' || op == 'X')
           {
               return;
           } else if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

               System.out.print("Enter num1: ");
               int a = next.nextInt();
               System.out.print("Enter num2: ");
               int b = next.nextInt();

               if (op == '+')
               {
                   System.out.println("sum is: "+(a+b));
               } else if (op == '-') {
                   System.out.println("Subtraction is: "+(a-b));
               } else if (op == '*') {
                   System.out.println("Multiplication is: "+(a*b));
               } else if (op == '/') {
                   if (b!=0){
                       System.out.println("Division is: "+(a/b));
                   }else {
                       System.out.println("--Zero cant be divide--");
                   }
               }else {
                   System.out.println("Modulus is: "+(a%b));
               }
               System.out.println("\n");
           } else {
               System.out.println("--Enter the correct symbol--");
           }
       }

    }
}