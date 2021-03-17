package prog.Assignment.JavaLevel1.DataTypes;

public class ToAdd3ToAsciid {
    //This program is to print the ascii value of d+3

    public static void main(String[] args){

        char c = 'd';
        int iAsciiValue = c + 3;
        char c1 = (char) iAsciiValue;
        System.out.println("The ascii value of d + 3 is " + c1);
    }
}
