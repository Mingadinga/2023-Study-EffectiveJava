package org.example.item49;

import java.math.BigInteger;
import java.util.Objects;

public class Modifier {

    /**
     * 현재값 mod m을 반환한다. 이 메서드는
     * 항상 음이 아닌 BigInteger을 반환한다는 점에서 remainder 메서드와 다르다.
     * @param m : 계수 (양수여야 한다.)
     * @return : 현재값 mod m
     * @throws ArithmeticException : m이 0보다 작거나 같으면 발생한다.
     */

    String strategy;

    public Modifier(String strategy) {
        this.strategy = Objects.requireNonNull(strategy, "전략");
    }


    public BigInteger mod(BigInteger m) {
        if (m.signum() <= 0) throw new ArithmeticException("계수(m)는 양수여야 합니다. " + m);
        // 실제 계산 수행
        return BigInteger.ONE;
    }

    private static void sort(long a[], int offset, int length) {
        assert a != null;
        assert offset >= 0 && offset <= a.length;
        assert length >= 0 && length <= a.length - offset;
    }

    public static void main(String[] args) {
        Modifier modifier = new Modifier(null);
        modifier.mod(Objects.requireNonNull(new BigInteger("10000")));
    }
}
