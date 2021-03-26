package prog.Assignment.JavaLevel1.Loops;

public class PrintPattern {
    public static void main(String[] args) {
        patternA();
        patternB();
        patternC();
    }
static void patternA(){
    for (int i =0;i<4;i++){//for every outer loop inner loop execs
           for(int j =0;j<=i;j++){
               System.out.print("*");
           }
        System.out.println();
    }
}
    static void patternB(){
        int n=3;
        int j,i;
        int space = 1;

        for (j = 1; j<= n; j++)
        {
            for ( i = 1; i<= space; i++) {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j<= n - 1; j++) {
            for (i = 1; i<= space; i++) {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i<= 2 * (n - j) - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    //this program is yet to check
    static void patternC(){
        int n=3;
        for(int j =0;j<=n;j++) {
            for (int i =1;i<n;i++) {
                System.out.print("1");
                System.out.print("0");
                System.out.print("1");
                System.out.print("0");
            }
            System.out.println();
        }
    }
}

