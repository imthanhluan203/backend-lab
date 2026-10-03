package lab.m01.w01.d05;

import lab.m01.w01.d04.Money;

import java.math.BigDecimal;

public enum DiscountRule {
    NONE {
        @Override
        Money doDiscount(Money m) {
            return m;
        }
    },
    TEN_PERCENT {
        @Override
        Money doDiscount(Money m) {
            return m.mutiply(BigDecimal.valueOf(0.9));
        }
    },
    FLAT_50K {
        @Override
        Money doDiscount(Money m) {
            return m.minus(BigDecimal.valueOf(50000));
        }
    },
    BLACK_FRIDAY {
        @Override
        Money doDiscount(Money m) {
            return m.mutiply(BigDecimal.valueOf(0.6));
        }
    };

    abstract Money doDiscount(Money m);
}
