package at.nagarro.exercises.bank;

import java.math.BigDecimal;

public class AccountService {
    public AccountReport CreateAccountReport(Account account) {
        var report = new AccountReport();

        report.balance = account.getBalance();
        report.owner = account.getOwner().fullName();
        report.sumOfDeposits = account.getTransactions().stream()
                .map(transaction -> transaction.amount.getValue())
                .filter(decimal -> decimal.compareTo(BigDecimal.ZERO) > 0)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        report.sumOfWithdrawals = account.getTransactions().stream()
                .map(transaction -> transaction.amount.getValue())
                .filter(decimal -> decimal.compareTo(BigDecimal.ZERO) < 0)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        report.lastTransactionDay = account.getLastTransactionDate();

        return report;
    }
}
