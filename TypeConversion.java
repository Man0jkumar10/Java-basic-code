//des:-
//double > float > long > int > short > byte
//byte : stores -128 to 127 and size 1 byte
//short : stores -32768  to 32767 and size 2 bytes
//int : size 4 bytes
//long : size 8 bytes
//float : 4 bytes and holds 6 to 7 decimal digits
//double : 8 bytes and holds 15 decimal digits
import java.util.Scanner;
public class TypeConversion
{
    public static void main(String[] args) {
        Scanner next = new Scanner(System.in);

        int i=10;
        System.out.println("int: "+i);

        float f = i;
        System.out.println("int to float: "+f);

        long l=i;
        System.out.println("int to long: "+l);

        float f1=l;
        System.out.println("long to float: "+f1);

        double d=f;
        System.out.println("float to double: "+d);

        char c= 'A';
        System.out.println("char: "+c);

        int ii=c;
        System.out.println("char to int: "+ii);

        float ff=c;
        System.out.println("char to float: "+ff);

        double dd=c;
        System.out.println("char to double: "+dd);

        long ll=c;
        System.out.println("char to long: "+ll);

        String str="manojkumar";
        System.out.println("string: "+str);

        byte b=127;
        System.out.println("byte: "+b);
    }
}