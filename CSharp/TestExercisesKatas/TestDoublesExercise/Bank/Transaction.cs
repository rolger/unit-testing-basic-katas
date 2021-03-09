using System;
using System.Collections.Generic;
using System.Text;

namespace TestExercises.Bank
{
    public class Transaction
    {
        public Money Amount { get; }
        public DateTime TransactionDate { get; }

        public Transaction(Money value, DateTime transactionDate)
        {
            Amount = value;
            TransactionDate = transactionDate;
        }
    }
}
