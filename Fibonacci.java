import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner next = new Scanner(System.in);

        System.out.println("-==Finding the Fibonacci Numbers==-");
        System.out.print("Enter the Range: ");
        int num=next.nextInt();
        int n1=-1;
        int n2=1;
        int s=0;
        while (num>0)
        {
            s=n1+n2;
            n1=n2;
            n2=s;
            System.out.print(s+"\t");
            num-=1;
        }
    }
}