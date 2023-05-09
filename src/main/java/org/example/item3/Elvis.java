package org.example.item3;

public class Elvis implements Singer {

    private static final Elvis INSTANCE = new Elvis();
    private static boolean created;
    public static Elvis getInstance() { return new Elvis(); }

    private Elvis() {
        if (created) {
            throw new UnsupportedOperationException("can't be created by constructor.");
        }
        created = true;
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
