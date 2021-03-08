package prog.ArrayAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] iStudGrade = new int[4];
        System.out.println("Enter Student grade: ");
        for (int i = 0;i<4;i++){
            iStudGrade[i] = sc.nextInt();
            int intGradeSum = 0;
            intGradeSum = intGradeSum + iStudGrade[i];
        }
        System.out.println("Average : " + Arrays.stream(iStudGrade).average());
        System.out.println("Highest : " + Arrays.stream(iStudGrade).max());
        System.out.println("Lowest: " + Arrays.stream(iStudGrade).min());
    }
}
