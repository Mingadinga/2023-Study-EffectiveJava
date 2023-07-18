package org.example.item39.NoArgTest;

public class TestSample {
    @Test public static void m1() {}
    public static void m2() {}
    @Test public static void m3() {
        throw new RuntimeException("실패");
    }
}
