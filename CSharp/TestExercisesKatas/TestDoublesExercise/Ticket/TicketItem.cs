using System;

namespace TestExercises.Ticket
{
    public class TicketItem
    {
        public Category Category { get; set; }

        public TicketItem(Category category)
        {
            this.Category = category;
        }

        public decimal GetPrice()
        {
            return Category.GetPrice();
        }

    }
}
