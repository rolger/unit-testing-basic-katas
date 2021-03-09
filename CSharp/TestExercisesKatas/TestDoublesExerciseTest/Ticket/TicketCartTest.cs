using FluentAssertions;
using NUnit.Framework;

namespace TestExercises.Ticket
{
    public class TicketCartTest
    {
        [Test]
        public void WhenCartIsEmptyThenNoTicketsAreFound()
        {
            var cart = new TicketCart();

            var ticks = cart.FindTickets("#1");

            // TODO check that the result is empty
            Assert.Fail("fixme - ticket system");
        }

        [Test]
        public void ShouldContainATicketWithSameReservationNumber()
        {
            var cart = new TicketCart();
            cart.AddTicket("#1", Category.A);

            var ticks = cart.FindTickets("#1");

            // TODO there should be one ticket
            Assert.Fail("fixme - ticket system");
        }

        [Test]
        public void CheckAllTicketsOfMultipleReservations()
        {
            var cart = new TicketCart();
            cart.AddTicket("#1", Category.A);
            cart.AddTicket("#1", Category.B);
            cart.AddTicket("#1", Category.C);
            cart.AddTicket("#2", Category.A);

            // TODO there should be 3 tickets and 1 ticket
            Assert.Fail("fixme - ticket system");
        }

    }
}