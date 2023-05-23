package org.example.item10.inheritance;

import org.example.item10.composition.ColorPoint;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

// Test program that uses CounterPoint as Point
public class CounterPointTest {
    // Initialize unitCircle to contain all Points on the unit circle  (Page 43)
    private static final Set<Point> unitCircle = Set.of(
            new Point( 1,  0), new Point( 0,  1),
            new Point(-1,  0), new Point( 0, -1));

    // 원 안에 포함되는지 쿼리
    public static boolean onUnitCircle(Point p) {
        return unitCircle.contains(p);
    }

    public static void main(String[] args) throws MalformedURLException {
        Point p1 = new Point(1,  0);
        Point p2 = new ColorPoint(1,  0, Color.BLUE).asPoint();

        // Prints true
        System.out.println(onUnitCircle(p1));

        // Prints true
        System.out.println(onUnitCircle(p2));

        URL google1 = new URL("https", "about.google", "/products/");
        URL google2 = new URL("https", "about.google", "/products/");
        System.out.println(google1.equals(google2));
    }
}
