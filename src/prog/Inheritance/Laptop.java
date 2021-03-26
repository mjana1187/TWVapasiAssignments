package prog.Inheritance;

public class Laptop {
     public final String sLname;
     public final int iLprice;
     public final String sLprocessor;
     public final int iLram;
     public final int iLhdd;

    public Laptop(String sLname, int iLprice, String sLprocessor, int iLram, int iLhdd) {
        this.sLname = sLname;
        this.iLprice = iLprice;
        this.sLprocessor = sLprocessor;
        this.iLram = iLram;
        this.iLhdd = iLhdd;
    }
    public void printFormat(){
        String newline = System.lineSeparator();
        System.out.println("Name:   " +sLname+newline+ "Price:   $" +iLprice+newline+"Processor:   "
                +sLprocessor+newline+ "Ram:   "+iLram+ "GB"+newline+ "HDD:   "+iLhdd+"TB"+newline);
    }
}
    class LaptopPrint extends Laptop{
        public LaptopPrint(String sLname, int iLprice, String sLprocessor, int iLram, int iLhdd) {
            super(sLname, iLprice, sLprocessor, iLram, iLhdd);
        }
        public static void main(String[] args) {
            Laptop lt1 = new Laptop("Lenovo",1000,"i3",2,500);
            lt1.printFormat();
            Laptop lt2 = new Laptop("Dell",1500,"i5",4,1);
            lt2.printFormat();
            Laptop lt3 = new Laptop("Sony",2000,"i9",8,1);
            lt3.printFormat();
        }
    }