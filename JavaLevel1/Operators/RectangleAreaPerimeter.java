package prog.Assignment.JavaLevel1.Operators;

public class RectangleAreaPerimeter {
    //This program calculate the area and perimeter of a rectangle
    public static void main(String[] args) {

            int iLength = 5;
            int iBreadth = 7;

            int iArea = iLength * iBreadth;
            int iPerimeter = 2 * (iLength + iBreadth);

            //Print the Area and perimeter result
            System.out.println("This program is to calculate area and perimeter of a rectangle with length " + iLength +
                    " and Breadth " + iBreadth + " values are Area = " + iArea + " Perimeter = " + iPerimeter + ".");
        }
    }
