package prog.Assignment.JavaLevel1.Loops;

public class Ascii0To255 {
    public static void main(String[] args) {

        for (int i = 0; i <= 255; i++) {
            System.out.println("The ascii value of  " +  i + " is " + (char) i);
        }
    }
}