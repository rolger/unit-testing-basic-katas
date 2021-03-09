using System;
using System.Collections.Generic;
using System.Text;

namespace TestExercises.Bank
{
    public class Customer
    {
        public string FirstName { get; set; }
        public string SurName { get; set; }
        public DateTime Birthday { get; set; }
        public Adress Adress { get; set; }

        public string FullName()
        {
            return FirstName.ToLower() + " " + SurName;
        }

        public string Email()
        {
            return FirstName.ToLower() + "." + SurName.ToLower() + "@mybank.com";
        }

    }
}
