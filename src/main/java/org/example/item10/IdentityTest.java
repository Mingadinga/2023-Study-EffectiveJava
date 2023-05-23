package org.example.item10;

// String constant pool
// 물리적 동치성과 논리적 동치성 확인
public class IdentityTest {
    public static void main(String[] args) {
        String s1 = "cat";
        String s2 = "cat";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
