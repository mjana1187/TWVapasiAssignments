package prog.Assignment.JavaLevel2;

import java.util.Scanner;

public class LeapYear {
    //Write a program to check if a year is leap year ornot.
    public static void main(String[] args) {
        LeapYear();
    }
    static void LeapYear(){
        System.out.println("Enter Year to check");
        Scanner sc = new Scanner(System.in);
        int iYear = sc.nextInt();
        //double dLeap = iYear;
        if ((iYear %  4 == 0)) {
            System.out.println(iYear +" is a Leap Year");
        } else System.out.println(iYear +" is not a Leap Year");
    }
}
