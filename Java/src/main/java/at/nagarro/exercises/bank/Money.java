package at.nagarro.exercises.bank;

import java.math.BigDecimal;

public class Money {
    private BigDecimal value;

    public Money(double value) {
        this.value = new BigDecimal(value);
    }

    public Money(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }

    public Money add(Money other) {
        return new Money(value.add(other.value));
    }

    public Money percentage(int p) {
        return new Money(value.multiply(new BigDecimal(p / 100)));
    }

    public Money multiply(int multiplicand) {
        return new Money(this.getValue().multiply(new BigDecimal(multiplicand)));
    }

    public String format() {
        return String.format("{0:0.00}", value);
    }

}
