package lab.m01.w01.d01;

import java.math.BigDecimal;

class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(){
        super("Cannot widthraw amount of money more than banlance");
    }
}

public class BankAccount {
    private final String id;
    private final String owner;
    private BigDecimal balance;

    public BankAccount(String id, String owner, BigDecimal balance) {
        if(id.isEmpty()){
            throw new IllegalArgumentException("Id cannot empty");
        }
        if(owner.isEmpty()){
            throw new IllegalArgumentException("Owner cannot empty");
        }
        if(balance.compareTo(BigDecimal.ZERO) < 0){
            throw new IllegalArgumentException("Balance cannot negative");
        }
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(BigDecimal num){
       this.balance = this.balance.add(num);
    }

    public void widthDraw(BigDecimal num) {
        if(num.compareTo(BigDecimal.ZERO) < 0){
            throw new IllegalArgumentException("Cannot widthrow negative number");
        }
        if(this.balance.compareTo(num) < 0){
            throw new InsufficientFundsException();
        }
        this.balance = this.balance.subtract(num);
    }

    public BigDecimal getBalance() {
        return balance;
    }
}

