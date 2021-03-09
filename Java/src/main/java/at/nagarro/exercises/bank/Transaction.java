package at.nagarro.exercises.bank;

import java.time.LocalDate;

public class Transaction {
    public Money amount;
    public LocalDate transactionDate;

    public Transaction(Money value, LocalDate transactionDate) {
        this.amount = value;
        this.transactionDate = transactionDate;
    }
}