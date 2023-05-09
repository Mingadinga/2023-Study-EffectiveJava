package org.example.item3;

import java.util.function.Supplier;

public class ConcertBySinger {
    public void start(Supplier<Singer> singerSupplier) {
        Singer singer = singerSupplier.get();
        singer.sing();
    }

    public static void main(String[] args) {
        ConcertBySinger concert = new ConcertBySinger();
        concert.start(Elvis::getInstance);
    }
}
