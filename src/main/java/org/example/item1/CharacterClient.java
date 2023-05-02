package org.example.item1;

public class CharacterClient {
    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        Character c1 = new Character('h', "white", fontFactory.getFont("nanum:12"));
        Character c2 = new Character('e', "white", fontFactory.getFont("nanum:12"));
        Character c3 = new Character('l', "white", fontFactory.getFont("nanum:12"));

        System.out.println(c1.getFont().equals(c2.getFont()));
        System.out.println(c1.getFont().equals(c3.getFont()));
        System.out.println(c2.getFont().equals(c3.getFont()));
    }
}
