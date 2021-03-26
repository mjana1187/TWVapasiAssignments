package prog.ArrayAssignment;

import java.util.Scanner;

    public class PrintDaysOfWeek {
        public static void main(String[] args) {
            String[] DaysOfWeek = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number between 1-7: ");
            int iWeekDayNum = sc.nextInt();
            if (iWeekDayNum < 0 || iWeekDayNum > 7 ) {
                System.out.println("Please enter a valid input between 1-7, as we have only 7 DAYS a WEEK");
            } else {
                System.out.println("The WeekdayName for " + iWeekDayNum + " is " + DaysOfWeek[iWeekDayNum - 1]);
            }
        }
    }
