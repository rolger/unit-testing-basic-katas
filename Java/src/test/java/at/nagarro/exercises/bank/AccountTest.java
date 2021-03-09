package at.nagarro.exercises.bank;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class AccountTest {
    private static Customer DagobertDuck() {
        var owner = new Customer();
        owner.firstName = "Dagobert";
        owner.surName = "Duck";
        return owner;
    }

    @Test
    public void depositWithInvalidAmounts_ShouldThrowAnException() {
        var sut = new Account(DagobertDuck());

        sut.deposit(new Money(0));

        // TODO check that exception is thrown
        Assertions.fail("fixme - account test");
    }

    @Test
    public void withdrawWithInvalidAmounts_ShouldThrowAnException() {
        var sut = new Account(DagobertDuck());

        sut.withdraw(new Money(-10));

        // TODO check that exception is thrown
        Assertions.fail("fixme - account test");

        sut.withdraw(new Money(1000000000));

        // TODO check that exception is thrown
        Assertions.fail("fixme - account test");
    }

    @Test
    public void depositSomeAmount_ShouldIncreaseTheBalance() {
        var sut = new Account(DagobertDuck());

        sut.deposit(new Money(1000000));

        // TODO check that the balance is correct
        Assertions.fail("fixme - account test");
    }

    @Test
    public void givenSomeBookingsOnAnAmount_ThenTransactionsAreOrderByAmount() {
        var sut = new Account(DagobertDuck());

        sut.deposit(new Money(1200100));
        sut.withdraw(new Money(1450));
        sut.deposit(new Money(140));

        // TODO check that transactions are correct
        Assertions.fail("fixme - account test");
    }
}