package com.TW.Vapasi.Testprog1;

import java.util.Scanner;

public class IfElseExamples {

    public static void main (String[] args)
    {
        /*//System.out.println("Enter the Number to Check);
        Scanner sc=new Scanner(System.in);

        double CheckNum = sc.nextDouble();
        if (CheckNum > 0 ) {
            System.out.println("The number :" + CheckNum + " is positive");
        }
        else
            {
                System.out.println("The number :" + CheckNum + " is negative");
            }
        sc.close();*/
        //System.out.println("Enter the Number to Check);
        Scanner sc=new Scanner(System.in);

        double CheckNum = sc.nextDouble();
        if (CheckNum > 70 ) {
            System.out.println("The number :" + CheckNum + " is greater than 70");
        }
        else
        {
            System.out.println("The number :" + CheckNum + " is not greater than 70");
        }
        sc.close();
    }
    }

