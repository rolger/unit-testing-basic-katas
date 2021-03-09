using System;
using System.Collections.Generic;
using System.Linq;
using TestExercises;

namespace TestExercises.Ticket
{
    public class TicketCart
    {
        private Dictionary<string, List<TicketItem>> tickets = new Dictionary<string, List<TicketItem>>();

        public void AddTicket(string reservationNumber, Category category)
        {
            if (!tickets.ContainsKey(reservationNumber))
            {
                tickets.Add(reservationNumber, new List<TicketItem>());
            }

            tickets[reservationNumber].Add(new TicketItem(category));
        }

        public IEnumerable<TicketItem> FindTickets(string reservationNumber)
        {
            List<TicketItem> value;
            return tickets.TryGetValue(reservationNumber, out value) ? value : Enumerable.Empty<TicketItem>();
        }

    }

}
