package bai10;

import java.util.Locale;

public class bai10vd10 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[]args){
        bai10vd8 objShape;
        String shape;
        if (args.length==2){
            shape=args[0].toLowerCase();
            switch (shape){
                case"circle":objShape=new bai10vd9();
                    objShape.calculate(Float.parseFloat(args[1]));
                    break;
                case"rectangle":objShape=new bai10vd10();
                    objShape.calculate(Float.parseFloat(args[1]));
                    break;
            }
        }
        else{
            System.out.println("Usage: java Calculator<shape-name><value>");
        }
    }
}
