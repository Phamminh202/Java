package ThucHanh;

import java.util.Scanner;

public class TestFlight {
    public static void main(String[] args){
        System.out.print("Enter number (number>0):");
        Scanner x=new Scanner(System.in);
        int number =x.nextInt();
        if (number>0){
            System.out.print("Enter destination:");
            Scanner y=new Scanner(System.in);
            String destination=y.next();
            Flight f1=new Flight(number,destination);
            f1.display();
        }else{
            System.out.println("Your have entered the wrong number!");
        }
    }
}
