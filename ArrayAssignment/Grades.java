package prog.ArrayAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        int intGradeSum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Student grades: ");
        int iNumOfGrades = sc.nextInt();
        System.out.println("Enter grades: ");
        int[] iStudGradeArr = new int[iNumOfGrades];

        for (int i = 0;i<iNumOfGrades;i++){
            iStudGradeArr[i] = sc.nextInt();
            intGradeSum = intGradeSum + iStudGradeArr[i];
        }
        Arrays.sort(iStudGradeArr);
        System.out.println(Arrays.toString(iStudGradeArr));
        double dGradeAverage = intGradeSum/iNumOfGrades;
        System.out.println("Average is "+ dGradeAverage);
        System.out.println("Highest : " + iStudGradeArr[iNumOfGrades-1]);
        System.out.println("Lowest: " + iStudGradeArr[0]);

    }
}
