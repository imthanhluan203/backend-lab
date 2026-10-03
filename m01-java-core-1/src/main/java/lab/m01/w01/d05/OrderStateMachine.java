package lab.m01.w01.d05;

public class OrderStateMachine {

    private OrderStatus current;
    private OrderStatus target;

    public OrderStateMachine(OrderStatus current,OrderStatus target){
        this.current = current;
        this.target = target;
    }

    class IllegalStateTransitionException extends RuntimeException{
        public IllegalStateTransitionException(OrderStatus current, OrderStatus target) {
            super(String.format("This invalid transition: %s --> %s",current,target));
        }
    }

    public OrderStatus transition(){
        if(!current.canTransitionTo(target)){
            throw new IllegalStateTransitionException(current,target);
        }
        return target;
    }
}
