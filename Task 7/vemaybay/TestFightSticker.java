package vemaybay;

import java.util.Scanner;

public class TestFightSticker {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter departure date (dd mm yy)");
        byte day = scan.nextByte();
        byte month = scan.nextByte();
        short year = scan.nextShort();
        Date d1 = new Date(day,month,year);
        System.out.println(d1);

        System.out.println("Enter departure time (hh mm)");
        byte hours = scan.nextByte();
        byte minutes = scan.nextByte();
        Time t1 = new Time(hours,minutes);
        System.out.println(t1);

        System.out.println("Enter the type of cabin:");
        System.out.println("1. Business");
        System.out.println("2. First");
        System.out.println("3. Economy");
        byte typeOfCabin = scan.nextByte();
        System.out.println("Enter the number of tickets:");
        byte noOfTicket = scan.nextByte();
        FightTicket f1 = new FightTicket(d1,t1,noOfTicket,typeOfCabin);
            f1.displayTicketInformation();

    }
}
