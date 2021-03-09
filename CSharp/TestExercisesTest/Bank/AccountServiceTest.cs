using FluentAssertions;
using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Text;
using TestExercises.Bank;

namespace TestExercises.Bank
{
    class AccountServiceTest
    {
        [Test]
        public void ShouldCreateAccounntReport()
        {
            var owner = new Customer();
            owner.FirstName = "Dagobert";
            owner.SurName = "Duck";
            var account = new Account(owner);

            account.Deposit(new Money(12.30m));

            var result = new AccountService().CreateAccountReport(account);

            // TODO check all attributes of report
            Assert.Fail("fixme - account service test");
        }
    }
}
