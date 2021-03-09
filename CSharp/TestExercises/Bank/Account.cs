using System;
using System.Collections.Generic;
using System.Linq;

namespace TestExercises.Bank
{
    public class Account
    {
        public Customer Owner { get; }
        public Money Balance { get; private set; }
        public DateTime LastTransactionDate { get; private set; }

        public List<Transaction> transactions;

        public Account(Customer owner)
        {
            Owner = owner;
            Balance = new Money(0);
            transactions = new List<Transaction>();
        }

        public IEnumerable<Transaction> GetTransactions()
        {
            return transactions.OrderBy(t => t.Amount.AsDecimal());
        }

        public void Deposit(Money amount)
        {
            if (0 >= amount.AsDecimal())
            {
                throw new ArgumentException("Amount less than minimum amount of 0.00");
            }

                Balance = Balance.Add(amount);
            LastTransactionDate = DateTime.Now;
            transactions.Add(new Transaction(amount, LastTransactionDate));
        }
        public void Withdraw(Money amount)
        {
            if (0 >= amount.AsDecimal())
            {
                throw new ArgumentException("Amount less than minimum amount of 0.00");
            }

            if (1000 < amount.AsDecimal())
            {
                throw new ArgumentException("Amount more than maximum amount of 1000.00");
            }

            Balance = Balance.Add(new Money(amount.AsDecimal() * -1));
            LastTransactionDate = DateTime.Now;
            transactions.Add(new Transaction(new Money(amount.AsDecimal() * -1), LastTransactionDate));
        }
    }
}
