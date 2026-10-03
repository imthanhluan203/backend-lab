package lab.m01.w01.d05;

import lab.m01.w01.d04.Money;

public class Main {
    public static void main(String[] args) {
        OrderStateMachine machine1 = new OrderStateMachine(OrderStatus.NEW,OrderStatus.PAID);
 //       OrderStateMachine machine2 = new OrderStateMachine(OrderStatus.NEW,OrderStatus.SHIPPED);
        OrderStateMachine machine3 = new OrderStateMachine(OrderStatus.PAID,OrderStatus.SHIPPED);
        OrderStateMachine machine4 = new OrderStateMachine(OrderStatus.SHIPPED,OrderStatus.DELIVERED);
        OrderStateMachine machine5 = new OrderStateMachine(OrderStatus.NEW,OrderStatus.CANCELLED);
        System.out.println(machine1.transition());
 //       System.out.println(machine2.transition());
        System.out.println(machine3.transition());
        System.out.println(machine4.transition());
        System.out.println(machine5.transition());

        Money myPocket = Money.of("1000000","VND");
        System.out.println(DiscountRule.BLACK_FRIDAY.doDiscount(myPocket));

    }
}
