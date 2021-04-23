package Casting;

import Casting.B;

public class C extends B {
    public C(){
        super();
        System.out.println("C");
    }

    @Override
    public String toString() {
        return "This is C";
    }
}
