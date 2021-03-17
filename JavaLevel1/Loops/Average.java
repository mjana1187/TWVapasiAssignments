package prog.Assignment.JavaLevel1.Loops;

import java.util.Scanner;

public class Average {
    //Take 10 integers from keyboard using loop and print their average value on the screen.
    public static void main(String[] args) {
        calAverage();
    }
    static void calAverage() {
        System.out.println("Enter total numbers to be entered:");
        Scanner sc = new Scanner(System.in);
        int iSum = 0;
        int iNumb = 0;
        int iTotalNum = sc.nextInt();
        for (int i = 0; i < iTotalNum; i++) {
            iNumb = sc.nextInt();
            iSum = iSum+iNumb;
        }
        double dAvg = iSum / iTotalNum;
        System.out.println("The average value of  integers entered is "+dAvg);
    }
}
