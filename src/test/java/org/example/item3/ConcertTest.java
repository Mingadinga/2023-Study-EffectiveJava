package org.example.item3;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ConcertTest {
    @Test
    void perform() {
        Concert concert = new Concert(new IElvis() {
            @Override
            public void leaveTheBuilding() {
                System.out.println("bye");
            }

            @Override
            public void sing() {
                System.out.println("rehearse...");
            }
        });
        concert.perform();

       assertTrue(concert.isLightsOn());
    }
}
