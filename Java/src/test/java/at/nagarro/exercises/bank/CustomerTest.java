package at.nagarro.exercises.bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CustomerTest {

    @Test
    public void fullNameContainsFirstNameAndSurName() {
        var sut = new Customer();
        sut.firstName = "Donald";
        sut.surName = "Duck";

        // TODO should start with first name
        Assertions.fail("fixme - customer test");

        // TODO should end with last name
        Assertions.fail("fixme - customer test");
    }

    @Test
    public void eMailContainsFirstNameAndSurNameAndEMailServer() {
        var sut = new Customer();
        sut.firstName = "Donald";
        sut.surName = "Duck";

        // TODO should contain following strings: Donald, Duck, mybank.com
        Assertions.fail("fixme - customer test");
    }
}
