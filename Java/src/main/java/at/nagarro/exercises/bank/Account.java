package at.nagarro.exercises.bank;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Account {
    private Customer owner;
    private Money balance;
    private LocalDate lastTransactionDate;
    private List<Transaction> transactions;

    public Account(Customer owner) {
        this.owner = owner;
        this.balance = new Money(0);
        this.transactions = new ArrayList<Transaction>();
    }

    public Customer getOwner() {
        return owner;
    }

    public Money getBalance() {
        return balance;
    }

    public LocalDate getLastTransactionDate() {
        return lastTransactionDate;
    }

    public List<Transaction> getTransactions() {
        return transactions.stream()
                .sorted((t1, t2) -> t1.amount.getValue().compareTo(t2.amount.getValue()))
                .collect(Collectors.toList());
    }

    public void deposit(Money amount) {
        if (amount.getValue().compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount less than minimum amount of 0.00");
        }

        this.balance = balance.add(amount);
        this.lastTransactionDate = LocalDate.now();
        this.transactions.add(new Transaction(amount, lastTransactionDate));
    }

    public void withdraw(Money amount) {
        if (amount.getValue().compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount less than minimum amount of 0.00");
        }

        if (amount.getValue().compareTo(new BigDecimal(1000)) > 0) {
            throw new IllegalArgumentException("Amount more than maximum amount of 1000.00");
        }

        this.balance = balance.add(amount.multiply(-1));
        this.lastTransactionDate = LocalDate.now();
        this.transactions.add(new Transaction(amount, lastTransactionDate));
    }
}
