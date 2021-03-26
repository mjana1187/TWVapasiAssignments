package prog.ArrayAssignment;

public class Sample {
        public static int getLargest(int[] iStudGradeArr) {
            int temp;
            //sort the array
            for (int i = 0; i < iStudGradeArr.length; i++) {
                for (int j = i + 1; j < iStudGradeArr.length; j++) {
                    if (iStudGradeArr[i] == iStudGradeArr[j]) {
                        System.out.println(iStudGradeArr[i]);
                        temp = iStudGradeArr[i];
                        System.out.println(temp);
                        iStudGradeArr[i] = iStudGradeArr[j];
                        System.out.println(iStudGradeArr[j]);
                        System.out.println(iStudGradeArr[i]);
                        iStudGradeArr[j] = temp;
                        System.out.println(temp);
                    }
                }
            }
            //return largest element
            return iStudGradeArr[iStudGradeArr.length - 1];
        }
        public static void main(String args[]) {
            int iStudGradeArr[] = { 48, 50, 89, 90 };
            System.out.print("Largest: " + getLargest(iStudGradeArr));
        }
    }
