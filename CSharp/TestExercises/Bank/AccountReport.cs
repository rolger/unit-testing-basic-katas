using System;

namespace TestExercises.Bank
{
    public class AccountReport
    {
        public AccountReport()
        {
        }

        public Money Balance { get; internal set; }
        public string Owner { get; internal set; }
        public decimal SumOfWithdrawals { get; internal set; }
        public decimal SumOfDeposits { get; internal set; }
        public DateTime LastTransactionDay { get; internal set; }
    }
}