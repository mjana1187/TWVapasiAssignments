package prog.Assignment.JavaLevel1;

import java.util.Scanner;

public class InputByUserPrograms {
    public static void main(String[] args) {
        //Write a program to take two integer inputs from userand print sum and product of them
        System.out.println("Enter input for value1: ");
        Scanner sc=new Scanner(System.in);
        int value1 = sc.nextInt();
        System.out.println("Enter the input for Value2: ");
        int value2 = sc.nextInt();
        System.out.println("output :- Sum  = " + (value1+value2)+ ", Product = "+(value1*value2));
    }
}
class program2{
    public static void main(String[] args) {
        //Take two integer inputs from user. First calculate the sum of two then product of two.
        // Finally, print the sum and product of both obtained results.
        System.out.println("Enter input for value1: ");
        Scanner sc=new Scanner(System.in);
        int value1 = sc.nextInt();
        System.out.println("Enter the input for Value2: ");
        int value2 = sc.nextInt();
        int sum = value1+value2;
        int prod = value1*value2;
        System.out.println("output:- Sum of input values  = " +sum+ ", " + "Product of input values = "+prod+'\n'+
                "Sum of obtained results: " +(sum+prod)+ ", "+"Product of obtained results: "+(sum*prod)+"." );
    }
    }
class program3{
    //Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.
    public static void main(String[] args) {
        System.out.println("Enter length: ");
        Scanner sc=new Scanner(System.in);
        double length = sc.nextDouble();
        System.out.println("Enter Value2: ");
        double breadth = sc.nextDouble();
        double  area = length*breadth;
        System.out.println("Area of Rectangle as calculated is " +area+" and typecast value is " +(int)area);
    }
}

