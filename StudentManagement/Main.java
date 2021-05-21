package StudentManagement;

import java.sql.*;
import java.util.Scanner;
public class Main {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args){
        try(
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement","root","");
            Statement stmt=conn.createStatement();
        ){
            boolean quit=false;
            printStudent();
            while(!quit){
                System.out.println("Enter action: (4 to show available action)");
                int action=Integer.parseInt(scanner.nextLine());
                scanner.nextLine();
                switch (action){
                    case 1:
                        addStudent();
                    case 4:
                        System.out.println("\nExit.");
                        quit=true;
                        break;
                }
            }

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    private static void printStudent(){
        System.out.println("\n Available action\npress");
        System.out.println("1-Add student records\n"
                +"2-Display student records\n"
                +"3-Save\n"
                +"4-Exit");
        System.out.println("Chose your action");
    }
    private static void addStudent(){
        System.out.println("Enter student id:");
        String id=scanner.nextLine();
        System.out.println("Enter student name:");
        String name=scanner.nextLine();
        System.out.println("Enter student address:");
        String address=scanner.nextLine();
        System.out.println("Enter student phone:");
        Integer phone=scanner.nextInt();
        Student newStudent=new Student(id,name,address,phone);
        if (StudentList.addNewContact(newStudent)){
            System.out.println("New Student:" +
                    "\nId= "+id+
                    "\nName= "+name+
                    "\nAddress= "+address+
                    "\nPhone= "+phone);
        }else{
            System.out.println();
        }

    }
}
