package bai10;

class bai10vd7 extends bai10vd6{
    String shift;
    /**
     * Parameterized constructor to initialize the variable
     *
     * @param  id a String variable storing employee id
     * @param name a String variable storing employee name
     * @param sal an integer variable storing employee salary
     * @param shift a String variable storing shift information
     */
    public bai10vd7(String id,String name,int sal,String shift){
        super(id, name, sal);
        this.shift=shift;
    }
    /**
     * Overridden method to display employee details
     *
     * @return void
     */
    @Override
    public void displayDetails(){
        calcCommission(12);
        super.displayDetails();
        System.out.println("Working shift:"+shift);
    }
}
/**
 * Modified EmployeeDetails.java
 */
public class EmployeeDetails(){
    /**
     * @param args the command line arguments
     */
    public static void main(String[]args){
        bai10vd6 objEmp=new bai10vd6("E001","Maria Nemeth",40000);
        objEmp.calcCommission(20000F);
        objEmp.displayDetails();
        System.out.println("-------------------");
        bai10vd6 objEmp1=new bai10vd7("E002","Rob Smith",3000,"Day");
        objEmp1.calcCommission(20000F);
    }
}
