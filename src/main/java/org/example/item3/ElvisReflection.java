package org.example.item3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ElvisReflection {
    public static void main(String[] args) {
        try {
            Constructor<Elvis> defaultConstructor = Elvis.class.getDeclaredConstructor();
            defaultConstructor.setAccessible(true); // private 접근 가능
            Elvis e1 = defaultConstructor.newInstance();
            Elvis e2 = defaultConstructor.newInstance();
            System.out.println(e1 == e2);
        } catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
