package prog.Assignment.JavaLevel1.Loops;

import java.util.Scanner;

public class MutiplicationTables {
    public static void main(String[] args) {
        System.out.println("Enter any number from (24,50,29):");
        Scanner sc = new Scanner(System.in);
        int iNum = sc.nextInt();
            System.out.println("Multiplication table for "+iNum);
            for (int i = 1;i<=10;i++){
                //System.out.println("24 * "+ i +" = "+(iNum*i));
                System.out.println(iNum + " * " + i + " = "+(iNum*i));
            }
        }
    }

