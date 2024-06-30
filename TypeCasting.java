//Type casting in java..
//double->float->long->int->short->byte
import java.util.Scanner;
public class TypeCasting
{
    public static void main(String[] args) {
        Scanner next = new Scanner(System.in);
        long l=545897548667L;
        int i=(int)l;
        System.out.println("long: "+l);
        System.out.println("long to int: "+i);

        short s=(short)i;
        System.out.println("int to short: "+s);

        byte b=(byte)i;
        System.out.println("int to byte: "+b);

        double d=54845.2545897452125466;
        float f=(float) d;
        System.out.println("Double: "+d);
        System.out.println("double to float: "+f);

        int i1=(int)f;
        System.out.println("float to int: "+i1);
//Get the max size of data types
        System.out.println("\nMaximum byte value: " + Byte.MAX_VALUE);
        System.out.println("Maximum Short value: " + Short.MAX_VALUE);
        System.out.println("Maximum Int value: " + Integer.MAX_VALUE);
        System.out.println("Maximum long value: " + Long.MAX_VALUE);
        System.out.println("Maximum Float value: " + Float.MAX_VALUE);
        System.out.println("Maximum Double value: " + Double.MAX_VALUE);
    }
}