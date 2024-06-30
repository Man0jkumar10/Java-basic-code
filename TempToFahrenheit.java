//Converting Temperature to Fahrenheit
//formula: temp to Fahren = (temp*9/5)/32
//formula: Fahren to temp = (Fahren*32)/
import java.util.Scanner;

public class TempToFahrenheit {
    public static void main(String[] args) {
        System.out.println("temperature to fahrenheit conversion");
        Scanner next = new Scanner(System.in);

        System.out.println("Enter the temp in c: ");
        float tempC=next.nextFloat();

        float tempF=(tempC*9/5)+32;
        System.out.println("Temp to Fahrenheit: "+tempF);

        System.out.println("-------------------");
        System.out.println("Enter the Fahrenheit in F: ");
        float tempFa=next.nextFloat();

        float tempT = (float) ((tempFa-32)/1.8);
        System.out.println("Fahrenheit in temp: "+tempT);
    }
}