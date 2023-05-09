package org.example.item3;

import java.lang.reflect.Constructor;

public class EnumElvisReflection {
    public static void main(String[] args) {
        try {
            Constructor<EnumElvis> declaredConstructor = EnumElvis.class.getDeclaredConstructor();
            System.out.println(declaredConstructor);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
