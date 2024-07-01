import java.util.Map;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner next = new Scanner(System.in);
        System.out.println("Enter the 3 numbers: ");
        int a = next.nextInt();
        int b = next.nextInt();
        int c = next.nextInt();
        System.out.println("Largest Number using 'if' condition");
        int max=a;
        if(b>max)
        {
            max=b;
        }
        if (c>max)
        {
            max=c;
        }
        System.out.println("Result 1: "+max);
        System.out.println("-----------------");
        System.out.println("Largest Number using 'Math' function");
        int max1= Math.max(c,Math.max(a,b));
        System.out.println("Result 2: "+max1);
    }
}