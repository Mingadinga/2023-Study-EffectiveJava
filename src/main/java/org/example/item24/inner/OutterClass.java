package org.example.item24.inner;

public class OutterClass {

    private int number = 10;

    void printNumber() {
        InnerClass innerClass = new InnerClass();
        innerClass.doSomething();
    }

    private class InnerClass {
        void doSomething() {
//            정규화된 this
//            OutterClass.this.printNumber();
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        InnerClass innerClass = new OutterClass().new InnerClass();
        innerClass.doSomething();
    }

}
