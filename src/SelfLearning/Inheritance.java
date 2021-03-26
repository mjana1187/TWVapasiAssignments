package SelfLearning;

public class Inheritance {
    public static void main(String[] args) {
        EmployeeId employeeId = new EmployeeId();
        employeeId.setIntEmployeeId(123);
        employeeId.getIntEmployeeId();
        System.out.println("value for intEmployeeId is :  " + employeeId.getIntEmployeeId());

        EmployeeName employeeName = new EmployeeName();
        employeeName.setStringEmployeeName("Jana");
        employeeName.getStringEmployeeName();
        employeeName.setIntEmployeeId(777);
        employeeName.getIntEmployeeId();
    }
}
    class EmployeeId    {
        private int intEmployeeId;
        public void setIntEmployeeId(int intEmployeeId) {
            this.intEmployeeId = intEmployeeId;
            System.out.println("We are inside parent class setIntEmployeeId");
        }
        public int getIntEmployeeId()   {
            System.out.println("We are inside parent class getIntEmployeeId");
            System.out.println(intEmployeeId);
            return intEmployeeId;
        }
    }
    class EmployeeName extends EmployeeId  {
        private String stringEmployeeName;
        public void setStringEmployeeName(String stringEmployeeName)    {
            this.stringEmployeeName = stringEmployeeName;
            System.out.println("We are inside child class setStringEmployeeName");
        }
        public String getStringEmployeeName() {
            System.out.println("We are inside child class getStringEmployeeName");
            System.out.println("value for stringEmployeeName is :  " + stringEmployeeName);
            return stringEmployeeName;
        }
       /* @Override
        public void setIntEmployeeId(int intEmployeeId) {
            super.setIntEmployeeId(intEmployeeId);
        }

        @Override
        public int getIntEmployeeId() {
            return super.getIntEmployeeId();
        }*/
    }
    class EmployeeDetails extends EmployeeName{
        @Override
        public int getIntEmployeeId() {
            return super.getIntEmployeeId();
        }
    }

