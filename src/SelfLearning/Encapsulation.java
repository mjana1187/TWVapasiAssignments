package SelfLearning;

public class Encapsulation {
    //this oops concept helps to hide the variable/data by declaring it with PRIVATE modifier,and to access it
    //we use getter and setter methods
    public static void main(String[] args) {
        EncapsExample e1 = new EncapsExample();
        e1.setValueI(7);
        e1.setValueJ("Jana");
        e1.setValueFloat(7.7f);
        System.out.println(e1.getValueI());
        System.out.println(e1.getValueJ());;
        System.out.println(e1.getValueFloat());
    }
}
class EncapsExample {
    private int i;
    private String j;
    private float aFloat;

    public void setValueI(int j)    {
        //this method is created to set value for this private variable 'private int i;
       this.i = j;
    }
    public int getValueI()  {
        //this method will get/return the value of this private variable which was set in 'setvalueI' method.
        System.out.println(i);
        return i;
    }
    public void setValueJ(String k)    {
        this.j=k;
    }
    public String getValueJ() {
        return j;
    }
    public void setValueFloat(float bFloat)    {
        this.aFloat=bFloat;
    }
    public float getValueFloat()   {
        return aFloat;
    }
}
