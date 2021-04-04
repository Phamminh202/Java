import java.util.Scanner;

public class hangrao {
    public static void main(String[] args){
        System.out.println("Nhap so dong:");
        Scanner x=new Scanner(System.in);
        int sodong=x.nextInt();
        int i=0;
        int j=0;
        for(i=1;i<=sodong;i++){
            for (j=0;j<=(3*sodong);j++){
                System.out.printf("|---");
            }
            System.out.printf("\n");
        }
    }
}
