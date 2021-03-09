using FluentAssertions;
using NUnit.Framework;

namespace TestExercises.Bank
{
    class CustomerTest
    {
        [Test]
        public void FullNameConsistFirstNameAndSurName()
        {
            var sut = new Customer();
            sut.FirstName = "Donald";
            sut.SurName = "Duck";

            // TODO should start with first name
            Assert.Fail("fixme - customer test");

            // TODO should end with last name
            Assert.Fail("fixme - customer test");
        }

        [Test]
        public void EMailContainFirstNameAndSurNameAndEMailServer()
        {
            var sut = new Customer();
            sut.FirstName = "Donald";
            sut.SurName = "Duck";

            // TODO should contain following strings: Donald, Duck, mybank.com
            Assert.Fail("fixme - customer test");
        }
    }
}
