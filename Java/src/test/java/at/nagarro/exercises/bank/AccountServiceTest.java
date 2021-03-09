package at.nagarro.exercises.bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AccountServiceTest {

    @Test
    void shouldContainABalanceWithTheSumOfAllTransactions() {
        var owner = new Customer();
        owner.firstName = "Dagobert";
        owner.surName = "Duck";
        var account = new Account(owner);

        account.deposit(new Money(80.7));
        account.withdraw(new Money(7.15));

        var result = new AccountService().CreateAccountReport(account);

        // TODO check all attributes of report
        Assertions.fail("fixme - account service test");
    }

    @Test
    void shouldContainTheSumOfAllDepositTransactions() {
        var owner = new Customer();
        owner.firstName = "Dagobert";
        owner.surName = "Duck";
        var account = new Account(owner);

        account.deposit(new Money(80.7));
        account.withdraw(new Money(7.15));

        var result = new AccountService().CreateAccountReport(account);

        // TODO check all attributes of report
        Assertions.fail("fixme - account service test");
    }

    @Test
    public void shouldCreateAFullAccountReport() {
        var owner = new Customer();
        owner.firstName = "Dagobert";
        owner.surName = "Duck";
        var account = new Account(owner);

        account.deposit(new Money(12.30));
        account.withdraw(new Money(7.15));

        var result = new AccountService().CreateAccountReport(account);

        // TODO check all attributes of report
        Assertions.fail("fixme - account service test");
    }
}