
namespace TestExercises.Ticket
{
    public enum Category { A, B, C };
    public static class CategoryExtensions
    {
        public static decimal GetPrice(this Category category)
        {
            switch (category)
            {
                case Category.A:
                    return 98.50M;

                case Category.B:
                    return 72M;

                case Category.C:
                    return 49.5M;

                default:
                    throw new System.ArgumentException();
            }
        }
    }
}
