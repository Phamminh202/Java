package ThucHanh;

import ThucHanh.Bank;

import java.util.Scanner;

public class TestBank {
    public static void main(String[] args){
        System.out.print("Enter your balance:");
        Scanner x=new Scanner(System.in);
        double balance=x.nextDouble();
        Bank b1=new Bank(balance);
        b1.calculateInternet();
        System.out.println("Rate is:"+b1.getRate());
        System.out.println(b1);
    }
}
