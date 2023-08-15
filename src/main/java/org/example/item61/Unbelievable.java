package org.example.item61;

public class Unbelievable {
    static Integer i;

    public static void main(String[] args) {
        if (i == 42) // NPE!!
            System.out.println("Unbelievable");
    }

//    String compoundKey = "className" + "#" + "i.next()";

    private static class CompoundKey {
        String className;
        String divider;
        long instanceId;

        public CompoundKey(String className, String divider, long instanceId) {
            this.className = className;
            this.divider = divider;
            this.instanceId = instanceId;
        }
    }
}