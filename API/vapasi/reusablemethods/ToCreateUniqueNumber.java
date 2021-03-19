package com.tw.vapasi.reusablemethods;

import java.util.Random;

public class ToCreateUniqueNumber {
    public static void main(String [] args){

        Random random = new Random();
        int iUniqueNumber = random.nextInt(100);
        System.out.println(iUniqueNumber);
    }
}
