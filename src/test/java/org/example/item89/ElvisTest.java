package org.example.item89;

import org.junit.Test;
import java.io.*;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class ElvisTest {

    @Test
    public void 깨지는_싱글톤() throws IOException, ClassNotFoundException {
        Elvis originalSingleton = Elvis.getInstance();
        byte[] serializedObject = getSerializedObject(originalSingleton);

        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(serializedObject);
             ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream)) {
            Elvis deserializedSingleton = (Elvis) objectInputStream.readObject();

            assertThat(deserializedSingleton).isEqualTo(originalSingleton);
        }
    }

    private byte[] getSerializedObject(Elvis originalSingleton) throws IOException {
        byte[] serializedObject;

        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream)) {
            Elvis elvis = Elvis.getInstance();
            objectOutputStream.writeObject(elvis);
            serializedObject = byteArrayOutputStream.toByteArray();
        }

        return serializedObject;
    }

    private static final byte[] serializedForm = {
            -84, -19, 0, 5, 115, 114, 0, 20, 107, 114, 46, 115,
            101, 111, 107, 46, 105, 116, 101, 109, 56, 57, 46, 69,
            108, 118, 105, 115, 98, -14, -118, -33, -113, -3, -32,
            70, 2, 0, 1, 91, 0, 13, 102, 97, 118, 111, 114, 105, 116,
            101, 83, 111, 110, 103, 115, 116, 0, 19, 91, 76, 106, 97,
            118, 97, 47, 108, 97, 110, 103, 47, 83, 116, 114, 105, 110,
            103, 59, 120, 112, 117, 114, 0, 19, 91, 76, 106, 97, 118,
            97, 46, 108, 97, 110, 103, 46, 83, 116, 114, 105, 110, 103,
            59, -83, -46, 86, -25, -23, 29, 123, 71, 2, 0, 0, 120, 112,
            0, 0, 0, 2, 116, 0, 9, 72, 111, 117, 110, 100, 32, 68, 111,
            103, 116, 0, 16, 72, 101, 97, 114, 116, 98, 114, 101, 97, 107,
            32, 72, 111, 116, 101, 108
    };
    @Test
    public void non_transient_공격() throws IOException, ClassNotFoundException {
        Elvis elvis = (Elvis) deserialize(serializedForm);
        Elvis impersonator = ElvisStealer.impersonator;

        assertThat(elvis.getFavorites()).isEqualTo(impersonator.getFavorites());
    }

    private Object deserialize(byte[] serializedForm) throws IOException, ClassNotFoundException {
        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(serializedForm);
             ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream)) {
            return  (Elvis) objectInputStream.readObject();
        }
    }

}