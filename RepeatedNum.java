//Finding the repeated value
import java.util.Scanner;

public class RepeatedNum {
    public static void main(String[] args) {
        Scanner next = new Scanner(System.in);

        System.out.print("Enter the big number: ");
        int num = next.nextInt();
        System.out.print("Enter the num to search: ");
        int f=next.nextInt();

        int count=0;
        int temp;
        while (num>0)
        {
            temp=num%10;
            if (f==temp)
            {
                count++;
            }
            num=num/10;
        }
        System.out.print("the repeated time on given number is: "+count);
    }
}