package org.example.item3;

public class MetaElvis<T> {

    private static final MetaElvis<Object> INSTANCE = new MetaElvis<>();
    private MetaElvis() {}

    @SuppressWarnings("unchecked")
    public static <T> MetaElvis<T> getInstance() { return (MetaElvis<T>) INSTANCE; }

    public static void main(String[] args) {
        MetaElvis<String> e1 = MetaElvis.getInstance();
        MetaElvis<Integer> e2 = MetaElvis.getInstance();
        System.out.println(e1.equals(e2)); // hashcode 같으므로 true
//        System.out.println(e1 == e2); // 타입 달라서 == 비교 불가능
    }

}
