package bai10;

class bai10vd6 {
    String empTD;
    String empName;
    int salary;
    float commission;

    /**
     * Parameterized constructor to initialize the variable
     *
     * @param  id a String variable storing employee id
     * @param name a String variable storing employee name
     * @param sal an integer variable storing employee salary
     *
     */

    public bai10vd6(String id,String name,int sal){
        empTD=id;
        empName=name;
        salary=sal;
    }
    /**
     * Calculates commission based on sales value
     * @param sales a float variable storing sales value
     *
     * @return void
     */

    public void calcCommission(float sales){
        if (sales>10000)
            commission=salary*20/100;
        else
            commission=0;
    }
    /**
     * Overloaded method.Calculates commission based on overtime
     * @param overtime an integer variable storing overtime hours
     *
     * @return void
     */

    public void calCommission(int overtime){
        if (overtime>8)
            commission=salary/30;
        else
            commission=0;
    }
    /**
     * Display employee details
     *
     * @return void
     */

    public void displayDetails(){
        System.out.println("Employee ID:"+empTD);
        System.out.println("Employee Name:"+empName);
        System.out.println("Salary:"+salary);
        System.out.println("Commission:"+commission);
    }
}
/**
 * Define the EmployeeDetails.java class
 */
public class EmployeeDetails(){
    /**
     * @param args the command line arguments
     */
    public static void main(String[]args){
        bai10vd6 objEmp=new bai10vd6("E001","Maria Nemeth",40000);
        objEmp.calcCommission(20000F);
        objEmp.displayDetails();
    }
}
