package org.example.item50;

import java.util.*;

public class Attacks {
    public static void main(String[] args) {
        // Attack the internals of a Period instance  (Page 232)
        Date start = new Date();
        Date end = new Date();
        Period p = new Period(start, end);
        end.setYear(78);  // Modifies internals of p!
        System.out.println(p);

        // Second attack on the internals of a Period instance  (Page 233)
        start = new Date();
        end = new Date();
        p = new Period(start, end);
        p.end().setYear(78);  // Modifies internals of p!
        System.out.println(p);
    }
}