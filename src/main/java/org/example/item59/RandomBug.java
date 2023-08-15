package org.example.item59;

import java.util.*;

// Random number generation is hard! - Page 215
public class RandomBug {
    static Random rnd = new Random();

    static int random(int n) {
        return Math.abs(rnd.nextInt()) % n;
    }

    public static void main(String[] args) {
        // 버그1 : rnd.nextInt()가 Integer.MIN_VALUE를 반환하면 Math.abs도 Integer.MIN_VALUE를 반환
        int m = Integer.MIN_VALUE;
        System.out.println(Math.abs(m) % 10); // -8

        // 버그2 : 편향된 빈도수
        int n = 2 * (Integer.MAX_VALUE / 3);
        int low = 0;
        for (int i = 0; i < 1_000_000; i++)
            if (random(n) < n/2) low++;
        System.out.println(low); // 666_655

    }
}