package org.example.item27;

import java.util.Arrays;

public class SuppressWarnings {

    private int size;

    Object[] elements;

    public <T> T[] toArray(T[] a) {
        if (a.length < size) {
            @java.lang.SuppressWarnings("unchecked")
            T[] result = (T[]) Arrays.copyOf(elements, size, a.getClass());
            return result;
        }
        System.arraycopy(elements, 0, a, 0, size);
        if (a.length > size)
            a[size] = null;
        return a;
    }

}
