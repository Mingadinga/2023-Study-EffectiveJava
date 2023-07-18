package org.example.item39.ExceptionRepeatableTest;

import java.util.ArrayList;
import java.util.List;

public class TestSample {
    @ExceptionTest(IndexOutOfBoundsException.class)
    @ExceptionTest(NullPointerException.class)
    public static void doublyBad() {
        List<String> list = new ArrayList<>();
        list.addAll(5, null);
    }
}
