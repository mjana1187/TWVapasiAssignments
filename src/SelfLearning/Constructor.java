package SelfLearning;
 public class Constructor {
     public static void main(String[] args) {
         Constr cons = new Constr();  //Constructor
         Constr con = new Constr(7);  //Constructor
        }
    }
class Constr
    {
        public Constr() {
            System.out.println("inside 'Constr' ");
        }
        public Constr(int intValue) {
            System.out.println("Inside parameterized constructor" + intValue);
        }
    }