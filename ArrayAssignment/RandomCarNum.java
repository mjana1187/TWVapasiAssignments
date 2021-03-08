package prog.ArrayAssignment;
import java.util.Random;
import java.util.Scanner;

public class RandomCarNum {
    //Write a program to print random & unique car digit number
    public static void main(String[] args) {
        ranNum();
    }

    static void ranNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Total number of unique car numbers to be generated");
        int intCarNumCount = sc.nextInt();
        Random RandomCarNum = new Random();
        int[] intCarNumRan = new int[intCarNumCount];
        for (int i = 0; i < intCarNumCount; i++) {
            intCarNumRan[i] = RandomCarNum.nextInt(9999);
            String CarNumFormat = "MH" + intCarNumRan[i];
            System.out.println("Car numbers are : " + CarNumFormat);
        }
    }
}