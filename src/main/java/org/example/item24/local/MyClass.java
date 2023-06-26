package org.example.item24.local;

public class MyClass {

    private int number = 10;

    void doSomething() {
        class LocalClass {
            private void printNumber() {
                System.out.println(number);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printNumber();
    }

}
