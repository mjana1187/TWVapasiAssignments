package prog.Assignment.JavaLevel1.Loops;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        System.out.println("Enter 2 Numbers to find GCD/HCF : ");
        Scanner sc = new Scanner(System.in);
        int iNum1 = sc.nextInt();
        int iNum2 = sc.nextInt();
        while (iNum1 != iNum2)
        {
            if (iNum1 > iNum2)
                iNum1 = iNum1 - iNum2;
             else
                iNum2 = iNum2 - iNum1;
        }
        System.out.println("The GCD/HCM  is " +iNum2 +".");
    }
}
