package prog.Assignment.JavaLevel1.ConditionalStatements;

import java.util.Scanner;

//Take values of length and breadth of a rectangle from user and check if it is square or not.
public class ConditionalStatements {
    public static void main(String[] args) {
        System.out.println("Enter the values of length and breadth");
        Scanner sc=new Scanner(System.in);
        int iLength = sc.nextInt();
        int iBreadth = sc.nextInt();
        double dsqrtLength = Math.sqrt(iLength);
        double dsqrtBreadth = Math.sqrt(iBreadth);
        System.out.println(dsqrtBreadth);
        System.out.println(dsqrtLength);
        sc.close();
    }
}
//Take two int values from user and print greatest amongthem.
class ToFindGreatestNum{
    public static void main(String[]args){
        System.out.println("Enter the values");
        Scanner sc=new Scanner(System.in);
        int iValue1 = sc.nextInt();
        int iValue2 = sc.nextInt();
        if (iValue1 > iValue2){
            System.out.println("The Greatest value is "+ iValue1);
        }else {
            System.out.println("The Greatest value is "+ iValue2);
        }
        sc.close();
    }
}
//A shop will give discount of 10% if the cost of purchasedquantity is more than 1000.
// Ask user for quantitySuppose, one unit will cost 100.Judge and print total cost for user.
class Discount10pert{
    public static void main(String[]args){
        System.out.println("Enter the value of purchasedquantity: ");
        Scanner sc=new Scanner(System.in);
        int iQuantityReq = sc.nextInt();
        int iPricePerQuan = 100;
        int iPurchaseQuant = iQuantityReq*iPricePerQuan;
        if (iPurchaseQuant > 1000){
            int iDiscPrice = ((iPurchaseQuant*10)/100);
            System.out.println("10% Discounted price is " + iDiscPrice+", Total cost for user is "+ (1000-iDiscPrice));
        }else {
            System.out.println("Customer needs to purchase for Rs. " + (1000-iPurchaseQuant)+" more to get 10% discount");
        }
        sc.close();
    }
}
//A company decided to give bonus of 5% to employeeif his/her year of service is more than 5 years.
// Ask user for their salary and year of service andprint the net bonus amount.
class Bonus5{
    public static void main(String[] args) {
        System.out.println("Enter Salary: ");
        Scanner sc = new Scanner(System.in);
        int iSalary = sc.nextInt();
        int iNumYearServ = sc.nextInt();
        if (iNumYearServ > 5) {
            int iBonus = ((iSalary * 5) / 100);
            System.out.println("The Employee bonus is " + (iSalary+iBonus));
        } else {
            System.out.println("Employee is not eligible for bonus");
        }
        sc.close();
    }
}
//A school has following rules for grading system:
//a. Below 25 - F b. 25 to 45 - E c. 45 to 50 - D d. 50 to 60 - C e. 60 to 80 - B f.
// Above 80 - A Ask user to enter marks and print the corresponding grade.
class GradSys{
    public static void main(String[] args) {
        System.out.println("Enter Marks: ");
        Scanner sc = new Scanner(System.in);
        double dMarks = sc.nextDouble();
       if (dMarks >=80) {
            System.out.println("The Student grade is A");
        } else if (dMarks >=60 && dMarks <80) {
            System.out.println("The Student grade is B");
        } else if (dMarks >=50 && dMarks <60) {
           System.out.println("The Student grade is C");
       } else if (dMarks >= 45 && dMarks <50) {
           System.out.println("The Student grade is D");
       } else if (dMarks >=25 && dMarks <45) {
           System.out.println("The Student grade is E");
       } else if (dMarks <25) {
           System.out.println("The Student grade is F");
       }
        sc.close();
    }
}
//Take input of age of 3 people by user and determineoldest and youngest among them
class ToFindOldYoung{
    public static void main(String[] args) {
        System.out.println("Enter Ages: ");
        Scanner sc = new Scanner(System.in);
        double dUser1 = sc.nextDouble();
        double dUser2 = sc.nextDouble();
        double dUser3 = sc.nextDouble();
        if (dUser1 > dUser2 && dUser1>dUser3){
            System.out.println("User 1 is oldest among 3 users: " + dUser1);
            } else if (dUser2 >dUser3 && dUser2>dUser1){
            System.out.println("User 2 is oldest among 3 users: " + dUser2);
            } else if (dUser3>dUser1 && dUser3>dUser2){
            System.out.println("User 3 is oldest among 3 users: " + dUser3);
            } else if (dUser1<dUser2 && dUser1<dUser3){
            System.out.println("User 1 is Youngest among 3 users: " + dUser1);
            } else if (dUser2<dUser3 && dUser2<dUser1) {
            System.out.println("User 2 is Youngest among 3 users: " + dUser2);
            } else if (dUser3<dUser1 && dUser3<dUser2) {
            System.out.println("User 3 is Youngest among 3 users: " + dUser3);
            }
        sc.close();
    }
}
//Write a program to print absolute vlaue of a numberentered by user.
class AbsoluteNum{
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        double dInput = sc.nextDouble();
        System.out.println("The absolute value of "+dInput+" is "+Math.abs(dInput));
        sc.close();
    }
}
class EligibleForExam {
    public static void main(String[] args) {
        System.out.println("Total Number of classes Held: ");
        Scanner sc = new Scanner(System.in);
        int iClassH = sc.nextInt();
        System.out.println("Total Number of classes Attended: ");
        int iClassA = sc.nextInt();
        int iEligible = (iClassA *100)/ iClassH;
        //System.out.println(iEligible);
        System.out.println("Percentage of classes attended by the user is "+iEligible);
        if (iEligible > 75) {
            System.out.println("The student is allowed to sit in exam");
        } else {
            System.out.println("The student is not allowed to sit in exam");
        }
        sc.close();
    }
}
class EligibleForExamMed {
    public static void main(String[] args) {
        System.out.println("Total Number of classes Held: ");
        Scanner sc = new Scanner(System.in);
        int iClassH = sc.nextInt();
        System.out.println("Total Number of classes Attended: ");
        int iClassA = sc.nextInt();
        System.out.println("Enter medical certificate Y/N : ");
        String sMedCert = sc.next();
        double iEligible = (iClassA* 100)/iClassH;
        System.out.println("Percentage of classes attended by the user is " +iEligible+"%");
        if (iEligible < 75 && sMedCert.equalsIgnoreCase("y"))
            System.out.println("The student is  allowed to sit in exam");
        else if (iEligible < 75 && sMedCert.equalsIgnoreCase("n"))
        System.out.println("The student is not allowed to sit in exam");
        else
        System.out.println("The student is  allowed to sit in exam");
        sc.close();
    }
}
class ExpValidation{
    public static void main(String[] args) {
        int x=2;
        int y=5;
        int z=0;

        System.out.println("The value of x ==2 is "+ (x==2));//true
        System.out.println("The value of x!=5 is "+ (x!=5));//true
        System.out.println("The value of (x!=5)&&(y>+5) is "+ ((x!=5)&&(y>=5)));//true
        System.out.println("The value of (z!=0)||(x==2) is "+ ((z!=0)||(x==2)));//true
        System.out.println("The value of y<10 is "+ !(y<10));//false

    }
}
//Write a program to check whether a entered characteris lowercase ( a to z ) or uppercase ( A to Z )
class ToChkLowerUpper{
    public static void main(String[] args) {
        System.out.println("Enter character:");
        Scanner sc = new Scanner(System.in);
        char cCheck = sc.next().charAt(0);
        if (cCheck>='A' && cCheck<='Z')
            System.out.println("The given letter is in uppercase");
        else if(cCheck>='a' && cCheck<= 'z')
            System.out.println("The given letter is in uppercase");
        else
            System.out.println("Please enter a character from a-z or A-Z");
        sc.close();
    }
}

