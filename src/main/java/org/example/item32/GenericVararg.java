package org.example.item32;

import java.util.List;

public class GenericVararg {
    static void dangerous(List<String>... stringLists) {
        List<Integer> intList = List.of(42);
        Object[] objects = stringLists;     // stringLists의 타입은 List<String>[]. 배열은 공변이 허용되므로 이렇게 대입 가능.
        objects[0] = intList;               // Heap pollution 발생!
        String s = stringLists[0].get(0);   // ClassCastException - Integer를 String으로 바꿀 수 없다
    }

    public static void main(String[] args) {
        dangerous(List.of("There", "be", "dragons"));
    }
}
