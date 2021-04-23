package Casting;

import Casting.A;

public class B extends A {
    public B(){
        super();
        System.out.println("B");
    }

    @Override
    public String toString() {
        return "This is B";
    }
}
