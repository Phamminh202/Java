import java.util.Scanner;

public class bt242021 {
    public static void main(String[] args){

        System.out.println("Enter marks obtained in Maths: ");
        Scanner mat1= new Scanner(System.in);
        int math1=mat1.nextInt();
        System.out.println("Enter marks obtained in Science: ");
        Scanner sci1= new Scanner(System.in);
        int science1=sci1.nextInt();
        System.out.println("Enter marks obtained in English: ");
        Scanner eng1= new Scanner(System.in);
        int english1=eng1.nextInt();

        System.out.println("\nEnter marks obtained in Maths: ");
        Scanner mat2= new Scanner(System.in);
        int math2=mat2.nextInt();
        System.out.println("Enter marks obtained in Science: ");
        Scanner sci2= new Scanner(System.in);
        int science2=sci2.nextInt();
        System.out.println("Enter marks obtained in English: ");
        Scanner eng2= new Scanner(System.in);
        int english2=eng2.nextInt();

        System.out.println("Marks of  Stu1:");
        System.out.println("Maths = "+ math1);
        System.out.println("Science = "+science1);
        System.out.println("English = "+english1);

        System.out.println("\nMarks of  Stu2:");
        System.out.println("Maths = "+ math2);
        System.out.println("Science = "+science2);
        System.out.println("English = "+english2);

        double total1=math1+science1+english1;
        System.out.printf("Total marks scored by Stu1 = %f",total1);
        double pen1=total1/3;
        System.out.println("\nPercentage = "+pen1+"%");

        double total2=math2+science2+english2;
        System.out.println("\nTotal marks scored by Stu2 = "+total2+"%");
        double pen2=total2/3;
        System.out.printf("\nPercentage = %.0f",pen2);

        int Scholarship;
        if(pen1>75)
        {
            Scholarship=20000;
        }else if(pen1>60 && pen1<75)
        {
            Scholarship=10000;
        }
        else{
            Scholarship=0;
        }
        System.out.printf("\nScholarship Amount for Stu1 = $%d",Scholarship);
    }
}
