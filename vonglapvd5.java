import java.util.Scanner;

public class vonglapvd5 {
    public static void main(String[] args){
        String inStr;
        int inStren;
        Scanner in=new Scanner(System.in);

        System.out.print("Enter a String: ");
        inStr=in.next();
        inStren=inStr.length();

        System.out.print("The reverse is: ");
        for (int inCharIdx=inStren-1;inCharIdx>=0;inCharIdx--){
            System.out.print(inStr.charAt(inCharIdx));
        }
        System.out.println();
        in.close();
    }
}
