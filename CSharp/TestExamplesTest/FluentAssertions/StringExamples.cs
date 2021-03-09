using FluentAssertions;
using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Text;

namespace TestExercises.FluentAssertions
{
    class ComparingDifferentStringAssertions
    {
        [Test]
        public void AssertingStringBasicsWithFluent()
        {
            string theString = " ";
            theString.Should().NotBeNull();
            theString.Should().NotBeEmpty();
            theString.Should().HaveLength(1);
            theString.Should().BeNullOrWhiteSpace();
            theString.Should().NotBeNullOrWhiteSpace();
        }

        [Test]
        public void AssertingStringContentWithFluent()
        {
            var theString = "This is a String";
            theString.Should().Be("This is a String");
            theString.Should().NotBe("This is another String");
            theString.Should().BeEquivalentTo("THIS IS A STRING");

            theString.Should().Contain("is a");
            theString.Should().ContainAll("String", "a");
            theString.Should().ContainAny("any", "of", "these", "will", "do", "This");
            theString.Should().NotContain("is a");
            theString.Should().NotContainAll("can", "contain", "some", "but", "not", "all");
            theString.Should().NotContainAny("can't", "contain", "any", "of", "these");
            theString.Should().ContainEquivalentOf("WE DONT CARE ABOUT THE CASING");
            theString.Should().NotContainEquivalentOf("HeRe ThE CaSiNg Is IgNoReD As WeLl");

            theString.Should().StartWith("This");
            theString.Should().NotStartWith("This-");
            theString.Should().StartWithEquivalent("this");
            theString.Should().NotStartWithEquivalentOf("_this");

            theString.Should().EndWith("a String");
            theString.Should().NotEndWith("an String");
            theString.Should().EndWithEquivalent("a string");
            theString.Should().NotEndWithEquivalentOf("a string");
        }
    }
}
