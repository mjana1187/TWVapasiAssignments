    package prog.Polymorphism;

        public class AreaOfSquareAndRectangle {
            public void toCalculateArea(int intSide1,int intSide2){
                System.out.println("This method calculates the AREA of a rectangle with side values = "+ intSide1 + ","
                        + intSide2 + " is = " + intSide1 * intSide2);
            }
            public void toCalculateArea(int intSide){
                System.out.println("This method calculates the AREA of a square with side value " +intSide+ " is "
                        + Math.pow(intSide,2) );
            }
            public static void main(String [] args){
                AreaOfSquareAndRectangle area= new AreaOfSquareAndRectangle();
                area.toCalculateArea(2);
                area.toCalculateArea(3,3);

            }
        }
