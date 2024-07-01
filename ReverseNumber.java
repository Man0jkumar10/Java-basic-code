import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("-==Revers The Number==-");
        Scanner next = new Scanner(System.in);
        System.out.print("Enter the NUmber: ");
        int num=next.nextInt();
        int temp=0;
        System.out.print("The Reverse of given number is: ");
        while (num>0)
        {
            temp=num%10;
            System.out.print(temp);
            num=num/10;
        }
    }
}