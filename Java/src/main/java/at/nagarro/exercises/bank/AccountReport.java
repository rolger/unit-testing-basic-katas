package at.nagarro.exercises.bank;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AccountReport {
    public Money balance;
    public String owner;
    public BigDecimal sumOfWithdrawals;
    public BigDecimal sumOfDeposits;
    public LocalDate lastTransactionDay;
}
