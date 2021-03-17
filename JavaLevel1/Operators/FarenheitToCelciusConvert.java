package prog.Assignment.JavaLevel1.Operators;

import java.util.Scanner;

public class FarenheitToCelciusConvert {
    //This program is to convert Farenheit into Celcius
    public static void main(String[] args) {
        System.out.println("Enter a Farenheit value to convert into Celcius");
        Scanner sc=new Scanner(System.in);

        double dfarenheit = sc.nextDouble();
        double dCelcius = ((dfarenheit - 32) * 5) / 9;

        System.out.println("This converted Farenheit value " + dfarenheit +" \u2109" + " into Celcius value is "
                + dCelcius + " \u2103"+ ".");
    }
}



