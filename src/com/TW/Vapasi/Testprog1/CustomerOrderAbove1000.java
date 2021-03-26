package com.TW.Vapasi.Testprog1;

import java.util.Scanner;

public class CustomerOrderAbove1000 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of purchased amount:");
        double CustomerAmount = sc.nextDouble();

        if (CustomerAmount >= 1000) {
            System.out.println("Dear Customer you are eligible for a GOLD Membership");
        }
            else{
                System.out.println("Dear Customer - You are falling short " +
                        "to reach GOLD membership by Rs. " + (1000-CustomerAmount));
                }

        }
    }

