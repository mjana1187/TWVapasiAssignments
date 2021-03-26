package com.TW.Vapasi.Testprog1;

import java.util.Scanner;

public class CentimeterToInchConv {

    public static void main(String[] args){
        /*Algorithm to convert cms to inches
                1. take input in cms
                2. multiply it with 1cm value of inch
                3. display output*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input in Centimeters to  get Inch conversion");
        double ValueToConvert = sc.nextDouble();
        double InchValue = 0.394 * ValueToConvert;
        System.out.println("The converted inch value for " + ValueToConvert + " is = " + InchValue);


    }
}
