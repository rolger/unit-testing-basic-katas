package at.nagarro.exercises.bank;

import java.time.LocalDate;

public class Customer {
    public String firstName;
    public String surName;
    public LocalDate birthday;
    public Adress adress;

    public String fullName() {
        return firstName.toLowerCase() + " " + surName;
    }

    public String email() {
        return firstName.toLowerCase() + "." + surName.toLowerCase() + "@mybank.com";
    }

}