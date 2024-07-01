import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        System.out.println("Case checking Upper or Lower");
        Scanner next = new Scanner(System.in);
        System.out.print("Enter the String: ");
        char ch=next.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z'){
            System.out.println(ch+" - is Lower case");
        }else {
            System.out.println(ch+" - is Upper case");
        }
    }
}