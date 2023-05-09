package org.example.item3;

public enum EnumElvis implements IElvis {
    INSTANCE;

    public void leaveTheBuilding() {
        System.out.println("going out");
    }

    @Override
    public void sing() {
        System.out.println("EnumElvis is singing");
    }

    public static void main(String[] args) {
        EnumElvis elvis = EnumElvis.INSTANCE;
        elvis.leaveTheBuilding();
    }
}
