import java.util.Scanner;

public class invoice {
    public static  void  main(String[] args){
        System.out.println("Enter the number of Shirts to order:");
        Scanner Shirts=new Scanner(System.in);
        double QuaShirt=Shirts.nextInt();
        System.out.println("Enter the number of Trousers to order:");
        Scanner Trousers=new Scanner(System.in);
        double QuaTrousers=Trousers.nextInt();
        double totalShirts=QuaShirt*300;
        double totalTrousers=QuaTrousers*700;
        double total=totalShirts+totalTrousers;
        double giamgia=0;
        double Points=0;
        if(total>3000)
        {
            giamgia=total/10;
            Points=total/100;
        }else{
            giamgia=0;
            Points=0;
        }

        System.out.println("Item      Quantity      Price    Total");
        System.out.println("-------------------------------------------");
        System.out.printf("Shirts     %.0f           300     %.2f",QuaShirt,totalShirts);
        System.out.printf("\nTrousers   %.0f           700     %.2f",QuaTrousers,totalTrousers);
        System.out.printf("\nDiscount                       %.2f",giamgia);
        System.out.println("\n-------------------------------------------");

        System.out.printf("Net Total                      %.2f",total-giamgia);
        System.out.println("\n-------------------------------------------");
        System.out.printf("Points Earnet \t %.2f",Points);
        System.out.println("\nThank you!");
    }
}
