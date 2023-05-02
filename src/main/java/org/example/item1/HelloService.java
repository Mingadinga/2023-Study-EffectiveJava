package org.example.item1;

public interface HelloService {

    String hello();

    // default : public
    public static HelloService of(String lang) {
        if (lang.equals("ko")) {
            return new KoreanHelloService();
        } else if (lang.equals("en")) {
            return new EnglishHelloService();
        }
        return new NoneHelloService();
    }

}
