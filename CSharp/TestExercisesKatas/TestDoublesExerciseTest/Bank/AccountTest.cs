using FluentAssertions;
using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Text;
using TestExercises.Bank;

namespace TestExercises.Bank
{
    class AccountTest
    {
        private static Customer DagobertDuck()
        {
            var owner = new Customer();
            owner.FirstName = "Dagobert";
            owner.SurName = "Duck";
            return owner;
        }

        [Test]
        public void DepositInvalidAmounts_ShouldThrowAnException()
        {
            var sut = new Account(DagobertDuck());

            sut.Deposit(new Money(0));

            // TODO check that exception is thrown
            Assert.Fail("fixme - account test");
        }

        [Test]
        public void WithdrawalInvalidAmounts_ShouldThrowAnException()
        {
            var sut = new Account(DagobertDuck());

            sut.Withdraw(new Money(-10));

            // TODO check that exception is thrown
            Assert.Fail("fixme - account test");

            sut.Withdraw(new Money(1000000000));

            // TODO check that exception is thrown
            Assert.Fail("fixme - account test");
        }

        [Test]
        public void DepositSomeAmount_ShouldIncreaseTheBalance()
        {
            var sut = new Account(DagobertDuck());

            sut.Deposit(new Money(1000000));

            // TODO check that the balance is correct
            Assert.Fail("fixme - account test");
        }

        [Test]
        public void AfterSomeBookingsOnAnAmount_TransactionLogShouldContainAllInSameOrder()
        {
            var sut = new Account(DagobertDuck());

            sut.Deposit(new Money(1200100));
            sut.Withdraw(new Money(1450));
            sut.Deposit(new Money(140));

            // TODO check that transactions are correct
            Assert.Fail("fixme - account test");
        }
    }
}
