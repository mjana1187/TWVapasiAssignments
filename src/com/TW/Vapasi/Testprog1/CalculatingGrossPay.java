package com.TW.Vapasi.Testprog1;

import java.util.Scanner;

public class CalculatingGrossPay {

    public static void main(String[] args){
        /*Algorithm to calculate grosspay
                1. Give value for per hour in constant
                2. take input of how many hours tat labour worked
                3.multiply with per hour value
                4.display o/p of gross pay*/

        double EmployeePerHourPay = 100;

        System.out.println("Enter the Number of hours the employee worked");
        Scanner sc = new Scanner(System.in);

        double NumOfHours = sc.nextDouble();
        //System.out.println("No. of hours =" + NumOfHours);
        double Grosspayemp = NumOfHours * EmployeePerHourPay;
        System.out.println("Gross pay of the employee for " + NumOfHours + " NumOfHours of work is =" +Grosspayemp);
        sc.close();
        //System.out.println("Gross pay of the employee for " +(NumOfHours) "of work is =" +(EmployeePerHourPay*NumOfHours));


    }
}
