package org.example.item1;

/**
 * 이 클래스의 인스턴스는 #newInstanceWithName과 #newInstanceWithAddress를 사용.
 * @see Item1#name
 * @see Item1#address
 *
 */
public class Item1 {

    String name;
    String address;

    public Item1() {}

    public Item1(String name) {
        this.name = name;
    }

    public static Item1 newInstanceWithName(String name) {
        return new Item1(name);
    }

    public static Item1 newInstanceWithAddress(String address) {
        Item1 item1 = new Item1();
        item1.setAddress(address);
        return item1;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        // 생성자만 사용하는 것보다 가독성 좋다
        Item1 i1 = new Item1("Min");
        Item1.newInstanceWithName("Min");

        // 매개변수 타입 같아도 이름으로 구분 가능
        Item1.newInstanceWithName("Min");
        Item1.newInstanceWithAddress("경기도");
    }


}
