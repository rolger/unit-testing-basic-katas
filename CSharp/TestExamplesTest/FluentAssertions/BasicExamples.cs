using FluentAssertions;
using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Text;

namespace TestExercises.FluentAssertions
{
    class ComparingDifferentStylesOfAssertions
    {
        [Test]
        public void AssertingNullWithFluent()
        {
            object theObject = null;
            theObject.Should().BeNull("because the value is null");
            theObject.Should().NotBeNull();
        }

        [Test]
        public void AssertingNullWithNUnit()
        {
            object theObject = null;
            Assert.IsNull(theObject);
            Assert.IsNotNull(theObject);
        }

        [Test]
        public void AssertingBooleansWithFluent()
        {
            bool theBooleanFoo = true;
            theBooleanFoo.Should().BeTrue();
            theBooleanFoo.Should().BeFalse();
        }

        [Test]
        public void AssertingBooleansWithNUnit()
        {
            bool theBooleanFoo = true;
            Assert.IsTrue(theBooleanFoo);
            Assert.IsFalse(theBooleanFoo);
        }
    }
}
