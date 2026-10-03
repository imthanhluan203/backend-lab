package lab.m01.w01.d03;

public sealed interface Transaction permits Deposit, Withdrawal, Transfer, FeeCharge {
    int amountOfMoney();
    int time();
}
