package org.example.item8;

public class AutoClosableIsGoodApp {
    public static void main(String[] args) throws Exception {
        try(AutoClosableIsGood good = new AutoClosableIsGood()) {
            // TODO 자원 반납 처리
        }
    }
}
