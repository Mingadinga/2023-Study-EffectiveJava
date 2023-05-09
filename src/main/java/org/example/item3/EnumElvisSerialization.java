package org.example.item3;

import java.io.*;

public class EnumElvisSerialization {

    public static void main(String[] args) {
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("elvis.obj"))) {
            out.writeObject(EnumElvis.INSTANCE);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("elvis.obj"))) {
            EnumElvis elvis = (EnumElvis) in.readObject();
            System.out.println(elvis == EnumElvis.INSTANCE); // true
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
