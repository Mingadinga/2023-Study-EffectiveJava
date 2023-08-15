package org.example.item60;

public class Change {
    // 부동소수타입(double) 사용
    public static void main(String[] args) {
        double funds = 1.00;
        int itemsBought = 0;
        for (double price = 0.10; price <= funds; price += 0.10) {
            funds -= price;
            itemsBought++;
        }
        System.out.println(itemsBought + " items bought.");
        System.out.println("Change: $" + funds);

    }
}

/* 실제 출력 결과
3 items bought.
Change: $0.3999999999999999
 */

/* 의도한 결과
4 items bought.
Change: $0
 */