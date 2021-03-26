    package prog.Polymorphism;

    public class PrintNumber {
        public void println(int intValue1){
            System.out.println("Println method with int datatype is called and the value is " + intValue1);
        }
        public void println(float intValue1){
            System.out.println("Println method with float datatype is called and the value is " + intValue1);
        }
        public void println(double intValue1){
            System.out.println("Println method with double datatype is called and the value is " + intValue1);
        }
        public static void main(String[] args){
            PrintNumber printNumber = new PrintNumber();
                    printNumber.println(1);
                    printNumber.println(1.1f);
                    printNumber.println(1231.12312);
        }
    }
