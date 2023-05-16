package org.example.item3;

import java.io.Serial;
import java.io.Serializable;

public class Elvis implements Singer, Serializable {

    private static final Elvis INSTANCE = new Elvis();
    private static boolean created;
    public static Elvis getInstance() { return INSTANCE; }

    @Serial
    private Object readResolve() {
        return getInstance();
    }

    private Elvis() {
//        if (created) {
//            throw new UnsupportedOperationException("can't be created by constructor.");
//        }
//        created = true;
    }

    @Override
    public void sing() {
        System.out.println("Elvis is singing!");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.getInstance();
        elvis.sing();
    }

}
