using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace TestExercises.Bank
{
    public class AccountService
    {
        public AccountReport CreateAccountReport(Account account)
        {
            var report = new AccountReport();

            report.Balance = account.Balance;
            report.Owner = account.Owner.FullName();
            report.SumOfDeposits = account.GetTransactions()
                .Where(transaction => transaction.Amount.AsDecimal() > 0)
                .Sum(transaction => transaction.Amount.AsDecimal());
            report.SumOfWithdrawals = account.GetTransactions()
                .Where(transaction => transaction.Amount.AsDecimal() < 0)
                .Sum(transaction => transaction.Amount.AsDecimal());
            report.LastTransactionDay = new DateTime(account.LastTransactionDate.Year, account.LastTransactionDate.Month, account.LastTransactionDate.Day, 0, 0, 0);

            return report;
        }
    }
}
