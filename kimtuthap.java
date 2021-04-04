import java.util.Scanner;

public class kimtuthap {
    public static void main(String[] args){
        int i=0;
        int k=0;
        int j=0;
        System.out.println("Nhap so dong:");
        Scanner x=new Scanner(System.in);
        int max=x.nextInt();
        for (i=1;i<=max;i++){
            for (j=i;j<max;j++){
               System.out.printf(" ");
            }
            for (k=1;k<=(2*i-1);k++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
