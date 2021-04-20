package TamGiac;

import TamGiac.Point;
import TamGiac.tamgiac;

public class TestTamGiac {
    public static void main(String[] args) {
        Point p1 = new Point(2,10);
        Point p2 = new Point(6,1);
        Point p3 = new Point(-4,5);
        tamgiac Test = new tamgiac(p1,p2,p3);
        if(((Test.getAB()+Test.getBC())>Test.getAC())&&((Test.getAB()+Test.getAC())>Test.getBC())&&((Test.getAC()+Test.getBC())>Test.getAB())){
            System.out.println("A=("+p1.getX()+","+p1.getY()+")");
            System.out.println("B=("+p2.getX()+","+p2.getY()+")");
            System.out.println("C=("+p3.getX()+","+p3.getY()+")");
            System.out.printf("Chu vi: %.2f\n",Test.getChuvi());
            System.out.println("ABC la 1 tam giac");
        }else {

            System.out.println("ABC khong la1 tam giac.\nHay thu lai.");
        }
    }
}
