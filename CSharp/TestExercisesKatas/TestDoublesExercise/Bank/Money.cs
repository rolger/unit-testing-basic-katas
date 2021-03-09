using System;
using System.Collections.Generic;
using System.Text;

namespace TestExercises.Bank
{
    public class Money
    {
        private decimal value;

        public Money(int value) => this.value = value;

        public Money(decimal value) => this.value = value;

        public Money Add(Money other)
        {
            return new Money(value + other.value);
        }

        public Money Percentage(int p)
        {
            return new Money(value * p / 100);
        }

        public string Format()
        {
            return string.Format("{0:0.00}", value);
        }

        public decimal AsDecimal()
        {
            return value;
        }
    }
}