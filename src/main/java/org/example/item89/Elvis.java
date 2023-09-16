package org.example.item89;

import java.io.Serializable;
import java.util.Arrays;

public class Elvis implements Serializable {
    private static final Elvis INSTANCE = new Elvis();

    private String[] favoriteSongs = { "Hound Dog", "Heartbreak Hotel" };

    public String[] getFavorites() {
        return favoriteSongs;
    }

    private Elvis() { }

    public static Elvis getInstance(){
        return INSTANCE;
    }

    private Object readResolve() {
        // 진짜 Elvis를 반환하고, 직렬화가 깨뜨린 가짜 싱글톤 Elvis는 GC에 맡김
        return INSTANCE;
    }

}
