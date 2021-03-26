package prog.Assignment.JavaLevel1.Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int iFactorial = 1;
        System.out.println("Enter a number to calculate its factorial");
        Scanner sc = new Scanner(System.in);
        int iNum = sc.nextInt();
        for (int i =1;i<=iNum;i++){
           iFactorial = iFactorial*i;
        }
        System.out.println("The factorial of the number " +iNum+ " is " + iFactorial);
    }
}
