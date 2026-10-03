package lab.m01.w01.d05;

import java.util.EnumMap;
import java.util.List;

enum OrderStatus{
    NEW,PAID,SHIPPED,DELIVERED,CANCELLED;

    private static final EnumMap<OrderStatus, List<OrderStatus>> stateOfOrder = new EnumMap<>(OrderStatus.class);
    static {
        stateOfOrder.put(NEW, List.of(PAID,CANCELLED));
        stateOfOrder.put(PAID, List.of(SHIPPED,CANCELLED));
        stateOfOrder.put(SHIPPED, List.of(DELIVERED,CANCELLED));
        stateOfOrder.put(DELIVERED, List.of());
        stateOfOrder.put(CANCELLED, List.of());
    }

    public boolean canTransitionTo(OrderStatus status){
        List<OrderStatus> acceptState = List.copyOf(stateOfOrder.get(this));
        return acceptState.contains(status);
    }

    public boolean allowedNextStates(){
        List<OrderStatus> acceptState = List.copyOf(stateOfOrder.get(this));
        return !acceptState.isEmpty();
    }

    public boolean isTerminate(){
        List<OrderStatus> acceptState = List.copyOf(stateOfOrder.get(this));
        return acceptState.isEmpty();
    }
}