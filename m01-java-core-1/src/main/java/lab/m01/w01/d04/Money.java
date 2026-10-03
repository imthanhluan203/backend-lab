package lab.m01.w01.d04;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Objects;

public final class Money implements Comparable<Money> {
    private BigDecimal amountOfMoney;
    private Currency typeOfMoney;
    private Money(BigDecimal amountOfMoney, Currency typeOfMoney){
        this.amountOfMoney = amountOfMoney;
        this.typeOfMoney = typeOfMoney;
    }
    public static Money of(String amountOfMoney, String countryCode){
        return new Money(BigDecimal.valueOf(Double.parseDouble(amountOfMoney)), Currency.getInstance(countryCode));
    }

    public static Money zero(Currency typeOfMoney){
        return new Money(BigDecimal.ZERO, typeOfMoney);
    }

    public Money plus(BigDecimal amountOfMoney){
        return Money.of(this.amountOfMoney.add(amountOfMoney).toString(),typeOfMoney.getCurrencyCode());
    }

    public Money minus(BigDecimal amountOfMoney){
        return Money.of(this.amountOfMoney.subtract(amountOfMoney).toString(),typeOfMoney.getCurrencyCode());
    }

    public Money mutiply(BigDecimal percent){
        return Money.of(this.amountOfMoney.multiply(percent).toString(),typeOfMoney.getCurrencyCode());
    }

    public Money negate(){
        return Money.of(BigDecimal.ZERO.subtract(amountOfMoney).toString(),typeOfMoney.getCurrencyCode());
    }

    public boolean isNegative(){
        return this.amountOfMoney.compareTo(BigDecimal.ZERO) < 0;
    }

    @Override
    public int compareTo(Money o) {
        if(!Objects.equals(typeOfMoney,o.typeOfMoney)){
            throw new CurrencyMismatchException();
        }
        if((this.amountOfMoney.subtract(o.amountOfMoney).compareTo(BigDecimal.ZERO)) == 0){
            return 0;
        }
        return (this.amountOfMoney.subtract(o.amountOfMoney).compareTo(BigDecimal.ZERO)) > 0 ? 1 : -1;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Money money)) return false;
        return Objects.equals(amountOfMoney, money.amountOfMoney) && Objects.equals(typeOfMoney, money.typeOfMoney);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOfMoney, typeOfMoney);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amountOfMoney=" + amountOfMoney +
                ", typeOfMoney=" + typeOfMoney +
                '}';
    }
}
