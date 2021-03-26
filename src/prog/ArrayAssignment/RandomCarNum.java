package prog.ArrayAssignment;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomCarNum {
    //Write a program to print random & unique car digit number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Total number of unique car numbers to be generated");
        int intCarNumCount = sc.nextInt();
        int iTempNum;
        Random RandomCarNum = new Random();
        int[] intCarNumRan = new int[intCarNumCount];

        for (int i = 0; i < intCarNumCount; i++) {
            iTempNum = RandomCarNum.nextInt(9999);
            /*if (!intCarNumRan.equals(iTempNum))
                intCarNumRan[i] = iTempNum;
            System.out.println("The car numbers generated are " + "MH" + intCarNumRan[i]);*/
            boolean noDuplicate = Arrays.asList(intCarNumRan)
                    .contains(iTempNum);
            if(!noDuplicate) {
                intCarNumRan[i] = iTempNum;
                System.out.println("The car numbers generated are " + "MH" + intCarNumRan[i]);
            }
        }
    }
}