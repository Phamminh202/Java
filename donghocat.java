import java.util.Scanner;

public class donghocat {
    public static void main(String[] args){
        int i=0;
        int j=0;
        int k=0;
        int l=0;
        System.out.println("Nhap so dong cua 1 nua:");
        Scanner x=new Scanner(System.in);
        int sodong=x.nextInt();

//        Phần đầu
        System.out.printf("+");
        for (i=1;i<=2*sodong;i++){
            System.out.printf("-");
        }
        System.out.println("+");

//        Nửa trên
        for (i=1;i<=sodong;i++){
            System.out.printf("|");

            for(j=1;j<i;j++){
                System.out.printf(" ");
            }
            System.out.printf("\\");
            for (k=2*sodong-1;k>2*i-1;k--){
                System.out.printf(".");
            }
            System.out.printf("/");
            for(j=1;j<i;j++){
                System.out.printf(" ");
            }
            System.out.println("|");
        }

//        Nửa dưới
        for (i=1;i<=sodong;i++){
            System.out.printf("|");

            for(j=sodong;j>i;j--){
                System.out.printf(" ");
            }
            System.out.printf("/");
            for (k=2*i+1;k>sodong;k--){
                System.out.printf(".");
            }
            System.out.printf("\\");
            for(j=sodong;j>i;j--){
                System.out.printf(" ");
            }
            System.out.println("|");
        }

//        Phần cuối
        System.out.printf("+");
        for (i=1;i<=2*sodong;i++){
            System.out.printf("-");
        }
        System.out.println("+");
    }
}
